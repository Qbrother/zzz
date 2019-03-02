<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<%@page import="java.util.*" session="true" isELIgnored="false"
	buffer="8kb" autoFlush="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的当当--购物车</title>
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/MyDangDang_cart.css" />

<script src="js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript" src="js/MyDangDang_cart.js"></script>
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
						<a href="cart.do"><li id="check">购物车</li></a>
					</ul>
					<p>我的订单</p>
					<ul>
						<a href="order.do"><li>订单查询</li></a>
					</ul>
				</div>

			</div>

			<!--我的当当--个人信息--内容--右侧具体内容-->
			<div id="person-content-right">
				<p>我的购物车</p>
				
				<div id="box">
						<table border="1" class="table table-hover" id="tb">
							<tr>
								<td>选择</td>
								<td>封面</td>
								<td>书名</td>
								<td>市场价</td>
								<td>当当价</td>
								<td>数量</td>
								<td>商品价格</td>
								<td>操作</td>
							</tr>


							<c:forEach var="usercart" items="${requestScope.pb.beanList}"
								varStatus="s">

								<tr>
									<td><input type="checkbox" name="loves" class="ck"></td>
									<td><img src="${usercart.cover}" class="cover"></td>
									<td><a href="">${usercart.bookName}</a></td>
									<td><span>${usercart.marketPrice}</span></td>
									<td class="tdp"><span class="price">${usercart.dangPrice}</span></td>
									<td class="tdn">
										<button class="add">+</button> <input type="text" class="num"
										value="${usercart.amount}" style="width: 30px" />
										<button class="sub">-</button>
									</td>
									<td class="tdt"><span style="color: red" class="total"></span>
									</td>
									<td>
									<!-- 传入Servlet无论是
									get(String book=new String(request.getParameter("book").getBytes("iso-8859-1"),"utf-8"))
									还是post(request.setCharacterEncoding("utf-8"))都是乱码，算你狠 -->
									<!-- <form method="get" action="operation.do"> -->
										<input type="button" value="删除"  class="btn btn-info"/>
										<!-- <input type="hidden" name="book" class="book"/> -->
								<!-- 	</form> -->
									</td>
								</tr>

							</c:forEach>
						</table>

						<center>
							第${pb.pc }页/共${pb.tp}页 <a href="<c:url value='cart.do?pc=1'/>">首页</a>
							<c:if test="${pb.pc>1 }">
								<a href="<c:url value='cart.do?pc=${pb.pc-1}'/>">上一页</a>
							</c:if>
							<c:if test="${pb.pc<pb.tp}">
								<a href="<c:url value='cart.do?pc=${pb.pc+1}'/>">下一页</a>
							</c:if>
							<a href="<c:url value='cart.do?pc=${pb.tp}'/>">尾页</a>
						</center>
				</div>
				<div id="cart-foot">
					<form method="get" action="buy.do">
					<span id="totalwords">商品金额总计:￥
					<span id="totalPrice"
						name="totalPrice" style="color: red"></span></span>
							<!-- 隐藏域传值给Servlet -->
						 	<input type="hidden" name="bookName" class="bookName"/>
						 	<input type="hidden" name="dangPrice" class="dangPrice"/>
						 	<input type="hidden" name="count" class="count"/>
						 	<input type="hidden" name="price" class="price"/>
						 	<input type="hidden" name="allPrice" class="allPrice"/>
						 	
							 <a href="" class="buy" style="color:black"><input type="submit"
							value="结算" id="submit" style="margin-left: 20px"></a>
						</form>
				</div>
			
			</div>
		</div>

	</div>
</body>
</html>
