package com.github.uryyyyyyy.samples.googleAPI

import java.awt.Desktop
import java.net.URI

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential
import com.google.api.client.http.apache.ApacheHttpTransport
import com.google.api.client.json.jackson2.JacksonFactory
import com.google.api.services.youtube.YouTube
import com.google.api.services.youtube.model.SearchResult

import scala.collection.JavaConverters._

object YoutubeClient {

	def find(title: String): Option[SearchResult] = {
		var googleKey:String = ""
		sys.env.get("GOOGLE_API_KEY") match {
			case Some(key) => googleKey = key
				case None => throw new RuntimeException("need to set GOOGLE_API_KEY")
		}

		val youTube = new YouTube.Builder(new ApacheHttpTransport, new JacksonFactory, new GoogleCredential)
				.setApplicationName("sadamasashi-compiler").build()
		val youTubeSearch = youTube.search.list("id,snippet")
		youTubeSearch.setType("video")
		youTubeSearch.setFields("items(id/kind,id/videoId,snippet/title,snippet/thumbnails/default/url)")
		youTubeSearch.setMaxResults(50L)
		val query = "さだまさし"
		youTubeSearch.setQ(query)
		youTubeSearch.setKey(googleKey)
		val youTubeResponse = youTubeSearch.execute()
		youTubeResponse.getItems.asScala.find(_.getSnippet.getTitle.contains("さだまさし"))
	}
}