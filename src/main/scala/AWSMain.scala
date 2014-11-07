import aws.S3Client

object AWSMain {
	def main(args: Array[String]): Unit = {
		println("Hello, aws!")
		S3Client.list()
	}
}
