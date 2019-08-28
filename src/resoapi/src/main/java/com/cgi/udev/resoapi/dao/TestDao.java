package com.cgi.udev.resoapi.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe DAO pour tester l'accès à la base de données
 */
public class TestDao {

	public String getMessage() throws SQLException {
		try (Connection c = ResoDataSource.getSingleton().getConnection();
		     Statement stmt = c.createStatement()) {
			try(ResultSet rs = stmt.executeQuery("select 'Hello from database'")) {
				rs.next();
				return rs.getString(1);
			}
		}
	}

}
