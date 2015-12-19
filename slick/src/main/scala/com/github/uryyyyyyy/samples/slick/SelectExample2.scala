package com.github.uryyyyyyy.samples.slick

import slick.driver.PostgresDriver.api._

import scala.concurrent.Await
import scala.concurrent.duration.Duration

case class Example(id: Int, name: String)
import slick.jdbc.GetResult

object SelectExample2{
  implicit val getResult = GetResult(r => Example(r.nextInt, r.nextString))

  def main(args: Array[String]) {
    val db = Database.forConfig("pg_database")
    val query = sql"SELECT id, name FROM examples".as[Example]
    Await.result(db.run(query), Duration.Inf) foreach println
  }
}