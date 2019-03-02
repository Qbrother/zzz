<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<%@page import="java.util.*" session="true" isELIgnored="false"
	buffer="8kb" autoFlush="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理--分类管理--大类</title>
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/manage_bigclass.css" />

<script src="js/jquery.min.js" type="text/javascript" charset="utf-8"></script>

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
							<a href="goods.do"><li>查看/修改/添加商品</li></a>
					</ul>
					<p>订单管理</p>
					<ul>
						<a href="manageorder.do"><li>查看订单</li></a>
					</ul>
					<p>分类管理</p>
					<ul>
						<a href="bigclass.do"><li id="check">大类（查询/修改/添加）</li></a>
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
				<p style="font-weight: bold; font-size: 20px; margin-left: 20px">分类管理--大类</p>

				<div id="box">
					<form action="updatebig.do" method="get">
						<table border="1" class="table table-hover" id="tb">
							<tr>
								<td>序号</td>
								<td>大类名</td>
							</tr>

							<c:forEach var="bigs" items="${requestScope.pb.beanList}"
								varStatus="s">
								<tr>
									<td>${bigs.bid}</td>
									<td>${bigs.bigname}</td>
								</tr>
							</c:forEach>
						</table>

						<center>
							第${pb.pc }页/共${pb.tp}页 <a
								href="<c:url value='bigclass.do?pc=1'/>">首页</a>
							<c:if test="${pb.pc>1 }">
								<a href="<c:url value='bigclass.do?pc=${pb.pc-1}'/>">上一页</a>
							</c:if>
							<c:if test="${pb.pc<pb.tp}">
								<a href="<c:url value='bigclass.do?pc=${pb.pc+1}'/>">下一页</a>
							</c:if>
							<a href="<c:url value='bigclass.do?pc=${pb.tp}'/>">尾页</a>
						</center>
					</form>
				</div>
				<div id="update">
					<!--我的当当--个人信息--内容--右侧具体内容--大类的修改-->
					<form action="updatebig.do" method="get">
						<span id="updatestyle"> <span
							style="font-weight: bold;font-size: 20px;line-height: 75px">大类名修改>>></span> 旧的大类名:<input
							type="text" name="oldbigname" placeholder="请输入旧的大类名" /> 修改后大类名:<input
							type="text" name="newbigname" placeholder="请输入修改后的大类名" /> <input
							type="submit" value="修改" style="width: 100px">
						</span>
					</form>
				</div>
				<!--我的当当--个人信息--内容--右侧具体内容--大类的添加-->
				<div id="insert">
					<form action="bigclassinsert.do" method="get">
						<span id="insertstyle"> <span
							style="font-weight: bold;font-size: 20px;line-height: 75px">大类名增加>>></span> 新增大类名:<input
							type="text" name="newbigclass" placeholder="请输入新增的大类名" /> <input
							type="submit" value="添加" style="width: 100px">
						</span>
					</form>
				</div>
			</div>
</body>
</html>