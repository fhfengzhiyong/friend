<%@page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>  

<%@page import="org.apache.shiro.authc.AuthenticationException"%>  
<%@ page language="java"  import="java.util.*" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>  
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<meta charset="utf-8">
<title>java web统一后台</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
	<%@ include file="../resource.jsp"%>
<style type="text/css">  
.error {  
    color: red;  
}  
</style>  
<script type="text/javascript">  
function refreshCaptcha(){  
    document.getElementById("captcha_img").src="<%=basePath%>/static/images/captcha.jpeg?t=" + Math.random();  
}  
</script>  
</head>
<body>
<div class="page-container">
	<div class="main_box">
		<div class="login_box">
			<div class="login_logo">
				<img  style="width:100px;height:10px;" src="<%=basePath%>/static/images/logo_manage.png" >
			</div>
		
			<div class="login_form">
				<form action="login/toLinin" id="login_form" method="post">
					<div class="form-group">
						<label for="j_username" class="t">帐　号：</label> 
						<input id="email" value="" name="email" type="text" class="form-control x319 in" 
						autocomplete="off">
					</div>
					<div class="form-group">
						<label for="j_password" class="t">密　码：</label> 
						<input id="password" value="" name="password" type="password" 
						class="password form-control x319 in">
					</div>
					<div class="form-group">
						<label for="j_captcha" class="t">验证码：</label>
						 <input id="j_captcha" name="j_captcha" type="text" class="form-control x164 in">
						<img id="captcha_img" alt="点击更换" title="点击更换"  onclick="javascript:refreshCaptcha()" src="<%=basePath%>/static/images/captcha.jpeg" class="m">
					</div>
					<div class="form-group">
						<label class="t"></label>
						<label for="j_remember" class="m">
						<input id="j_remember" type="checkbox" value="true">&nbsp;记住登陆账号!</label>
					</div>
					<div class="form-group space">
						<label class="t"></label>　　　
						<button type="submit"   id="submit_btn" 
						class="btn btn-primary btn-lg">&nbsp;登&nbsp;录&nbsp </button>
						<input type="reset" value="&nbsp;重&nbsp;置&nbsp;" class="btn btn-default btn-lg">
					</div>
				</form>
			</div>
		</div>
		<div class="bottom">Copyright &copy; 2014 - 2015 <a href="#">小五</a></div>
	</div>
</div>
</body>
</html>