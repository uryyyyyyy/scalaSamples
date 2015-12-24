package com.github.uryyyyyyy.samples.ficus

import java.util

import com.typesafe.config.{Config, ConfigFactory}
import net.ceedubs.ficus.Ficus._

object ConfigSample {

	val config: Config = ConfigFactory.load()

	def getInt(key:String):Int = {
		config.as[Int](key)
	}

	def getConfig(key:String):Config = {
		config.as[Config](key)
	}

	def getList(key:String):List[String] = {
		config.as[List[String]](key)
	}
}