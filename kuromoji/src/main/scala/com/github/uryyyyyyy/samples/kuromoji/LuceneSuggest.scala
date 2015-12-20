package com.github.uryyyyyyy.samples.kuromoji

import org.apache.lucene.search.spell.LevensteinDistance

object LuceneSuggest {

	def suggest(text:String, candidates: Seq[String], distance: Float, num:Int): Seq[(String, Float)] ={
		candidates.map(v => (v, new LevensteinDistance().getDistance(text, v)))
				.filter{ case (_, dist) => dist >= distance }
				.sortWith { case ((_, a), (_, b)) => a > b }
				.take(num)
	}

}
