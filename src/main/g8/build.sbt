
// give the user a nice default project!
ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "2.12.8"

lazy val akkaHttpVersion = "10.1.9"
lazy val akkaVersion    = "2.6.0-M5"

lazy val root = (project in file(".")).
  settings(
    name := "Sangria Seed"
  ).enablePlugins(SangriaschemagenPlugin)
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http"            % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-xml"        % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-stream"          % akkaVersion,
  "ch.megard"         %% "akka-http-cors"       % "0.4.1",
  "de.heikoseeberger" %% "akka-http-circe"      % "1.27.0",
  "org.sangria-graphql" %% "sangria-circe" % "1.2.1",
  "io.circe" %% "circe-generic" % "0.9.3",
  "com.typesafe.akka" %% "akka-http-testkit"    % akkaHttpVersion % Test,
  "com.typesafe.akka" %% "akka-testkit"         % akkaVersion     % Test,
  "com.typesafe.akka" %% "akka-stream-testkit"  % akkaVersion     % Test,
  "org.scalatest"     %% "scalatest"            % "3.0.5"         % Test,
)
