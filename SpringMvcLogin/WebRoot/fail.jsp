<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
   
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<title>登录</title>
<style type='text/css'>
body
{
	font-family:'Microsoft Yahei', 'Helvetica Neue', Helvetica, Arial, sans-serif;
	}
</style>
<link type='text/css' rel='stylesheet' href='css/all.css'/>
<link type='text/css' rel='stylesheet' href='css/login.css'/>

</head>
<body>
<div class="signin-bg">	
<div class="signin-container">
     <div style="margin:170px 0px 30px 45px">
          <div style="display:inline-block;width:340px;float:left;">
		       <div style="margin-bottom:8px">
			      <a href="/"><img style="width:200px" src="images/logo.png" border="0"></a>
			</div>
	      <form name="loginform" id="loginform" action="" method="post">
		  <div style="margin-top:25px">
		     <input name="login_id" id="login_id" value="" class="signin-txt" type="text" placeholder='用户名'/>
		  </div>
		    <div style="margin-top:20px">
		     <input name="login_password" id="login_password" value="" class="signin-txt" type="text" placeholder='密码'/>
		  </div>
		   <div style="margin-top:20px">
		   <span id="signin-btn" onclick="" class="button default signin-btn">立即登录</span>
		   <a href="" class="signin-forget">忘记密码</a>
		   </div>
		   <div style="margin-top:38px;color:#222;">还没有账户？您可以在此&nbsp;<a href="signup.html">注册</a></div>
		   </form>
		   <div class="clear"></div>
      </div>
</div>
 </div> 
</body>
</html>