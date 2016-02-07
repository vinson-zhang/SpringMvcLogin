package com.spring.base;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;



public class JDBCConnection {
	
	
	private static Connection conn = null;
	private static List<Connection> conns = new ArrayList<Connection>();
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "123456");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConn(){
		return conn;
	}
	
	public static void main(String[] args) {
		Connection conn = JDBCConnection.getConn();
		System.out.println(conn);
		 
	}

}
