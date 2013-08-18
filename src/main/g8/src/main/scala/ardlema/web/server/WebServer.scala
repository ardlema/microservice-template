package ardlema.web.server

import org.eclipse.jetty.server.Server
import ardlema.properties.WebServerProperties


object WebServer {

  private val server = new Server(WebServerProperties.port)

  def start () { server.start() }

  def main(args: Array[String]) {
    //new WebServer(controllers, heartBeatDependencies)(doSomethingWithContext).startAndWait(args)
    start()
  }

}