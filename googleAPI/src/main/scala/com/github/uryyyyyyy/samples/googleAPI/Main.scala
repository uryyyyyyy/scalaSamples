package com.github.uryyyyyyy.samples.googleAPI

import java.awt.Desktop
import java.net.URI

object Main {
	def main(args: Array[String]) {
		YoutubeClient.find("hahaha") match{
			case None => println("Nout Found")
			case Some(video) => {
				val uri = new URI(s"https://www.youtube.com/watch?v=${video.getId.getVideoId}")
				Desktop.getDesktop.browse(uri)
			}
		}
	}
}
