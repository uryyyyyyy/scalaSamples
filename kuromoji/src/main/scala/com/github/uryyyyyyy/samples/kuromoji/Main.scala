package com.github.uryyyyyyy.samples.kuromoji

import org.apache.lucene.analysis.ja.dict.UserDictionary
import org.apache.lucene.analysis.ja.{JapaneseTokenizer, JapaneseAnalyzer}
import org.apache.lucene.analysis.util.CharArraySet
import scala.collection.JavaConverters._

object Main {

	def main(args:Array[String]) {
//		val tokens = KuromojiSample.analyze("お寿司が食べたい。")
//		tokens.foreach(token => println(token.getSurface + "\t" + token.getAllFeatures))


		val userDictionary: UserDictionary = null
		val analyzer = new JapaneseAnalyzer(
			userDictionary,
			JapaneseTokenizer.Mode.NORMAL,
			new CharArraySet(0, true),
			Set.empty[String].asJava)

		val tokens2 = KuromojiAnalyzer.toTokens("お寿司が食べたい。", analyzer)
		tokens2.foreach(token => println(token.katakana + ", " +  token.romaji))
	}
}