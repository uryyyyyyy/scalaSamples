package com.github.uryyyyyyy.samples.kuromoji

import com.atilika.kuromoji.ipadic.Token
import com.atilika.kuromoji.ipadic.Tokenizer
import scala.collection.mutable
import scala.collection.JavaConversions._

object KuromojiSample {

	def analyze(text:String):mutable.Buffer[Token] = {
		val tokenizer: Tokenizer = new Tokenizer
		val tokens: mutable.Buffer[Token] = tokenizer.tokenize(text)
		tokens
	}
}