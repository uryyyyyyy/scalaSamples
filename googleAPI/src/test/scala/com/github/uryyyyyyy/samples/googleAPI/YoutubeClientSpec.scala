package com.github.uryyyyyyy.samples.googleAPI


object YoutubeClientSpec {

	def main(args: Array[String]) {
		YoutubeClient.find("hahaha") match{
			case Some(v) => YoutubeClient.watch(v)
			case None => println("Nout Found")
		}
	}

}
