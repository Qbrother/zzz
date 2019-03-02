<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<%@page import="java.util.*" session="true" isELIgnored="false"
	buffer="8kb" autoFlush="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册-当当网</title>
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/register.css" />

<script type="text/javascript" src="js/register.js"></script>

</head>
<body>
	<!--注册界面-->
	<div class="container">
		<!--注册-头部-->
		<div id="register-head">
			<a href=""><img src="img/DangDanglogoNEW-1531446546.png"
				alt="当当logo"></a>
		</div>
		<div id="register-content">
			<div id="register-content-form">
				<h1>用户注册</h1>
				<form action="register.do" method="post">
					<p>
						<span class="title">用户姓名:</span>
						<input type="text" name="username"
							id="username" placeholder="请输入用户名" class="widthes" onblur="check();"/>
					</p>
					<span id="resname" class="words">4-30位字母、数字或"_"开头</span>
					<p>
						<span class="title">用户密码:</span><input type="password" name="psd1"
							id="psd1" placeholder="6-20位字母、数字或符号" class="widthes" />
					</p>
					<span id="respsd1" class="words">6-20位字母、数字或符号</span>
					<p>
						<span class="title">确认密码:</span><input type="password" name="psd2"
							id="psd2" placeholder="再次输入密码" class="widthes" />
					</p>
					<span id="respsd2" class="words">再次输入密码</span>
					<p>
						<span class="title">手机号码:</span><input type="text" name="phone"
							id="phone" placeholder="请输入你的电话号码" class="widthes" />
					</p>
					<span id="resphone" class="words">手机号码可用于登录、找回密码、就收订单通知等服务</span>
					<p>
						<span class="title">&nbsp&nbsp&nbsp&nbsp验证码:</span><input
							type="text" name="verification" id="verification"
							placeholder="请输入下图验证码" class="widthes" />
					</p>
					<span id="resver" class="words">请输入验证码</span>
					<p>
						<span id="ver"><a href="" alt="验证码"><img
								src="img/验证码.png" alt="验证码"></a><a href="">换一张图</a></span>
					</p>
					<br> <input type="checkbox" name="check" value="ok"/>我已阅读并同意<a href="">《当当交易条款》</a>和<a
						href="">《当当社区条款》</a><br> <br>
					<button type="submit">立即注册</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>