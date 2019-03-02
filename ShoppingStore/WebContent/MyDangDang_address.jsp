<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%@page import="java.util.*" session="true" isELIgnored="false" buffer="8kb" autoFlush="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的当当--地址确定</title>
<link rel="stylesheet" href="css/bootstrap.css"/>
<link rel="stylesheet" href="css/MyDangDang_address.css"/>
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
				<p>生成订单步骤:1、确认订单>>><span class="wordStyle">2、填写收货地址</span>>>>3、订单成功</p>
				<div class="tb">
					<form action="generated.do" method="get">
						<span>
						选择地址:
						<select name="address">
							<option checked value="填写新地址">填写新地址</option>
							<option value="春熙路">春熙路</option>
							<option value="翡翠城">翡翠城</option>
							<option value="柳江小区">柳江小区</option>
							<option value="锦江春天">锦江春天</option>
						</select>
						</span>
						<div id="list">
							<div class="list-left">收件人姓名:</div>
							<div class="list-right"><input type="text" name="uname" placeholder="请输入有效收件人姓名" class="input"></div>
							
							<div class="list-left">收件人地址:</div>
							<div class="list-right"><input type="text" name="uaddress" placeholder="请输入有效地址" class="input"></div>
							
							<div class="list-left">电话号码:</div>
							<div class="list-right"><input type="text" name="uphone" placeholder="请输入有效电话号码" class="input"></div>
								<a href="readybuy.do" style="margin-left:330px"><input type="button" value="上一步"/></a>
								<a href=""><input type="submit" value="下一步"/></a>
						</div>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>