//package com.github.uryyyyyyy.samples.kuromoji
//
//import com.atilika.kuromoji.Tokenizer
//import com.atilika.kuromoji.Token
//
//object KuromijiSample {
//
//	def analyze(text:String) {
//		val tokenizer = Tokenizer.builder.mode(Tokenizer.Mode.NORMAL).build
//
//		val tokens = tokenizer.tokenize(text).toArray
//
//		tokens.foreach { t =>
//			val token = t.asInstanceOf[Token]
//			println(s"${token.getSurfaceForm} - ${token.getAllFeatures}")
//		}
//	}
//}