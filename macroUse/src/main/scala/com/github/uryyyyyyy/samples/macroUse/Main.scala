package com.github.uryyyyyyy.samples.macroUse

import com.github.uryyyyyyy.samples.macroDefine.Demo

object Main {
	def main(args: Array[String]) {
		val s = Demo.desugar(List(6, 4, 5).sorted)
		println(s)
	}
}
