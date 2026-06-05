addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.5.11")
addSbtPlugin("com.indoorvivants" % "sbt-forge-vite-webapp" % "dev")
addSbtPlugin("com.indoorvivants" % "sbt-forge-native-binary" % "dev")
// for native projects 
addSbtPlugin("com.indoorvivants" % "sbt-revolver-native" % "0.11.2")
// for launching any process in the background
addSbtPlugin("com.indoorvivants" % "sbt-revolver-process" % "0.11.2")

addSbtPlugin(
  "com.indoorvivants" % "bindgen-sbt-plugin" % "0.4.4"
)
