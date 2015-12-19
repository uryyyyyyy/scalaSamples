package com.github.uryyyyyyy.samples.specs2

class Rabbit(name: String) {

	def jump: String = s"$name jumped!"

	def talk: String = throw new UnsupportedOperationException("Rabbit cannot talk!")
}