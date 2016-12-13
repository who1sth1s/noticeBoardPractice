package com.who1sth1s.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://10.211.55.24:3306/book_ex";
	private static final String USER = "root";
	private static final String PASSWORD = "password";
	
	@Test
	public void testConnection() throws Exception {
		
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL, USER, PASSWORD)){
			
			System.out.println(con);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
