// Project info

name := "statsd-client"

// So that we can publish it into Sonatype

organization := "com.victorops.statsd"

version := "1.0.0"

// The version comes from version.sbt, and is generated by the release plugin

scalaVersion := "2.10.2"

resolvers ++= Seq(
    DefaultMavenRepository,
    Resolver.url("Play", url("http://download.playframework.org/ivy-releases/"))(Resolver.ivyStylePatterns),
    "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
    "Typesafe Other Repository" at "http://repo.typesafe.com/typesafe/repo/",
    Resolver.url("sbt-plugin-releases", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)
)

// Test dependencies

libraryDependencies ++= Seq(
  "com.typesafe" %  "config"      % "1.0.2",
  "org.slf4j"    %  "slf4j-api"   % "1.7.2",
  "junit"        %  "junit"       % "4.11"    % "test",
  "org.specs2"   %% "specs2"      % "2.0"     % "test"
)

publishTo := Some(Resolver.file("file",  new File("../maven-repo/releases")))

parallelExecution in Test := false
