package com.github.uryyyyyyy.samples.awsSdk

import java.util

import com.amazonaws.auth.EnvironmentVariableCredentialsProvider
import com.amazonaws.regions.{Region, Regions}
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient
import com.amazonaws.services.dynamodbv2.document.{DynamoDB, Table, TableCollection}
import com.amazonaws.services.dynamodbv2.model._

import scala.collection.JavaConverters._


object DynamoSample {

	def main(args: Array[String]): Unit = {
		getTables().foreach(println)
	}

	def createTable(): Unit ={
		val tableName = "SampleTable"
		val client = new AmazonDynamoDBClient(new EnvironmentVariableCredentialsProvider())
		client.setRegion(Region.getRegion(Regions.AP_NORTHEAST_1))

		val dynamoDB: DynamoDB = new DynamoDB(client)

		val attributeDefinitions:util.ArrayList[AttributeDefinition] = new util.ArrayList[AttributeDefinition]()
		attributeDefinitions.add(new AttributeDefinition().withAttributeName("Id").withAttributeType("N"))

		val keySchema: util.ArrayList[KeySchemaElement] = new util.ArrayList[KeySchemaElement]()
		keySchema.add(new KeySchemaElement().withAttributeName("Id").withKeyType(KeyType.HASH))

		val request: CreateTableRequest = new CreateTableRequest()
				.withTableName(tableName)
				.withKeySchema(keySchema)
				.withAttributeDefinitions(attributeDefinitions)
				.withProvisionedThroughput(new ProvisionedThroughput()
						.withReadCapacityUnits(5L)
						.withWriteCapacityUnits(6L))

		val table: Table = dynamoDB.createTable(request)

		table.waitForActive()
	}

	def getTables(): List[Table] ={
		val client = new AmazonDynamoDBClient(new EnvironmentVariableCredentialsProvider())
		client.setRegion(Region.getRegion(Regions.AP_NORTHEAST_1))

		val dynamoDB: DynamoDB = new DynamoDB(client)

		val tables:TableCollection[ListTablesResult] = dynamoDB.listTables()
		tables.iterator().asScala.toList
	}

}
