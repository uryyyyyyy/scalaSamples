package com.github.uryyyyyyy.samples.specs2

import org.specs2.mutable.Specification
import org.specs2.specification.Scope

class RabbitSpec extends Specification {

	"うさぎ" should {

		"ジャンプできる" in {
			val rabbit = new Rabbit("月野うさぎ")
			rabbit.jump must_== "月野うさぎ jumped!"
		}

		"話すことができない" in {
			val rabbit = new Rabbit("月野うさぎ")
			rabbit.talk must throwAn[UnsupportedOperationException]
		}
	}

	"うさぎ2" should {

		trait RabbitBefore {

			val name = "月野うさぎ"
			val rabbit = new Rabbit(name)
		}

		"ジャンプできる" in new Scope with RabbitBefore {
			rabbit.jump must_== s"$name jumped!"
		}

		"話すことができない" in new Scope with RabbitBefore {
			rabbit.talk must throwAn[UnsupportedOperationException]
		}
	}
}