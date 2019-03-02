<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%@page import="java.util.*" session="true" isELIgnored="false" buffer="8kb" autoFlush="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理--畅销书</title>

<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/manage_rank.css" />

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jsapi.js"></script>
<script type="text/javascript" src="js/corechart.js"></script>		
<script type="text/javascript" src="js/jquery.gvChart-1.0.1.min.js"></script>
<script type="text/javascript" src="js/jquery.ba-resize.min.js"></script>

<script type="text/javascript">
gvChartInit();
	$(function(){
	$('#rank').gvChart({
		chartType: 'PieChart',
		gvSettings: {
			vAxis: {title: 'No of players'},
			hAxis: {title: 'Month'},
			width: 700,
			height: 430
		}
	});
});
</script>

</head>
<body>
	<!--后台管理-->
	<div class="container">

		<!--后台管理--头部-->
		<div id="manage-head">
			<a href="Home.jsp"><img
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
					<p style="font-size:25px">后台管理</p>
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
						<a href="bigclass.do"><li>大类（查询/修改/添加）</li></a>
						<a href="smallclass.do"><li>小类（查询/修改/添加）</li></a>
					</ul>
					<p>畅销书排行</p>
					<ul>
						<a href="manage_rank.jsp"><li id="check">畅销书排行</li></a>
					</ul>
				</div>

			</div>

			<!--我的当当--个人信息--内容--右侧具体内容-->
			<div id="manage-content-right" >
				<div style="width:700px;margin:50px auto;">
				  <table id='rank'>
			<caption><span>畅销书排名</span></caption>
			<thead>
				<tr>
					<th></th>
					<th>活着</th>
					<th>雪落香杉树</th>
					<th>小熊和最好的爸爸</th>
					<th>生命本来的样子</th>
					<th>神奇校车(图画书版)</th>
					<th>第一本地理启蒙书</th>
					<th>神奇校车(桥梁书版)</th>
					<th>你坏</th>
					<th>正门管教</th>
					<th>月亮与六便士</th>
					
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>1200</th>
					<td>650</td>
					<td>390</td>
					<td>280</td>
					<td>220</td>
					<td>190</td>
					<td>160</td>
					<td>120</td>
					<td>100</td>
					<td>80</td>
					<td>70</td>
				</tr>
			</tbody>
		</table>  
				
				</div>
			</div>
		</div>
</body>
</html>