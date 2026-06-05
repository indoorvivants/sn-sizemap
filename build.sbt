import scala.scalanative.build.SourceLevelDebuggingConfig
import java.util.stream.Collectors
import java.nio.file.Files
import bindgen.interface.*


inThisBuild(
  Seq(
    semanticdbIncludeInJar := false,
    organization := "com.indoorvivants",
    organizationName := "Anton Sviridov",
    homepage := Some(url("https://github.com/indoorvivants/sn-sizemap")),
    startYear := Some(2022),
    licenses := List(
      "Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")
    ),
    developers := List(
      Developer(
        "keynmol",
        "Anton Sviridov",
        "velvetbaldmime@protonmail.com",
        url("https://indoorvivants.com")
      )
    )
  )
)

lazy val cli = project
  .in(file("cli"))
  .enablePlugins(ScalaNativePlugin, ForgeNativeBinaryPlugin, BindgenPlugin)
  .settings(
    scalaVersion := "3.8.4",
    libraryDependencies ++= Seq(
      "com.indoorvivants" %%% "decline-derive" % "0.3.6",
      "com.indoorvivants" %%% "sn-demangler-core" % "0.2.0",
      "com.outr" %%% "scribe" % "3.19.0"
    ),
    reStart / baseDirectory := (ThisBuild / baseDirectory).value,
    buildBinaryConfig ~= { _.withName("sn-sizemap") },
    nativeConfig ~= {
      _.withLinkingOptions(_ :+ "-lstdc++")
        .withEmbedResources(true)
        .withMultithreading(enabled = false)
        .withIncrementalCompilation(true)
        .withSourceLevelDebuggingConfig(SourceLevelDebuggingConfig.enabled)
    },
    bindgenBindings += Binding(
      (Compile / resourceDirectory).value / "scala-native" / "httplib_glue.h",
      "httplib"
    ).withClangFlags(Seq("-xc++")),
    bindgenBindings += Binding(
      (Compile / resourceDirectory).value / "scala-native" / "mongoose.h",
      "mongoose"
    ).withCImports(Seq("mongoose.h")),
    bindgenMode := bindgen.plugin.BindgenMode.Manual(
      scalaDir = sourceDirectory.value / "main" / "scala" / "generated",
      cDir = (Compile / resourceDirectory).value / "scala-native" / "generated"
    ),
    Compile / resourceGenerators += Def.task {
      import scala.jdk.CollectionConverters.*

      val dist = (frontend / frontendRoot).value / "dist"

      Files.walk(dist).toList.asScala.map(_.toFile).filter(_.isFile)
    },
    serveItself := Def.taskDyn {
      val binary = (Compile / nativeLink).value.toPath
      reStart.toTask(s" serve ${binary} --port 8899")
    }.value
  )

lazy val serveItself = taskKey[Unit](
  "Starts the CLI server in the background on port 8899, serving the CLI's own binary"
)

lazy val frontend = project
  .in(file("frontend"))
  .enablePlugins(ForgeViteWebappPlugin, RevolverProcessPlugin)
  .settings(
    libraryDependencies += "com.raquo" %%% "laminar" % "17.2.1",
    frontendPackages := Seq("sizemap"),
    reStartCommand := Seq("npm", "run", "dev"),
    reStart / baseDirectory := frontendRoot.value.toFile,
    scalaVersion := "3.8.4"
  )
