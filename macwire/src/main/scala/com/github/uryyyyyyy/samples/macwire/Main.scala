package com.github.uryyyyyyy.samples.macwire

class DatabaseAccess(str:String){
	def echo(): Unit ={
		println(str)
	}
}
class UserFinder(databaseAccess: DatabaseAccess){
	def superEcho(): Unit ={
		print("super ")
		databaseAccess.echo()
	}
}

class Module1() {
	import com.softwaremill.macwire._
	val theDatabaseAccess   = new DatabaseAccess("hello")
	val theUserFinder       = wire[UserFinder]
}

object Main {
	def main (args: Array[String]) {
		val m = new Module1()
		m.theDatabaseAccess.echo()
		m.theUserFinder.superEcho()
	}
}

