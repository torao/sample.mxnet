organization := "at.hazm"

name := "moxbox-mxnet"

version := "1.0.0"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "ml.dmlc.mxnet" % "libmxnet-scala-linux-x86_64-gpu" % "0.9.3a",
  "ml.dmlc.mxnet" % "mxnet-full_2.11-linux-x86_64-gpu" % "0.9.3a"
)