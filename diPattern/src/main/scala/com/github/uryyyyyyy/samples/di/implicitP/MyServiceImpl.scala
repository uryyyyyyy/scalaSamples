package com.github.uryyyyyyy.samples.di.implicitP

class MyServiceImpl(implicit val dao: MyDao) extends MyService  {
	def process() = dao.getData()
}