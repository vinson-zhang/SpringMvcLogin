<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--  <script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
	-->
	<link href="css/main.css" type="text/css" ref="stylesheet"></link>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    
	<script type="text/javascript">
	
	/*$(document).ready(function(){
		  $("img").load(function(){
		    $.post("image.do",function(data){
		    	alert(data);
		    });
		  });
		});
		$.ajax({
		     type:'get',    
		     url:'image.do', 
		     dataType:'json',
		     success:function(response){
		    	 var data= eval('('+response+')');
		    	 alert(data.id);
		      },
		    error:function(){  
		          alert('Operate Failed!');  
		    }
		});
		$.ajax({
		    type: "get",
		    async: true,                        
		    url: "image.do",                      
		  // contentType: "application/json; charset=utf-8",
		  //  dataType: "json",
		  //  data: "{}",                        
		   success: function(data) {
		//	          alert(data);
			          $("img").attr("src",data);
                    },
                    error: function(XMLHttpRequest, textStatus, errorThrown) {
                        alert(XMLHttpRequest.status);
                        alert(XMLHttpRequest.readyState);//4
                        alert(textStatus);//parsererror
                    },
                    complete: function(XMLHttpRequest, textStatus) {
                        this; // 调用本次AJAX请求时传递的options参数
                    }
		});
       //显示图片
		$().ready(function(){
				
				$.post("image.do",function(data){
					alert(data);
					$("img").attr("src",data[0].image_path);
					$(".name").text("最小的标记次数："+data[0].image_min+"--已经被标记的次数："+data[0].image_now);
				},"json");
		
		});
		 */

		$().ready(function() {
					$("#btn01").click(function() {
						var username = $("#username").val();
						if (username.length == 0) {
							alert("请输入用户名 ");
						} else {
							$.post("select.do", {
								username : username
							}, function(data) {
								alert(data);
							});
						}
					});

					$("#btn02").click(function() {
								var userid = $("#userid").val();

								$.post("ajaxuser.do", {
									userid : userid
								}, function(data) {
									alert(data.userid + "---" + data.username
											+ "---" + data.password);
								}, "json");

							});

				});
		$().ready(function() {
			       $.ajax({
			    	   url:"image.do",
			    	   type:"POST",
			    	   dataType:"json",
			    	   data:null,
			    	   success:function(data){
			    		   alert("success");
			    		   var image = "";
			    		   for(var i=0;data[i]!=null;i++){
			    			   image+=" <div class="+"img"+"><img src="+data[i].image_path+"><span class="+"name"+" ></span> </div>";
			    		   }
			    		   $("#pic").html(image);
			    		   
			    	   },
			    	   error:function(){
			    		   alert:error;
			    	   }
			       });
/*
					$.post("image.do", function(data) {
						alert(data);
						$("img").attr("src", data[0].image_path);
						$(".name").text(
								"最小的标记次数：" + data[0].image_min + "--已经被标记的次数："
										+ data[0].image_now);
					}, "json");
			       */

				});
		
	</script>
  </head>
  
  <body>
    <h2>用户登录 haha</h2>
    
    
   <form action="user.do" method="post">
                        用户名：<input type="text" name="username" id="username"/><br>
                        密码：<input type="password" name="password"/><br>
        <input type="submit" value="提交"/>
        <input type="button" id="btn01" value="验证"/>
      
      <hr>
       编号 ：<input type="text" name="userid" id="userid"/> <input type="button" id="btn02" value="验证"/>
    </form>
    <div id="pic">
       
    </div>
       
  </body>
</html>
