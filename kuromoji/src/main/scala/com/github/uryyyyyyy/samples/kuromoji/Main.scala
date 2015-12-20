package com.github.uryyyyyyy.samples.kuromoji

import org.apache.lucene.analysis.ja.dict.UserDictionary
import org.apache.lucene.analysis.ja.{JapaneseTokenizer, JapaneseAnalyzer}
import org.apache.lucene.analysis.util.CharArraySet
import scala.collection.JavaConverters._

object Main {

	def main(args:Array[String]) {
//		analyze()
//		tokenize()
		suggest()
	}

	def tokenize() {
		val userDictionary: UserDictionary = null
		val analyzer = new JapaneseAnalyzer(
			userDictionary,
			JapaneseTokenizer.Mode.NORMAL,
			new CharArraySet(0, true),
			Set.empty[String].asJava)

		val tokens2 = KuromojiAnalyzer.toTokens("お寿司が食べたい。", analyzer)
		tokens2.foreach(token => println(token.katakana + ", " +  token.romaji))
	}

	def analyze() {
		val tokens = KuromojiSample.analyze("お寿司が食べたい。")
		tokens.foreach(token => println(token.getSurface + "\t" + token.getAllFeatures))
	}

	def suggest() {
		val text = "磯野カツオ"
		val candidates = Seq(
			"磯野カケヲ",
			"蟻野カケヲ",
			"磯崎カケヲ",
			"磯野タモツ",
			"及川シゲオ",
			"只野カツオ"
		)
		val res = LuceneSuggest.suggest(text, candidates, 0.01f, 6)
		res.foreach(println)
	}
}