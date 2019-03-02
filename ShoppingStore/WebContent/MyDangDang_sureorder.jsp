<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%@page import="java.util.*" session="true" isELIgnored="false" buffer="8kb" autoFlush="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的当当--订单确认</title>
<link rel="stylesheet" href="css/bootstrap.css"/>
<link rel="stylesheet" href="css/MyDangDang_sureorder.css"/>
		<style type="text/css">
				
		</style>
		
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
				<p>生成订单步骤:<span class="wordStyle">1、确认订单</span>>>>2、填写收货地址>>>3、订单成功</p>
				<div class="tb">
				<table class="table table-bordered">
					<tr style="background-color: cornflowerblue;">
						<th>序号</th>
						<th>商品名</th>
						<th>商品单价</th>
						<th>商品数量</th>
						<th>小计</th>
					</tr>
					<c:forEach var="singlebuy" items="${requestScope.singleReadyBuys}"
								varStatus="s">
					<tr>
						<td>${s.count}</td>
						<td>${singlebuy.bookName}</td>
						<td>${singlebuy.dangPrice}</td>
						<td>${singlebuy.count}</td>
						<td>${singlebuy.price}</td>
					</tr>
					</c:forEach>
					<tr style="background-color: cornflowerblue;">
						<td colspan="5">商品总金额:￥${sessionScope.totalPrice}</td>
					</tr>
					
				</table>
				
				<a href="cart.do"><input type="button" value="上一步"/></a>
				<a href="MyDangDang_address.jsp"><input type="button" value="下一步"/></a>
				</div>
			</div>
		</div>
	</body>
</html>
