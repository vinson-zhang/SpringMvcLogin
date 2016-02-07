package com.spring.usercontroller;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.dao.ImgDao;
import com.spring.dao.UserDao;
import com.spring.po.ImgInfo;
import com.spring.po.UserInfo;


@Controller
public class Usercontroller {
	
	UserDao ud = new UserDao();
	ImgDao id = new ImgDao();
	
	
	@RequestMapping("/user.do")
	public String User(UserInfo user,Model model){
		
		System.out.println("username:"+user.getUsername()+"password:"+user.getPassword()+"\n");
		
		if(user.getPassword().equals(ud.getPassword(user.getUsername()))&&user.getPassword()!=null){
			model.addAttribute("username", user.getUsername());
			model.addAttribute("imagepath",id.getImgPath());
			return "success";
		}else{
			return "fail";
		}
	}
	 
	
	
	@RequestMapping("/select.do")
	public void username(String username,HttpServletResponse response){
		System.out.println(username);
		
		try {
			//响应
			
			response.setContentType("text/html");
			response.setCharacterEncoding("utf-8");
			
			PrintWriter out = response.getWriter();
			if("hello".equals(username)){
				out.println("登录成功！");
			}else{
				out.println("请重新输入用户名！");
			}
			out.flush();
			out.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	//@ResponseBody  表示将内容或者对象当成http正文返回
	@RequestMapping("/ajaxuser.do")
	public @ResponseBody UserInfo ajaxuser(Integer userid){
		UserInfo user = new UserInfo();
		
		System.out.println("userid:"+userid);
		if(userid==null)
		{
			user.setUserid(11);
		}else{
			user.setUserid(userid);
		}
		user.setUsername("marry");
		user.setPassword("123456");
		return user;
	}
	
	
	


}
