package com.github.uryyyyyyy.samples.scalaIO

object Main {

  def main(args: Array[String]): Unit = {
    println("----")
    println("read by char")
    println("----")
    FileHandler.readChars("scalaIO/sample.txt").foreach(println)

    println("----")
    println("read by line")
    println("----")
    FileHandler.readLines("scalaIO/sample.txt").foreach(println)
  }

}