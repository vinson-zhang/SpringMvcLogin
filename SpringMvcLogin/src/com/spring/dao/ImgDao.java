package com.spring.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.spring.base.JDBCConnection;
import com.spring.po.ImgInfo;

public class ImgDao {
	Connection conn = JDBCConnection.getConn();
	Statement st;
	public String getImgPath(){
		String sql = "select * from image ";     // 查询数据的sql语句  
		String image_path = "";
		try {
			st = (Statement) conn.createStatement();
			ResultSet rs = st.executeQuery(sql);    //执行sql查询语句，返回查询数据的结果集  
	        while (rs.next()) { // 判断是否还有下一个数据  
	            // 根据字段名获取相应的值  
	            image_path = rs.getString("image_path"); 
	        }  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    //创建用于执行静态sql语句的Statement对象，st属局部变量  
		return image_path;
	} 
	
	public List<ImgInfo> getAllImg(){
		
		String sql = "select * from image";     // 查询数据的sql语句  
		
		int image_id;
		String image_path = "";
		int image_min;
		int image_now;
		List<ImgInfo> imgs = new ArrayList<ImgInfo>();
		
		try {
			st = (Statement) conn.createStatement();
			ResultSet rs = st.executeQuery(sql);    //执行sql查询语句，返回查询数据的结果集  
	        while (rs.next()) { // 判断是否还有下一个数据  
	            // 根据字段名获取相应的值  
	        	ImgInfo img = new ImgInfo();
	            image_id = rs.getInt("image_id");
	        	
//	        	System.out.println(imagename);
	        	image_path = rs.getString("image_path");
//	        	System.out.println(imagepath);
	            image_min = rs.getInt("image_min");  
	            image_now = rs.getInt("image_now");  
	            img.setImage_id(image_id);
	            img.setImage_path(image_path);
	            img.setImage_min(image_min);
	            img.setImage_now(image_now);
	           
	            imgs.add(img);
	        }  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    //创建用于执行静态sql语句的Statement对象，st属局部变量  
		return imgs;
	}
	

}
