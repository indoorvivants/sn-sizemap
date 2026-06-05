addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.5.12")
addSbtPlugin("com.indoorvivants" % "sbt-forge-vite-webapp" % "0.2.0")
addSbtPlugin("com.indoorvivants" % "sbt-forge-native-binary" % "0.2.0")
// for native projects 
addSbtPlugin("com.indoorvivants" % "sbt-revolver-native" % "0.11.2")
// for launching any process in the background
addSbtPlugin("com.indoorvivants" % "sbt-revolver-process" % "0.11.2")

addSbtPlugin(
  "com.indoorvivants" % "bindgen-sbt-plugin" % "0.4.4"
)
