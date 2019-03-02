<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%@page import="java.util.*" session="true" isELIgnored="false" buffer="8kb" autoFlush="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的当当--个人信息</title>
		<link rel="stylesheet" href="css/bootstrap.css"/>
		<link rel="stylesheet" href="css/MyDangDang_updateUser.css"/>
		<style type="text/css">
				
		</style>
		
	</head>
	<body>
		<!--我的当当-->
		<div class="container">

			<!--我的当当--个人信息--头部-->
			<div id="person-head">
				<a href="MyHome.jsp"><img src="img/DangDanglogoNEW-1531446546.png" alt="当当logo"></a>
			</div>
			<div id="pic">
				<a href=""><img src="img/person-title.png" alt="个人信息上部图片"></a>
			</div>
			<!--我的当当--个人信息--内容-->
			<div id="person-content">
				
				<!--我的当当--个人信息--内容--左侧分类部分-->
				<div id="person-content-left">
					<div id="personalCenter">
						<p>个人中心</p>
					</div>
					<div id="personStyle">
						<p>个人信息</p>
						<ul>
							<a href="person.do"><li id="check">查看/修改个人信息</li></a>
						</ul>
						<p>余额</p>
						<ul>
							<a href="MyDangDang_balance.jsp"><li>余额查询</li></a>
						</ul>
						<p>我的购物车</p>
						<ul>
							<a href="cart.do"><li>购物车</li></a>
						</ul>
						<p>我的订单</p>
						<ul>
							<a href="order.do"><li>订单查询</li></a>
						</ul>
					</div>

				</div>
				
				<!--我的当当--个人信息--内容--右侧具体内容-->
				<div id="person-content-right">
					<p>用户姓名:${requestScope.username}</p>
					<p>用户密码:${requestScope.password}</p>
					<p>电话号码:${requestScope.phone}</p>
					<hr>
					<p>修改个人信息</p>
					<form action="updateusername.do" method="post">
						<p>新用户姓名:<input type="text" name="newUserName" placeholder="请输入新用户名">
						<input type="submit" value="修改" id="submit"></p>
					</form>
					<form action="updateuserpassword.do" method="post">
						<p>新用户密码:<input type="password" name="newPassword" placeholder="请输入新用户密码">
						<input type="submit" value="修改" id="submit"></p>
					</form>
					<form action="updateuserphone.do" method="post">
						<p>新电话号码:<input type="text" name="newPhone" placeholder="请输入新电话号码">
						<input type="submit" value="修改" id="submit"></p>
					</form>
						
					
				</div>
			</div>
			
		</div>
	</body>
</html>
