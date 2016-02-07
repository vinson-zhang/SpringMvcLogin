package com.spring.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.spring.base.JDBCConnection;

public class UserDao {
	
	Connection conn = JDBCConnection.getConn();
	Statement st;
	public String getPassword(String username){
		String sql = "select * from user where username='"+username+"'";     // 查询数据的sql语句  
		String password = "";
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);    //执行sql查询语句，返回查询数据的结果集  
	        while (rs.next()) { // 判断是否还有下一个数据  
	            // 根据字段名获取相应的值  
	            password = rs.getString("password");  
	        }  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    //创建用于执行静态sql语句的Statement对象，st属局部变量  
		return password;
	}
	
	

}
