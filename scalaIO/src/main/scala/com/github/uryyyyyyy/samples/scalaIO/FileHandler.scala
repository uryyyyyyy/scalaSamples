package com.github.uryyyyyyy.samples.scalaIO

import scala.io.Source

object FileHandler {

	type Closable = { def close() }
	def using[R <: Closable, A](resource: R)(f: R => A): A = {
		try f(resource) finally try resource.close() catch { case scala.util.control.NonFatal(_) => }
	}

	def readChars(filename: String): Seq[Char] = {
		using(Source.fromFile(filename, "utf-8")) { f =>
			f.toIndexedSeq
		}
	}

	def readLines(filename: String): Seq[String] = {
		using(Source.fromFile(filename, "utf-8")) { f =>
			f.getLines.toIndexedSeq
		}
	}
}