package com.github.uryyyyyyy.samples.macwire

object Main {
  def main (args: Array[String]) {
    import com.softwaremill.macwire._

    val s = new DatabaseAccess("mock")
    val userFinder = wire[UserFinder]
    userFinder.superEcho()
  }
}
