<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%@page import="java.util.*" session="true" isELIgnored="false" buffer="8kb" autoFlush="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>我的当当--余额</title>
		<link rel="stylesheet" href="css/bootstrap.css"/>
<link rel="stylesheet" href="css/MyDangDang_balance.css"/>
		
	</head>
	<body>
		<!--我的当当-->
		<div class="container">

			<!--我的当当--余额--头部-->
			<div id="person-head">
				<a href="MyHome.jsp"><img src="img/DangDanglogoNEW-1531446546.png" alt="当当logo"></a>
			</div>
			<div id="pic">
				<a href=""><img src="img/person-title.png" alt="个人信息上部图片"></a>
			</div>
			<!--我的当当--余额--内容-->
			<div id="person-content">
				
				<!--我的当当--余额--内容--左侧分类部分-->
				<div id="person-content-left">
					<div id="personalCenter">
						<p>个人中心</p>
					</div>
					<div id="personStyle">
						<p>个人信息</p>
						<ul>
							<a href="person.do"><li>查看/修改个人信息</li></a>
						</ul>
						<p>余额</p>
						<ul>
							<a href="MyDangDang_balance.jsp"><li id="check">余额查询</li></a>
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
				
				<!--我的当当--余额--内容--右侧具体内容-->
				<div id="person-content-right">
					<p>用户姓名:${sessionScope.username}</p>
					<p>用户余额:${sessionScope.balance}</p>
					<p> </p>
					<hr>
					<p></p>					
					<form action="charge.do" method="get">
						<p>充值金额:<input type="text" name="charge" placeholder="请输入充值金额">
						<span style="color:orange">正整数金额</span></p>
						<input type="submit" value="充值" id="submit">
					</form>
				</div>
			</div>
			
		</div>
	</body>
</html>
