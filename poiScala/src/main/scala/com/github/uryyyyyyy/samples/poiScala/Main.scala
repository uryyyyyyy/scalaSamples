package com.github.uryyyyyyy.samples.poiScala

import info.folone.scala.poi._

object Main{
	def main (args: Array[String] ) {
		val sheetOne = Workbook {
			Set(Sheet("name") {
				Set(Row(1) {
					Set(NumericCell(1, 13.0/5), FormulaCell(2, "ABS(A1)"))
				},
					Row(2) {
						Set(StringCell(1, "data"), StringCell(2, "data2"))
					})
			},
				Sheet("name2") {
					Set(Row(2) {
						Set(BooleanCell(1, true), NumericCell(2, 2.4))
					})
				})
		}

		val path = "./workbook.xls"
		sheetOne.safeToFile(path).fold(ex => throw ex, identity).unsafePerformIO
	}
}