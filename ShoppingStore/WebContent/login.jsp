<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<%@page import="java.util.*" session="true" isELIgnored="false"
	buffer="8kb" autoFlush="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录-当当网</title>
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/login.css" />

</head>
<body>
	<!--登录界面-->
	<div class="container">

		<!--登录-头部-->
		<div id="login-head">
			<a href=""><img src="img/DangDanglogoNEW-1531446546.png"
				alt="当当logo"></a>
		</div>

		<!--登录-内容-->
		<div id="login-content">

			<!--登录-内容--左侧-->
			<div id="login-content-left">
				<a href=""><img src="img/登录-图片.jpg" alt="登录-图片"></a>
			</div>

			<!--登录-内容--右侧-->
			<div id="login-content-right">
				<div id="login-content-right-form">
					<h1>用户登录</h1>
					<form action="login.do" method="post">
						<div>
							<span class="word">用户名</span>:<input type="text" name="username"
								placeholder="用户名/手机号" value="${sessionScope.username}"/> <br>
						</div>
						<div id="login-content-right-form-password">
							<span class="word">密&nbsp&nbsp&nbsp&nbsp码</span>:<input
								type="password" name="psd" placeholder="密码" value="${sessionScope.password}" />
						</div>
						<div>
							<p>
								<input type="checkbox" name="rememberPsd" value="yes" checked/>记住密码
							</p>
							<br>
						</div>
						<p>
							<input type="submit" value="登录" style="width: 80px;" />
						</p>
						<span><a href="register.jsp">立即注册</a></span>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>