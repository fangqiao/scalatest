ThisBuild / scalaVersion := "2.12.4"

lazy val wxpaytest = (project in file("."))
  .settings(
    name := "wxpaytest",
    libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.5.6",
    libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.21",
    libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.21"
  )
