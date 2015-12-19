package com.github.uryyyyyyy.samples.scalatest

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "Hello" should "have tests" in {
    true should be === true
  }
}
