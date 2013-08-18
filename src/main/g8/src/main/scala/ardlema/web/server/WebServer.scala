package ardlema.web.server

import org.eclipse.jetty.server.Server
import ardlema.properties.WebServerProperties


class WebServer() {

  private val server = new Server(WebServerProperties.port)

  //def start () { server.start() }
}