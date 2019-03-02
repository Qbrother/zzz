<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%@page import="java.util.*" session="true" isELIgnored="false" buffer="8kb" autoFlush="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的当当--订单已生成</title>
<link rel="stylesheet" href="css/bootstrap.css"/>
<link rel="stylesheet" href="css/MyDangDang_ordergenerated.css"/>
		
	</head>
	<body>
		<!--我的当当-->
		<div class="container">

			<!--我的当当--订单确认--头部-->
			<div id="person-head">
				<a href="MyHome.jsp"><img src="img/DangDanglogoNEW-1531446546.png" alt="当当logo"></a>
			</div>
			<div id="pic">
				<a href=""><img src="img/person-title.png" alt="个人信息上部图片"></a>
			</div>
			<!--我的当当--订单确认--内容-->
			<div id="person-content">
				<p id="ptop">生成订单步骤:1、确认订单>>>2、填写收货地址>>><span class="wordStyle">3、订单成功</span></p>
				<div class="tb">
					<p id="psuccess">成功</p>
					<hr>
					<p id="pcontent">你的订单已生成，订单号为:${sessionScope.ordertime},总金额:￥${sessionScope.totalPrice}</p>
					<p id="pdown"><a href="MyHome.jsp">继续浏览并选购商品</a></p>
				</div>
			</div>
		</div>
	</body>
</html>