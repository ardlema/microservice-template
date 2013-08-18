import sbt._

object Dependencies {
  private val jettyVersion = "8.1.7.v20120910"

  def dependencies() = {
    Seq(
      "org.eclipse.jetty" % "jetty-webapp" % jettyVersion,
      "org.eclipse.jetty" % "test-jetty-servlet" % jettyVersion,
      "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" artifacts (Artifact("javax.servlet", "jar", "jar")),
      "com.yammer.metrics" % "metrics-jetty" % "2.0.3",
      "net.liftweb" % "lift-json-ext_2.10" % "2.5-M4",
      "c3p0" % "c3p0" % "0.9.1.2"
    )
  }

}