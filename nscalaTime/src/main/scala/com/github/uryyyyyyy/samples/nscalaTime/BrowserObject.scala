package com.github.uryyyyyyy.samples.javaAWT

import java.awt.Desktop
import java.net.URI

object BrowserObject {

	def open(url:String) {
		Desktop.getDesktop.browse(new URI(url))
	}
}