package com.github.uryyyyyyy.samples.config

import com.typesafe.config.{Config, ConfigFactory}

object ConfigSample {

	val conf = ConfigFactory.load("application.conf")

	def getInt(key:String):Int = {
		conf.getInt(key)
	}

	def getConfig(key:String):Config = {
		conf.getConfig(key)
	}
}