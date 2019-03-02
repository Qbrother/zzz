<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%@page import="java.util.*" session="true" isELIgnored="false" buffer="8kb" autoFlush="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理--用户管理</title>
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/manage_user.css" />

</head>
<body>
	<!--后台管理-->
	<div class="container">

		<!--后台管理--头部-->
		<div id="manage-head">
			<a href="MyHome.jsp"><img
				src="img/DangDanglogoNEW-1531446546.png" alt="当当logo"></a>
		</div>
		<div id="pic">
			<a href=""><img src="img/manage-top.jpg" alt="后台管理上部图片"></a>
		</div>
		<!--后台管理--管理内容-->
		<div id="manage-content">

			<!--后台管理--管理内容--左侧分类部分-->
			<div id="manage-content-left">
				<div id="manageCenter">
					<p>后台管理</p>
				</div>
				<div id="manageStyle">
					<p>用户管理</p>
					<ul>
						<a href="manageuser.do"><li id="check">查看用户信息</li></a>
					</ul>
					<p>商品管理</p>
					<ul>
						<a href="goods.do"><li>查看/修改/添加商品</li></a>
					</ul>
					<p>订单管理</p>
					<ul>
						<a href="manageorder.do"><li>查看订单</li></a>
					</ul>
					<p>分类管理</p>
					<ul>
						<a href="bigclass.do"><li>大类（查询/修改/添加）</li></a>
						<a href="smallclass.do"><li>小类（查询/修改/添加）</li></a>
					</ul>
					<p>畅销书排行</p>
					<ul>
						<a href="manage_rank.jsp"><li>畅销书排行</li></a>
					</ul>
				</div>

			</div>

			<!--我的当当--个人信息--内容--右侧具体内容-->
			<div id="manage-content-right">
			<p style="font-weight: bold;font-size:20px;margin-left: 20px">用户信息</p>
			<div id="box">
				<table border="1" class="table table-hover" id="tb">
					<tr>
						<td>序号</td>
						<td>用户名</td>
						<td>密码</td>
						<td>电话号码</td>
						<td>余额</td>
					</tr>

					<c:forEach var="users" items="${requestScope.pb.beanList}"
						varStatus="s">
						<tr>
							<td> ${users.uid}</td>
							<td>${users.username}</td>
							<td>${users.password}</td>
							<td>${users.phone}</td>
							<td>${users.balance}</td>
						</tr>
					</c:forEach>
				</table>

				<center>
					第${pb.pc }页/共${pb.tp}页 <a href="<c:url value='manageuser.do?pc=1'/>">首页</a>
					<c:if test="${pb.pc>1 }">
						<a href="<c:url value='manageuser.do?pc=${pb.pc-1}'/>">上一页</a>
					</c:if>
					<c:if test="${pb.pc<pb.tp}">
						<a href="<c:url value='manageuser.do?pc=${pb.pc+1}'/>">下一页</a>
					</c:if>
					<a href="<c:url value='manageuser.do?pc=${pb.tp}'/>">尾页</a>
				</center>
			</div>
		</div>
</body>
</html>