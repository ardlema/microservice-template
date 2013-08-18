import AssemblyKeys._

name := "micro-service"

scalaVersion := "2.10.0"

assemblySettings

excludedJars in assembly <<= (fullClasspath in assembly) map { cp =>
  cp filter {
    Seq("slf4j-log4j12-1.6.3.jar") contains _.data.getName}
}

mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
  {
    case "about.html" => MergeStrategy.discard
    case "NOTICE.txt" => MergeStrategy.discard
    case "NOTICE" => MergeStrategy.discard
    case x => old(x)
  }
}

jarName in assembly := "micro-service.jar"
