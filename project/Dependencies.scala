import sbt._

object versions {
  val spark = "3.1.2"

  val deequ = "2.0.0-spark-3.1"

  val glue = "1.12.157"
}

object Dependencies {
  lazy val sparkLibs = Seq(
    "org.apache.spark" %% "spark-core",
    "org.apache.spark" %% "spark-sql",
    "org.apache.spark" %% "spark-streaming"
    // should not be packaged but provided by Docker-ized Spark
  ).map(_ % versions.spark % Provided)


  lazy val glueLibs = Seq(
    "com.amazonaws" % "aws-java-sdk-glue",
    "com.amazonaws" % "aws-java-sdk-dynamodb"
  ).map(_ % versions.glue)

  lazy val dynamoDbLibs  = Seq("com.amazon.emr" % "emr-dynamodb-hadoop" % "4.16.0" % "provided")

  lazy val deequLibs = Seq(
    "com.amazon.deequ" % "deequ" % versions.deequ
  )

  lazy val scalaTest = Seq("org.scalatest" %% "scalatest" % "3.2.9" % Test)

}
