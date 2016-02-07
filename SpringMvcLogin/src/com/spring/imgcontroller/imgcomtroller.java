package com.spring.imgcontroller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.dao.ImgDao;
import com.spring.po.ImgInfo;

@Controller
public class imgcomtroller {
	
	ImgDao imgDao = new ImgDao();
	
//	@RequestMapping("/image.do")
//	public void Image(Model model){
//		System.out.println(id.getImgPath());
//		model.addAttribute("imagepath", id.getImgPath());
//	
//	}
	
	@RequestMapping("/image.do")
	public @ResponseBody List<ImgInfo> Image(Model model,HttpServletRequest request,HttpServletResponse response){
		
		response.setContentType("text/html;charset=utf-8"); 
//		System.out.println("imagepath:"+id.getImgPath());
		model.addAttribute("image_path", imgDao.getImgPath());
		
		List<ImgInfo> imgs = new ArrayList<ImgInfo>();
//		ImgInfo image = new ImgInfo();
		imgs = imgDao.getAllImg();
		
		return imgs;
	/*	使用response的方法返回数据
		try {
			PrintWriter out= response.getWriter();
            out.print(id.getImgPath());
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JSONArray jsonObject = JSONArray.fromObject(id.getAllImg());
		System.out.println(jsonObject);
		*/
		
		
		
		
	}

}
