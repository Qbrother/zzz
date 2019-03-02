<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%@page import="java.util.*" session="true" isELIgnored="false" buffer="8kb" autoFlush="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的当当--购物车</title>
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/MyDangDang_ordernumber.css" />
<style type="text/css">

</style>
<script src="js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
	

</script>
</head>
<body>
	<!--我的当当-->
	<div class="container">

		<!--我的当当--个人信息--头部-->
		<div id="person-head">
			<a href="MyHome.jsp"><img
				src="img/DangDanglogoNEW-1531446546.png" alt="当当logo"></a>
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
						<a href="person.do"><li>查看/修改个人信息</li></a>
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
						<a href="order.do"><li id="check">订单查询</li></a>
					</ul>
				</div>

			</div>

			<!--我的当当--个人信息--内容--右侧具体内容-->
			<div id="person-content-right">
			<p style="font-weight: bold;font-size:20px;margin-left: 20px">我的订单</p>
			<div id="box">
				<table border="1" class="table table-hover" id="tb">
					<tr>
						<td>订单号</td>
						<td>书名</td>
						<td>当当价</td>
						<td>商品数量</td>
						<td>小计</td>
						<td>收货地址</td>
						<td>用户名</td>
						<td>状态</td>
					</tr>

					<c:forEach var="userorder" items="${requestScope.pb.beanList}"
						varStatus="s">
						<tr>
							<td>${userorder.ordernumber}</td>
							<td><a href="">${userorder.bookName }</a></td>
							<td>${userorder.dangPrice}</td>
							<td>${userorder.count}</td>
							<td>${userorder.price}</td>
							<td>${userorder.address}</td>
							<td>
								${userorder.username}
							</td>
							<td>${userorder.state}</td>
						</tr>
					</c:forEach>
				</table>

				<center>
					第${pb.pc }页/共${pb.tp}页 <a href="<c:url value='order.do?pc=1'/>">首页</a>
					<c:if test="${pb.pc>1 }">
						<a href="<c:url value='order.do?pc=${pb.pc-1}'/>">上一页</a>
					</c:if>
					<c:if test="${pb.pc<pb.tp}">
						<a href="<c:url value='order.do?pc=${pb.pc+1}'/>">下一页</a>
					</c:if>
					<a href="<c:url value='order.do?pc=${pb.tp}'/>">尾页</a>
				</center>
			</div>
		</div>
</body>
</html>