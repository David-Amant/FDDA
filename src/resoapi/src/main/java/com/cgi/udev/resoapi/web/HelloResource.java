package com.cgi.udev.resoapi.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
* Exemple d'une ressource JAX-RS.
* Cette ressource devrait être accessible sur un serveur de test Tomcat à l'adresse :
* http://localhost:8080/resoapi/api/hello
*
*/
@Path("/hello")
public class HelloResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Message sayHello() {
		return new Message("Bienvenue sur l'API Web !");
	}
}
