package com.github.uryyyyyyy.samples.ficus

object Main {

	def main(args: Array[String]): Unit = {
		val s = ConfigSample.getInt("foo.bar")
		println(s)

		val ss = ConfigSample.getConfig("foo")
		println(ss)

		val sss = ConfigSample.getList("foo.list")
		println(sss)
	}

}