scalaVersion := sys.props("plugin.scalaVersion")

libraryDependencies ++= Seq(
      "ch.epfl.lamp" % "dotty_0.14" % scalaVersion.value,
      "ch.epfl.lamp" % "dotty_0.14" % scalaVersion.value % "test->runtime",
      "com.novocode" % "junit-interface" % "0.11" % "test"
    )