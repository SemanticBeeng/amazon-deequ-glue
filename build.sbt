import Dependencies._

ThisBuild / scalaVersion     := "2.12.10"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.amz"
ThisBuild / organizationName := "amz"

lazy val root = (project in file("."))
  .settings(
    name := "amazon-deeu-glue",
    libraryDependencies ++= sparkLibs ++ glueLibs ++ deequLibs ++ dynamoDbLibs ++
                           scalaTest
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
