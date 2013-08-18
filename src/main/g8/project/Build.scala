import Dependencies._
import sbt._
import Keys._
import scala.Some

object Build extends Build {
  val localRepoUrl = Some(Resolver.file("Repositorio local de maven",  new File(Path.userHome.absolutePath + "/.m2/repository")))

  val buildSettings: Seq[Setting[_]] = Seq(
    retrieveManaged     := true,
    logLevel            := Level.Info,
    libraryDependencies := dependencies(),
    publishTo           <<= version { (v: String) => localRepoUrl },
    resolvers           += localRepoUrl.get)

  val root = Project("micro-service", file("."))
    .settings(buildSettings: _*)
}