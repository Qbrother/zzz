<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<%@page import="java.util.*" session="true" isELIgnored="false"
	buffer="8kb" autoFlush="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理--分类管理--商品</title>
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/manage_goods.css" />

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
						<a href="manageuser.do"><li>查看用户信息</li></a>
					</ul>
					<p>商品管理</p>
					<ul>
						<a href="goods.do"><li id="check">查看/修改/添加商品</li></a>
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
				<p style="font-weight: bold; font-size: 20px; margin-left: 20px">商品管理</p>

				<div id="box">
					<form action="updategoods.do" method="get">
						<table border="1" class="table table-hover" id="tb">
							<tr>
								<td>序号</td>
								<td>大类名</td>
								<td>小类名</td>
								<td>书名</td>
								<td>当当价</td>
							</tr>

							<c:forEach var="gs" items="${requestScope.pb.beanList}"
								varStatus="s">
								<tr>
									<td>${gs.gid}</td>
									<td>${gs.bigname}</td>
									<td>${gs.smallname}</td>
									<td>${gs.bookname}</td>
									<td>${gs.dangPrice}</td>
								</tr>
							</c:forEach>
						</table>

						<center>
							第${pb.pc }页/共${pb.tp}页 <a
								href="<c:url value='goods.do?pc=1'/>">首页</a>
							<c:if test="${pb.pc>1 }">
								<a href="<c:url value='goods.do?pc=${pb.pc-1}'/>">上一页</a>
							</c:if>
							<c:if test="${pb.pc<pb.tp}">
								<a href="<c:url value='goods.do?pc=${pb.pc+1}'/>">下一页</a>
							</c:if>
							<a href="<c:url value='goods.do?pc=${pb.tp}'/>">尾页</a>
						</center>
					</form>
				</div>
				<div id="update">
					<!--我的当当--个人信息--内容--右侧具体内容--书名的修改-->
					<form action="goodsupdate.do" method="get">
						<div style="margin-top: 10px;margin-left:20px">
							 <span
								style="font-weight: bold; font-size: 20px; margin-top: 5px">书修改>>></span>
								大类名:<input type="text" name="bigname" placeholder="请输入大类名" />
								小类名:<input type="text" name="smallname" placeholder="请输入小类名" />
						</div>
						<div style="margin-left: 120px; margin-top: 10px">
							旧书名:<input type="text" name="oldbookname"
								placeholder="请输入旧书名"/> 新的书名:<input
								type="text" name="newbookname" placeholder="请输入修改后的书名"  style="width: 155px" /> <input
								type="submit" value="修改" style="width: 100px">
						</div>
					</form>
				</div>
				<!--我的当当--个人信息--内容--右侧具体内容--书名的添加-->
				<div id="insert">
					<form action="goodsinsert.do" method="get">
						<span id="insertstyle"> <span
							style="font-weight: bold; font-size: 20px; line-height: 60px">书增加>>></span>
							大类名:
							<input type="text" name="bigname" placeholder="大类名"  style="width:80px"/>
							小类名:<input type="text" name="smallname"
							placeholder="小类名"  style="width:80px"/> 
							添加的书名:<input type="text" name="newbookname"
							placeholder="书名" style="width:80px" /> 
							当当价:<input type="text" name="bookprice"
							placeholder="价格" style="width:80px" /> 
							<input type="submit" value="添加" style="width: 60px">
						</span>
					</form>
				</div>
			</div>
</body>
</html>