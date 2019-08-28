package com.cgi.udev.resoapi.web;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cgi.udev.resoapi.dao.TestDao;

/**
* Exemple d'une ressource JAX-RS utilisant un DAO.
* Cette ressource devrait être accessible sur un serveur de test Tomcat à l'adresse :
* http://localhost:8080/resoapi/api/hellobdd
*
*/
@Path("/hellobdd")
public class HelloBddResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Message sayHello() throws SQLException {
		TestDao testDao = new TestDao();
		String message = testDao.getMessage();
		return new Message(message);
	}
}
