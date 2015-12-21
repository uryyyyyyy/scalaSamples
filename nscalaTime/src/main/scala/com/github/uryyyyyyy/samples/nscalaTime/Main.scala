package com.github.uryyyyyyy.samples.nscalaTime

import com.github.nscala_time.time.Imports._

object Main {

	def main(args: Array[String]) {
		val d1 = DateTime.now + 2.months
		println(d1)

		val d2 = DateTime.nextMonth < DateTime.now + 2.months // returns Boolean = true
		println(d2)

		val d3 = DateTime.now to DateTime.tomorrow  // return org.joda.time.Interval = > 2009-04-27T13:47:14.840/2009-04-28T13:47:14.840
		println(d3)

		val d4 = (DateTime.now to DateTime.nextSecond).millis // returns Long = 1000
		println(d4)

		val d5 = 2.hours + 45.minutes + 10.seconds
		println(d5)

		val d6 = (2.hours + 45.minutes + 10.seconds).millis
		println(d6)

		val d7 = 2.months + 3.days
		println(d7)
	}
}