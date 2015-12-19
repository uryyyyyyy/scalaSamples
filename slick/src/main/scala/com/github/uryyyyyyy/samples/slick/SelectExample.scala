package com.github.uryyyyyyy.samples.slick

import scala.concurrent.Await
import scala.concurrent.duration.Duration
import slick.driver.PostgresDriver.api._

object SelectExample{

  def main(args: Array[String]) {
    val db = Database.forConfig("pg_database")
    val query = sql"SELECT id, name FROM examples".as[(Int, String)]
    val f = db.run(query)
    Await.result(f, Duration.Inf) foreach println
  }
}