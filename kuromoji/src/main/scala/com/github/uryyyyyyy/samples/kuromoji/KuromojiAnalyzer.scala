package com.github.uryyyyyyy.samples.kuromoji

import org.apache.lucene.analysis.ja.JapaneseAnalyzer
import org.apache.lucene.analysis.ja.tokenattributes.ReadingAttribute
import org.apache.lucene.analysis.ja.util.ToStringUtil
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute

import scala.collection.mutable.ListBuffer
import scala.util.Try

case class KuromojiToken(term: String, katakana: String, romaji: String)



object KuromojiAnalyzer {

	type Closable = { def close() }

	def using[R <: Closable, A](resource: R)(f: R => A): A = {
		try {
			f(resource)
		} finally {
			try {
				resource.close()
			} catch {
				case scala.util.control.NonFatal(_) =>
			}
		}
	}

	//from skinny-framework
	def toTokens(str: String, kuromojiAnalyzer: JapaneseAnalyzer): Seq[KuromojiToken] = {
		using(kuromojiAnalyzer.tokenStream("katakana-conversion", str)) { stream =>
			val charTermAttr = stream.addAttribute(classOf[CharTermAttribute])
			val readingAttr = stream.addAttribute(classOf[ReadingAttribute])

			val tokens = new ListBuffer[KuromojiToken]
			stream.reset()
			while (Try(stream.incrementToken()).getOrElse(true)) {
				val original = charTermAttr.toString
				if (original != null) {
					val katakana = if (readingAttr.getReading != null) readingAttr.getReading else original
					val romaji = ToStringUtil.getRomanization(katakana)
					val token = KuromojiToken(original, katakana, romaji)
					tokens.append(token)
				}
			}
			println(s"Tokenized results: ${tokens}")

			var previous: KuromojiToken = null
			val distinctTokens = new ListBuffer[KuromojiToken]
			tokens.foreach { current =>
				if (previous != null) {
					if (current.term.contains(previous.term)) {
						distinctTokens.remove(distinctTokens.size - 1)
						distinctTokens.append(current)
					} else if (previous.term.contains(current.term)) {
						// NOOP
					} else {
						distinctTokens.append(current)
					}
				} else {
					distinctTokens.append(current)
				}
				previous = current
			}
			distinctTokens.toSeq
		}
	}
}
