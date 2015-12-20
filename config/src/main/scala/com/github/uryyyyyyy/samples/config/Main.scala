package com.github.uryyyyyyy.samples.config


object Main {
	def main(args: Array[String]) {
		val s = ConfigSample.getInt("foo.bar")
		println(s)

		val ss = ConfigSample.getConfig("foo")
		println(ss)
	}
}
