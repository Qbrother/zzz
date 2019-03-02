<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<%@page import="java.util.*" session="true" isELIgnored="false"
	buffer="8kb" autoFlush="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>当当购书</title>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/Home.css">

</head>
<body>
	<!--头部-->
	<div id="head">
		<div class="container-fluid" id="head-top">
			<div id="head-top-content">

				<!--头部--配送地址-->
				<div id="head-top-content-left">
					送至: <select name="send">
						<option value="北京" selected="selected">北京</option>
						<option value="北京">天津</option>
						<option value="上海">上海</option>
						<option value="重庆">重庆</option>
						<option value="河北">河北</option>
						<option value="山西">山西</option>
						<option value="辽宁">辽宁</option>
						<option value="吉林">吉林</option>
						<option value="黑龙江">黑龙江</option>
						<option value="江苏">江苏</option>
						<option value="浙江">浙江</option>
						<option value="安徽">安徽</option>
						<option value="福建">福建</option>
						<option value="江西">江西</option>
						<option value="山东">山东</option>
						<option value="河南">河南</option>
						<option value="湖北">湖北</option>
						<option value="湖南">湖南</option>
						<option value="广东">广东</option>
						<option value="海南">海南</option>
						<option value="四川">四川</option>
						<option value="贵州">贵州</option>
						<option value="云南">云南</option>
						<option value="陕西">陕西</option>
						<option value="甘肃">甘肃</option>
						<option value="青海">青海</option>
						<option value="...">...</option>
					</select>
				</div>

				<!--头部--登录-->
				<div id="head-top-content-center">
					欢迎光临当当，请<a href="login.jsp" target="_blank">登录</a>
				</div>

				<!--头部--功能菜单-->
				<div id="head-top-content-right">
					<ul class="nav nav-pills nav-justified">
						<li><button class="btn">
								<a href="#" target="_blank">成为会员</a>
							</button></li>
						<li><button class="btn">
								<a href="#" target="_blank">我的云书库</a>
							</button></li>
						<li class="dropdown">
							<button class="btn" type="button" data-toggle="dropdown">
								<a href="#" target="_blank">我的当当<span class="caret"></span></a>
							</button>
							<ul class="dropdown-menu">
								<li><a href="#">个人信息</a></li>
								<li><a href="#">购物车</a></li>
								<li><a href="#">积分抵现</a></li>
								<li><a href="#">我的收藏</a></li>
								<li><a href="#">我的余额</a></li>
							</ul>
						</li>
						<li><button class="btn">
								<a href="#" target="_blank">小说投稿</a>
							</button></li>
						<li><button class="btn">
								<a href="#" target="_blank">我要出书</a>
							</button></li>
						<li class="dropdown">
							<button class="btn" type="button" data-toggle="dropdown">
								<a href="#" target="_blank">企业采购<span class="caret"></span></a>
							</button>
							<ul class="dropdown-menu">
								<li><a href="#">大宗采购</a></li>
								<li><a href="#">礼品卡采购</a></li>
								<li><a href="#">礼品卡激活</a></li>
								<li><a href="#">礼品卡使用</a></li>
								<li><a href="#">3C数码团购</a></li>
							</ul>
						</li>
						<li class="dropdown">
							<button class="btn" type="button" data-toggle="dropdown"
								id="dropdownMenu1" aria-haspopup="true" aria-expanded="false">
								<a href="#" target="_blank">客户服务<span class="caret"></span></a>
							</button>
							<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
								<li><a href="#">帮助中心</a></li>
								<li><a href="#">自助退换货</a></li>
								<li><a href="#">自助发票</a></li>
								<li><a href="#">联系客服</a></li>
								<li><a href="#">我要投诉</a></li>
							</ul>
						</li>
					</ul>
				</div>
			</div>
		</div>


		<!--头部--查询界面-->
		<div id="head-search">
			<div id="head-search">
				<div id="head-search-left">
					<a href="#" target="_blank"><img
						src="img/DangDanglogoNEW-1531446546.png" alt="当当网"></a>
				</div>
				<div id="head-search-center">
					<form action="query.do">
						<input type="text" placeholder="30万图书每满100减40" name="querybook" id="head-search-center-query"/>
						<input type="submit" value="搜索" style="width: 100px;height: 40px;"/>
						</form>
				</div>
				<div id="head-search-right">
					<div id="head-search-right-cart">
						<a href="#" target="_blank"><span
							class="glyphicon glyphicon-shopping-cart"></span>购物车</a>
					</div>
					<div id="head-search-right-order">
						<a href="#" target="_blank">我的订单</a>
					</div>
				</div>
			</div>
		</div>

		<!--头部--商品分类-->
		<div id="head-classification">
			<div id="head-classification-left" class="dropdown">
				<button class="btn" type="button" id="dropdownMenu1"
					data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
					<span id="head-classification-left-all">全部商品分类</span> <span
						class="caret"></span>
				</button>
				<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
					<li><a href="#">图书</a></li>
					<li><a href="#">电子书</a></li>
					<li><a href="#">网络文学</a></li>
					<li><a href="#">童书</a></li>
					<li><a href="#">教辅</a></li>
					<li><a href="#">小说</a></li>
					<li><a href="#">青春</a></li>
					<li><a href="#">管理</a></li>
					<li><a href="#">历史</a></li>
					<li><a href="#">科技</a></li>
				</ul>
			</div>

			<!--头部--所有商品分类--链接-->
			<div id="head-classification-right">
				<ul>
					<li><a href="#" target="_blank">尾品汇</a>
					<li><a href="#" target="_blank">图书</a></li>
					<li><a href="#" target="_blank">电子书</a></li>
					<li><a href="#" target="_blank">网络文学</a></li>
					<li><a href="#" target="_blank">服装</a></li>
					<li><a href="#" target="_blank">运动户外</a></li>
					<li><a href="#" target="_blank">孕婴童</a></li>
					<li><a href="#" target="_blank">家居</a></li>
					<li><a href="#" target="_blank">当当优品</a></li>
					<li><a href="#" target="_blank">食品</a></li>
					<li><a href="#" target="_blank">Apple</a></li>
					<li><a href="#" target="_blank">电器城</a></li>
				</ul>
			</div>
		</div>


		<!--头部--书籍分类-->
		<div id="head-kinds" class="container-fluid">
			<div id="head-kinds-content">
				<ul>
					<li><a href="#" target="_blank">排行</a></li>
					<li>|</li>
					<li><a href="#" target="_blank">童书</a></li>
					<li>|</li>
					<li><a href="#" target="_blank">教辅</a></li>
					<li>|</li>
					<li><a href="#" target="_blank">小说</a></li>
					<li>|</li>
					<li><a href="#" target="_blank">文学</a></li>
					<li>|</li>
					<li><a href="#" target="_blank">青春</a></li>
					<li>|</li>
					<li><a href="#" target="_blank">传记</a></li>
					<li>|</li>
					<li><a href="#" target="_blank">励志</a></li>
					<li>|</li>
					<li><a href="#" target="_blank">管理</a></li>
					<li>|</li>
					<li><a href="#" target="_blank">历史</a></li>
					<li>|</li>
					<li><a href="#" target="_blank">宗教</a></li>
					<li>|</li>
					<li><a href="#" target="_blank">亲子</a></li>
					<li>|</li>
					<li><a href="#" target="_blank">养生</a></li>
					<li>|</li>
					<li><a href="#" target="_blank">考试</a></li>
					<li>|</li>
					<li><a href="#" target="_blank">科技</a></li>
					<li>|</li>
					<li><a href="#" target="_blank">原版</a></li>
					<li>|</li>
					<li><a href="#" target="_blank">电子</a></li>
					<li>|</li>
					<li><a href="#" target="_blank">网络</a></li>
				</ul>
			</div>
		</div>
	</div>

	<!--中间部分-->
	<div id="content">

		<!--中间部分--总分类-->
		<div id="content-classification">

			<!--中间部分--上长图片-->
			<div id="content-head-picture">
				<a href="#"><img src="img/1200x65_djj_0925-1537858532.jpg"
					alt="content-head-picture"></a>
			</div>

			<!--中间部分--图书分类-->
			<div id="content-classification-left">
				<div id="content-classification-left-up">
					<p>图书分类</p>
				</div>

				<!--中间部分--图书分类--具体分类明细-->
				<div id="content-classification-left-down">
					<div class="big">
						<a href="#" class="menu">特色书单</a>
					</div>
					<div class="big">
						<a href="#" class="menu">电子书</a> <a href="#" class="menu">网络文学</a><br>
						<a href="#" class="menu"> 阅读器</a>
					</div>
					<div class="big" style="height: 75px;">
						<a href="#" class="menu">教育</a>
						<ul>
							<li><a href="#">教材</a></li>
							<li>|</li>
							<li><a href="#">外语</a></li>
							<li>|</li>
							<li><a href="#">考试</a></li>
							<li>|</li>
							<li><a href="#">中小学教辅</a></li>
							<li>|</li>
							<li><a href="#">工具书</a></li>
						</ul>
					</div>
					<div class="big">
						<a href="#" class="menu">小说</a>
					</div>
					<div class="big" style="height: 75px;">
						<a href="#" class="menu">文艺</a>
						<ul>
							<li><a href="#">文学</a></li>
							<li>|</li>
							<li><a href="#">传记</a></li>
							<li>|</li>
							<li><a href="#">艺术</a></li>
							<li>|</li>
							<li><a href="#">摄影</a></li>
						</ul>
					</div>
					<div class="big">
						<a href="#" class="menu">青春文学</a> · <a href="#" class="menu">动漫</a>
					</div>
					<div class="big" style="height: 95px;">
						<a href="#" class="menu">童书</a>
						<ul>
							<li><a href="#">0-2</a></li>
							<li>|</li>
							<li><a href="#">3-6</a></li>
							<li>|</li>
							<li><a href="#">7-10</a></li>
							<li>|</li>
							<li><a href="#">11-14</a></li>
							<li>|</li>
							<li><a href="#">科普/百科</a></li>
							<li>|</li>
							<li><a href="#">绘本</a></li>
							<li>|</li>
							<li><a href="#">文学</a></li>
							<li>|</li>
							<li><a href="#">英语</a></li>
						</ul>
					</div>
					<div class="big" style="height: 115px;">
						<a href="#" class="menu">人文社科</a>
						<ul>
							<li><a href="#">历史</a></li>
							<li>|</li>
							<li><a href="#">古典</a></li>
							<li>|</li>
							<li><a href="#">哲学/宗教</a></li>
							<li>|</li>
							<li><a href="#">文化</a></li>
							<li>|</li>
							<li><a href="#">政治/军事</a></li>
							<li>|</li>
							<li><a href="#">法律</a></li>
							<li>|</li>
							<li><a href="#">社会科学</a></li>
							<li>|</li>
							<li><a href="#">心理学</a></li>
						</ul>
					</div>
					<div class="big" style="height: 50px;">
						<a href="#" class="menu">经管</a>
						<ul>
							<li><a href="#">经济</a></li>
							<li>|</li>
							<li><a href="#">管理</a></li>
							<li>|</li>
							<li><a href="#">投资理财</a></li>
						</ul>
					</div>
					<div class="big">
						<a href="#" class="menu">成功/励志</a>
					</div>
					<div class="big" style="height: 115px;">
						<a href="#" class="menu">生活</a>
						<ul>
							<li><a href="#">两性</a></li>
							<li>|</li>
							<li><a href="#">孕期</a></li>
							<li>|</li>
							<li><a href="#">育儿</a></li>
							<li>|</li>
							<li><a href="#">亲子/家教</a></li>
							<li>|</li>
							<li><a href="#">保健</a></li>
							<li>|</li>
							<li><a href="#">运动</a></li>
							<li>|</li>
							<li><a href="#">美妆</a></li>
							<li>|</li>
							<li><a href="#">手工</a></li>
							<li>|</li>
							<li><a href="#">美食</a></li>
							<li>|</li>
							<li><a href="#">旅游</a></li>
							<li>|</li>
							<li><a href="#">休闲</a></li>
							<li>|</li>
							<li><a href="#">家居</a></li>
						</ul>
						</ul>
					</div>
					<div class="big" style="height: 95px;">
						<a href="#" class="menu">科技</a>
						<ul>
							<li><a href="#">科普</a></li>
							<li>|</li>
							<li><a href="#">建筑</a></li>
							<li>|</li>
							<li><a href="#">医学</a></li>
							<li>|</li>
							<li><a href="#">计算机</a></li>
							<li>|</li>
							<li><a href="#">农林</a></li>
							<li>|</li>
							<li><a href="#">自然科学</a></li>
							<li>|</li>
							<li><a href="#">工业</a></li>
						</ul>
					</div>
					<div class="big">
						<a href="#" class="menu">英文原版书</a> <a href="#" class="menu">港台图书</a>
					</div>
					<div class="big">
						<a href="#" class="menu">当当出版</a>
					</div>
					<div class="big">
						<a href="#" class="menu">期刊 /音像</a>
					</div>
					<div class="big">
						<a href="#" class="menu">创意文具</a>
					</div>
				</div>
			</div>

			<!--中间部分--图书分类--中间部分-->
			<div id="content-classification-middle">


				<!--中间部分--图书分类--中间部分--图片滚动-->
				<div id="content-classification-middle-picture"
					class="carousel slide" data-ride="carousel">
					<ol class="carousel-indicators">
						<li data-target="#content-classification-middle-picture"
							data-slide-to="0" class="active"></li>
						<li data-target="#content-classification-middle-picture"
							data-slide-to="1"></li>
						<li data-target="#content-classification-middle-picture"
							data-slide-to="2"></li>
						<li data-target="#content-classification-middle-picture"
							data-slide-to="3"></li>
						<li data-target="#content-classification-middle-picture"
							data-slide-to="4"></li>
						<li data-target="#content-classification-middle-picture"
							data-slide-to="5"></li>
						<li data-target="#content-classification-middle-picture"
							data-slide-to="6"></li>
						<li data-target="#content-classification-middle-picture"
							data-slide-to="7"></li>
						<li data-target="#content-classification-middle-picture"
							data-slide-to="8"></li>
						<li data-target="#content-classification-middle-picture"
							data-slide-to="9"></li>
					</ol>
					<div class="carousel-inner">
						<div class="item active">
							<a href="#"><img src="img/p1.jpg" alt="p1"
								style="width: 730px;"></a>
						</div>
						<div class="item">
							<a href="#"><img src="img/p2.jpg" alt="p2"
								style="width: 730px;"></a>
						</div>
						<div class="item">
							<a href="#"><img src="img/p3.jpg" alt="p3"
								style="width: 730px;"></a>
						</div>
						<div class="item">
							<a href="#"><img src="img/p4.jpg" alt="p4"
								style="width: 730px;"></a>
						</div>
						<div class="item">
							<a href="#"><img src="img/p5.jpg" alt="p5"
								style="width: 730px;"></a>
						</div>
						<div class="item">
							<a href="#"><img src="img/p6.jpg" alt="p6"
								style="width: 730px;"></a>
						</div>
						<div class="item">
							<a href="#"><img src="img/p7.jpg" alt="p7"
								style="width: 730px;"></a>
						</div>
						<div class="item">
							<a href="#"><img src="img/p8.jpg" alt="p8"
								style="width: 730px;"></a>
						</div>
						<div class="item">
							<a href="#"><img src="img/p9.jpg" alt="p9"
								style="width: 730px;"></a>
						</div>
						<div class="item">
							<a href="#"><img src="img/p10.jpg" alt="p10"
								style="width: 730px;"></a>
						</div>
					</div>
					<a href="#content-classification-middle-picture" data-slide="prev"
						class="left carousel-control"> <span
						class="glyphicon glyphicon-chevron-left"></span>
					</a> <a href="#content-classification-middle-picture" data-slide="next"
						class="right carousel-control"> <span
						class="glyphicon glyphicon-chevron-right"></span>
					</a>
				</div>

				<!--中间部分--图书分类--中间部分--新书上架logo-->
				<div id="content-classification-middle-newbook-up">
					<img src="img/新书上架.jpg" alt="新书上架" class="img-circle"
						style="height: 45px; margin-top: 10px;" />
				</div>

				<!--新书上架--划动分页-->
				<div id="content-classification-middle-newbook"
					class="carousel slide media">
					<ol class="carousel-indicators">
						<li data-target="#content-classification-middle-newbook"
							data-slide-to="0" class="active"></li>
						<li data-target="#content-classification-middle-newbook"
							data-slide-to="1"></li>
						<li data-target="#content-classification-middle-newbook"
							data-slide-to="2"></li>
					</ol>
					<div class="carousel-inner">
						<!--新书上架--划动-第一页-->
						<div class="item active">
							<div class="row">
								<div class="col-md-4">
									<div class="thumbnail">
										<a href="#"><img src="img/邓小平实录.jpg" alt="邓小平实录" /></a>
										<div class="caption">
											<a href="#" class="text">邓小平实录</a><br> <span
												class="text-warning">李新芝</span><br> <span
												class="price_afterdiscount">￥176.40</span> <span
												class="price_beforediscount">¥203.60</span>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="thumbnail">
										<a href="#"><img src="img/无所畏.jpg" alt="无所畏" /></a>
										<div class="caption">
											<a href="#" class="text">无所畏</a><br> <span
												class="text-warning">冯唐</span><br> <span
												class="price_afterdiscount">¥34.40</span> <span
												class="price_beforediscount">¥49.80</span>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="thumbnail">
										<a href="#"><img src="img/韭菜的自我修养.jpg" alt="韭菜的自我修养" /></a>
										<div class="caption">
											<a href="#" class="text">韭菜的自我修养</a><br> <span
												class="text-warning">李笑来</span><br> <span
												class="price_afterdiscount">¥15.20</span> <span
												class="price_beforediscount">¥39.00</span>
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-4">
									<div class="thumbnail">
										<a href="#"><img src="img/如果巴黎不快乐典藏.jpg" alt="如果巴黎不快乐典藏" /></a>
										<div class="caption">
											<a href="#" class="text">如果巴黎不快乐典藏</a><br> <span
												class="text-warning">白槿湖 </span><br> <span
												class="price_afterdiscount">¥71.20</span> <span
												class="price_beforediscount">¥89.00</span>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="thumbnail">
										<a href="#"><img src="img/祸国 式燕.jpg" alt="祸国 式燕" /></a>
										<div class="caption">
											<a href="#" class="text">祸国 式燕</a><br> <span
												class="text-warning">十四阙 </span><br> <span
												class="price_afterdiscount">¥64.80</span> <span
												class="price_beforediscount">¥72.00</span>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="thumbnail">
										<a href="#"><img src="img/彩色连环画中国历史.jpg" alt="彩色连环画中国历史" /></a>
										<div class="caption">
											<a href="#" class="text">彩色连环画中国历史</a><br> <span
												class="text-warning">孟庆江 </span><br> <span
												class="price_afterdiscount">¥334.40</span> <span
												class="price_beforediscount">¥398.00</span>
										</div>
									</div>
								</div>
							</div>
						</div>

						<!--新书上架--划动-第二页-->
						<div class="item">
							<div class="row">
								<div class="col-md-4">
									<div class="thumbnail">
										<a href="#"><img src="img/newbook2-1.jpg" alt="沈伯俊评点" /></a>
										<div class="caption">
											<a href="#" class="text">沈伯俊评点</a><br> <span
												class="text-warning">罗贯中 著，沈伯俊 </span><br> <span
												class="price_afterdiscount">¥190.10</span> <span
												class="price_beforediscount">¥198.00</span>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="thumbnail">
										<a href="#"><img src="img/newbook2-2.jpg" alt="零基础学好英语语法" /></a>
										<div class="caption">
											<a href="#" class="text">零基础学好英语语法</a><br> <span
												class="text-warning">戴宝拉Debra 凤凰含</span><br> <span
												class="price_afterdiscount">¥24.90</span> <span
												class="price_beforediscount">¥39.80</span>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="thumbnail">
										<a href="#"><img src="img/newbook2-3.jpg" alt="复乐园" /></a>
										<div class="caption">
											<a href="#" class="text">复乐园</a><br> <span
												class="text-warning">渡边淳一</span><br> <span
												class="price_afterdiscount">¥35.10</span> <span
												class="price_beforediscount">¥39.00</span>
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-4">
									<div class="thumbnail">
										<a href="#"><img src="img/newbook2-4.jpg" alt="写给父母的未来之" /></a>
										<div class="caption">
											<a href="#" class="text">写给父母的未来之</a><br> <span
												class="text-warning">郝景芳、王立铭、童 </span><br> <span
												class="price_afterdiscount">¥44.20</span> <span
												class="price_beforediscount">¥59.00</span>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="thumbnail">
										<a href="#"><img src="img/newbook2-5.jpg" alt="妈妈和我" /></a>
										<div class="caption">
											<a href="#" class="text">妈妈和我</a><br> <span
												class="text-warning">[日]村松江梨子 中川 </span><br> <span
												class="price_afterdiscount">¥47.80</span> <span
												class="price_beforediscount">¥52.00</span>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="thumbnail">
										<a href="#"><img src="img/newbook2-6.jpg" alt="成语故事（全20册）" /></a>
										<div class="caption">
											<a href="#" class="text">成语故事（全20册）</a><br> <span
												class="text-warning">中国教育科学研究院 </span><br> <span
												class="price_afterdiscount">¥158.40</span> <span
												class="price_beforediscount">¥240.00</span>
										</div>
									</div>
								</div>
							</div>
						</div>


						<!--新书上架--划动-第三页-->
						<div class="item">
							<div class="row">
								<div class="col-md-4">
									<div class="thumbnail">
										<a href="#"><img src="img/newbook3-1.jpg" alt="民主的逻辑" /></a>
										<div class="caption">
											<a href="#" class="text">民主的逻辑</a><br> <span
												class="text-warning">包刚升</span><br> <span
												class="price_afterdiscount">¥46.00</span> <span
												class="price_beforediscount">¥78.00</span>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="thumbnail">
										<a href="#"><img src="img/newbook3-2.jpg" alt="遮蔽的天空" /></a>
										<div class="caption">
											<a href="#" class="text">遮蔽的天空</a><br> <span
												class="text-warning">（美）保罗·鲍尔斯</span><br> <span
												class="price_afterdiscount">¥36.80</span> <span
												class="price_beforediscount">¥49.00</span>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="thumbnail">
										<a href="#"><img src="img/newbook3-3.jpg" alt="谁的青春不迷茫" /></a>
										<div class="caption">
											<a href="#" class="text">谁的青春不迷茫</a><br> <span
												class="text-warning">刘同</span><br> <span
												class="price_afterdiscount">¥37.80</span> <span
												class="price_beforediscount">¥45.00</span>
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-4">
									<div class="thumbnail">
										<a href="#"><img src="img/newbook3-4.jpg" alt="大破局：中国经济新" /></a>
										<div class="caption">
											<a href="#" class="text">大破局：中国经济新</a><br> <span
												class="text-warning">叶檀 </span><br> <span
												class="price_afterdiscount">¥32.30</span> <span
												class="price_beforediscount">¥49.80</span>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="thumbnail">
										<a href="#"><img src="img/newbook3-5.jpg"
											alt="你的努力，要配得上你的野心" /></a>
										<div class="caption">
											<a href="#" class="text">你的努力</a><br> <span
												class="text-warning">李尚龙 </span><br> <span
												class="price_afterdiscount">¥37.80</span> <span
												class="price_beforediscount">¥45.00</span>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="thumbnail">
										<a href="#"><img src="img/newbook3-6.jpg" alt="森林鱼童书" /></a>
										<div class="caption">
											<a href="#" class="text">森林鱼童书</a><br> <span
												class="text-warning">［美］南茜?威拉 </span><br> <span
												class="price_afterdiscount">¥117.40</span> <span
												class="price_beforediscount">¥195.60</span>
										</div>
									</div>
								</div>
							</div>
						</div>


						<!--打算左右按键按钮--目前未成功-->
						<!--<a href="#content-classification-middle-newbook" data-slide="prev" class="left carousel-control">
								<button class="btn btn-info"><span class="glyphicon glyphicon-chevron-left"></span></button></a>
								
								<a href="#content-classification-middle-newbook" data-slide="next" class="right carousel-control">
								<button class="btn btn-info"><span class="glyphicon glyphicon-chevron-right"></span></button></a>-->
					</div>
				</div>


			</div>


			<!--中间部分--图书分类--中间部分--右边部分-->
			<div id="content-classification-right">

				<!--中间部分--图书分类--中间部分--右边部分--最新动态-->
				<div id="content-classification-right-top">
					<p>最新动态</p>
					<ul>
						<li><a href="#">纪念徐悲鸿逝世65周年</a></li>
						<li><a href="#">社科经管超级品类日，每满100减50</a></li>
						<li><a href="#">生活狠任性，每满100减50</a></li>
					</ul>
				</div>

				<!--中间部分--图书分类--中间部分--右边部分--新书预售-->
				<div id="content-classification-right-mid">
					<div id="content-classification-right-mid-up">
						<span>新书预售</span> <a href="#">预售更多</a>
					</div>

					<!--新书预售划动--菜单-->
					<div id="content-classification-right-mid-down"
						class="carousel slide media">
						<ol class="carousel-indicators">
							<li data-target="#content-classification-right-mid-down"
								data-slide-to="0" class="active"></li>
							<li data-target="#content-classification-right-mid-down"
								data-slide-to="1"></li>
							<li data-target="#content-classification-right-mid-down"
								data-slide-to="2"></li>
							<li data-target="#content-classification-right-mid-down"
								data-slide-to="3"></li>
							<li data-target="#content-classification-right-mid-down"
								data-slide-to="4"></li>
						</ol>
						<div class="carousel-inner">
							<div class="item active">
								<div class="media-left">
									<a href="#"><img src="img/商博良.jpg" alt="商博良"
										class="media-object"></a>
								</div>
								<div class="media-body">
									<a href="#" style="line-height: 80px;">九州飘零书：商博良</a>
									<p>
										<span class="price_afterdiscount">￥41.80</span>
									</p>
									<p>
										<span class="price_beforediscount">￥58.00</span>
									</p>
								</div>
							</div>
							<div class="item">
								<div class="media-left">
									<a href="#"><img src="img/逃离疯人院.jpg" alt="逃离疯人院"
										class="media-object"></a>
								</div>
								<div class="media-body">
									<a href="#" style="line-height: 80px;">逃离疯人院</a>
									<p>
										<span class="price_afterdiscount">￥32.37</span>
									</p>
									<p>
										<span class="price_beforediscount">￥49.80</span>
									</p>
								</div>
							</div>
							<div class="item">
								<div class="media-left">
									<a href="#"><img src="img/养育男孩.jpg" alt="养育男孩"
										class="media-object"></a>
								</div>
								<div class="media-body">
									<a href="#" style="line-height: 80px;">养育男孩</a>
									<p>
										<span class="price_afterdiscount">￥28.80</span>
									</p>
									<p>
										<span class="price_beforediscount">￥32.00</span>
									</p>
								</div>
							</div>
							<div class="item">
								<div class="media-left">
									<a href="#"><img src="img/培生儿童英语.jpg" alt="培生儿童英语"
										class="media-object"></a>
								</div>
								<div class="media-body">
									<a href="#" style="line-height: 80px;">培生儿童英语</a>
									<p>
										<span class="price_afterdiscount">￥104.70</span>
									</p>
									<p>
										<span class="price_beforediscount">￥178.00</span>
									</p>
								</div>
							</div>
							<div class="item">
								<div class="media-left">
									<a href="#"><img src="img/多媒体纸上图书馆.jpg" alt="多媒体纸上图书馆"
										class="media-object"></a>
								</div>
								<div class="media-body">
									<a href="#" style="line-height: 80px;">多媒体纸上图书馆</a>
									<p>
										<span class="price_afterdiscount">￥202.00</span>
									</p>
									<p>
										<span class="price_beforediscount">￥204.00</span>
									</p>
								</div>
							</div>
						</div>
						<a href="#content-classification-right-mid-down" data-slide="prev"
							class="left carousel-control"> <span
							class="glyphicon glyphicon-chevron-left"></span>
						</a> <a href="#content-classification-right-mid-down"
							data-slide="next" class="right carousel-control"> <span
							class="glyphicon glyphicon-chevron-right"></span>
						</a>
					</div>
				</div>


				<!--中间部分--图书分类--中间部分--右边部分--新书热卖榜-->
				<div id="content-classification-right-down-up">
					<span class="glyphicon glyphicon-certificate"></span> <a href="#">新书热卖榜</a>
				</div>

				<!--中间部分--图书分类--中间部分--右边部分--新书热卖榜--具体排行-->
				<div id="content-classification-right-down" class="list-group">
					<ul class="nav nav-tabs nav-justified">
						<li class="active"><a href="#total_list" data-toggle="tab">总榜</a></li>
						<li><a href="#children" data-toggle="tab">童书</a></li>
						<li><a href="#novel" data-toggle="tab">小说</a></li>
						<li><a href="#literature" data-toggle="tab">文学</a></li>
						<li><a href="#teaching_material" data-toggle="tab">教材</a></li>
					</ul>

					<!--新书热卖榜--具体分类-->
					<div class="tab-content">

						<!--新书热卖榜--总榜-->
						<div class="tab-pane active fade in" id="total_list">
							<div class="list-group">
								<a href="#" class="list-group-item">1、范志红健康日历2019</a> <a
									href="#" class="list-group-item">2、半小时漫画中国史1+中国史</a> <a
									href="#" class="list-group-item">3、写给父母的未来之书</a> <a href="#"
									class="list-group-item">4、4韭菜的自我修养</a> <a href="#"
									class="list-group-item">5、软刺</a> <a href="#"
									class="list-group-item">6、丰子恺万般滋味，都是生活</a> <a href="#"
									class="list-group-item">7、无所畏</a> <a href="#"
									class="list-group-item">8、好好说话2</a> <a href="#"
									class="list-group-item">9、九州飘零书：商博良</a> <a href="#"
									class="list-group-item">10、落叶跳舞</a>
							</div>
						</div>

						<!--新书热卖榜--童书-->
						<div class="tab-pane fade in" id="children">
							<div class="list-group">
								<a href="#" class="list-group-item">1、落叶跳舞</a> <a href="#"
									class="list-group-item">2、小读客·这是什么呀·3~6岁</a> <a href="#"
									class="list-group-item">3、小学语文必读儿童文学名家</a> <a href="#"
									class="list-group-item">4、小熊宝宝绘本</a> <a href="#"
									class="list-group-item">5、100层的房子</a> <a href="#"
									class="list-group-item">6、彩虹色的花</a> <a href="#"
									class="list-group-item">7、一口袋的吻</a> <a href="#"
									class="list-group-item">8、神奇树屋·美国国宝级童书</a> <a href="#"
									class="list-group-item">9、蚂蚁和西瓜</a> <a href="#"
									class="list-group-item">10、时间的历史</a>
							</div>
						</div>

						<!--新书热卖榜--小说-->
						<div class="tab-pane fade in" id="novel">
							<div class="list-group">
								<a href="#" class="list-group-item">1、软刺</a> <a href="#"
									class="list-group-item">2、一个人的朝圣</a> <a href="#"
									class="list-group-item">3、遮蔽的天空</a> <a href="#"
									class="list-group-item">4、尘埃之书</a> <a href="#"
									class="list-group-item">5、圣殿春秋</a> <a href="#"
									class="list-group-item">6、大树</a> <a href="#"
									class="list-group-item">7、十二个明天</a> <a href="#"
									class="list-group-item">8、守夜者2:黑暗潜能</a> <a href="#"
									class="list-group-item">9、藏海花</a> <a href="#"
									class="list-group-item">10、学生节的日子</a>
							</div>
						</div>

						<!--新书热卖榜--文学-->
						<div class="tab-pane fade in" id="literature">
							<div class="list-group">
								<a href="#" class="list-group-item">1、丰子恺万般滋味，都是生活</a> <a
									href="#" class="list-group-item">2、无所谓</a> <a href="#"
									class="list-group-item">3、不三</a> <a href="#"
									class="list-group-item">4、灵魂的香气的女子</a> <a href="#"
									class="list-group-item">5、日食记</a> <a href="#"
									class="list-group-item">6、中国诗词大会第三季上下册</a> <a href="#"
									class="list-group-item">7、你要去相信，没有到不了的明天</a> <a href="#"
									class="list-group-item">8、写给幸福</a> <a href="#"
									class="list-group-item">9、书中自有声色</a> <a href="#"
									class="list-group-item">10、南极之南</a>
							</div>
						</div>

						<!--新书热卖榜--教材-->
						<div class="tab-pane fade in" id="teaching_material">
							<div class="list-group">
								<a href="#" class="list-group-item">1、妇产科学</a> <a href="#"
									class="list-group-item">2、内科学</a> <a href="#"
									class="list-group-item">3、法理学</a> <a href="#"
									class="list-group-item">4、儿科学</a> <a href="#"
									class="list-group-item">5、宪法学讲义</a> <a href="#"
									class="list-group-item">6、新闻学概念</a> <a href="#"
									class="list-group-item">7、外科学</a> <a href="#"
									class="list-group-item">8、生理学</a> <a href="#"
									class="list-group-item">9、系统解剖学</a> <a href="#"
									class="list-group-item">10、神经病学</a>
							</div>
						</div>
					</div>
					<a href="#">查看完整榜单>>></a>
				</div>
			</div>
		</div>

		<!--独家特供-分类头部-->
		<div id="content-supply">

			<!--独家特供--分类排行-->
			<div id="content-supply-left">
				<ul class="nav nav-tabs nav-justified">
					<li class="active"><a href="#main" data-toggle="tab">主打</a></li>
					<li><a href="#picture-child" data-toggle="tab">儿童</a></li>
					<li><a href="#picture-literature" data-toggle="tab">文艺</a></li>
					<li><a href="#picture-novel" data-toggle="tab">小说</a></li>
					<li><a href="#picture-young" data-toggle="tab">青春励志</a></li>
					<li><a href="#picture-manage" data-toggle="tab">经管</a></li>
					<li><a href="#picture-live" data-toggle="tab">生活</a></li>
					<li><a href="#picture-teach" data-toggle="tab">教育</a></li>
					<li><a href="#picture-ebooks" data-toggle="tab">电子书</a></li>
				</ul>

				<!--独家特供-具体分类-->

				<div class="tab-content">
					<!--独家特供-主打-详细-->
					<div class="tab-pane active fade in" id="main">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="book_importantThings.jsp"><img
										src="img/25233424-1_l_3.jpg" alt="那些重要的事" /></a>
									<div class="caption">
										<a href="#" class="text">那些重要的事</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥41.80</span> <span
											class="price_beforediscount">￥58.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="book_sand.jsp"><img src="img/25297179-1_l_6.jpg"
										alt="沙海" /></a>
									<div class="caption">
										<a href="#" class="text">沙海</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥69.80</span> <span
											class="price_beforediscount">￥69.80</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="book_ChineseClassicalLiterature.jsp"><img
										src="img/中国古典文学四大名著.jpg" alt="中国古典文学四大名著" /></a>
									<div class="caption">
										<a href="#" class="text">中国古典文学四大名著</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥86.30</span> <span
											class="price_beforediscount">￥97.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/我们的经典.jpg" alt="我们的经典" /></a>
									<div class="caption">
										<a href="#" class="text">我们的经典</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥374.20</span> <span
											class="price_beforediscount">￥422.00</span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/失乐园.jpg" alt="失乐园" /></a>
									<div class="caption">
										<a href="#" class="text">失乐园</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥38.70</span> <span
											class="price_beforediscount">￥45.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/永不放弃.jpg" alt="永不放弃" /></a>
									<div class="caption">
										<a href="#" class="text">永不放弃</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥46.40</span> <span
											class="price_beforediscount">￥58.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/DK素描之书.jpg" alt="DK素描之书" /></a>
									<div class="caption">
										<a href="#" class="text">DK素描之书</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥102.40</span> <span
											class="price_beforediscount">￥128.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/好想去这样那样的国.jpg" alt="好想去这样那样的国" /></a>
									<div class="caption">
										<a href="#" class="text">好想去这样那样的国</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥113.40</span> <span
											class="price_beforediscount">￥126.00</span>
									</div>
								</div>
							</div>
						</div>
					</div>

					<!--独家特供-童书-详细-->

					<div class="tab-pane fade in" id="picture-child">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/child1.jpg" alt="全景世界史" /></a>
									<div class="caption">
										<a href="#" class="text">全景世界史</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥235.00</span> <span
											class="price_beforediscount">￥248.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/child2.jpg" alt="花格子大象艾玛宝宝" /></a>
									<div class="caption">
										<a href="#" class="text">花格子大象艾玛宝宝</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥247.20</span> <span
											class="price_beforediscount">￥386.20</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/child3.jpg" alt="米菲绘本第一辑10册" /></a>
									<div class="caption">
										<a href="#" class="text">米菲绘本第一辑10册</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥132.80</span> <span
											class="price_beforediscount">￥158.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/child4.jpg" alt="去探险" /></a>
									<div class="caption">
										<a href="#" class="text">去探险</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥135.90</span> <span
											class="price_beforediscount">￥158.00</span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/child5.jpg" alt="少年读史记" /></a>
									<div class="caption">
										<a href="#" class="text">少年读史记</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥84.00</span> <span
											class="price_beforediscount">￥100.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/child6.jpg" alt="世界第一少年侦探团" /></a>
									<div class="caption">
										<a href="#" class="text">世界第一少年侦探团</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥80.30</span> <span
											class="price_beforediscount">￥118.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/child7.jpg" alt="你好！世界" /></a>
									<div class="caption">
										<a href="#" class="text">你好！世界</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥159.90</span> <span
											class="price_beforediscount">￥199.80</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/child8.jpg" alt="14只老鼠全集" /></a>
									<div class="caption">
										<a href="#" class="text">14只老鼠全集</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥203.10</span> <span
											class="price_beforediscount">￥225.60</span>
									</div>
								</div>
							</div>
						</div>
					</div>

					<!--独家特供-文艺-详细-->

					<div class="tab-pane fade in" id="picture-literature">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/literature1.jpg" alt="万般滋味，都是生" /></a>
									<div class="caption">
										<a href="#" class="text">万般滋味，都是生</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥33.60</span> <span
											class="price_beforediscount">￥42.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/literature2.jpg" alt="我们仨" /></a>
									<div class="caption">
										<a href="#" class="text">我们仨</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥38.70</span> <span
											class="price_beforediscount">￥43.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/literature3.jpg" alt="一本书读完最美古诗" /></a>
									<div class="caption">
										<a href="#" class="text">一本书读完最美古诗</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥37.90</span> <span
											class="price_beforediscount">￥49.80</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/literature4.jpg" alt="上美老版经典故事连" /></a>
									<div class="caption">
										<a href="#" class="text">上美老版经典故事连</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥896.00</span> <span
											class="price_beforediscount">￥1280.00</span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/literature5.jpg" alt="21天精通素描" /></a>
									<div class="caption">
										<a href="#" class="text">21天精通素描</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥39.90</span> <span
											class="price_beforediscount">￥49.80</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/literature6.jpg" alt="品中国文人（全四" /></a>
									<div class="caption">
										<a href="#" class="text">品中国文人（全四</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥83.10</span> <span
											class="price_beforediscount">￥151.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/literature7.jpg" alt="寄世书：鹤来" /></a>
									<div class="caption">
										<a href="#" class="text">寄世书：鹤来</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥66.00</span> <span
											class="price_beforediscount">￥88.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/literature8.jpg" alt="单反摄影宝典" /></a>
									<div class="caption">
										<a href="#" class="text">单反摄影宝典</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥69.50</span> <span
											class="price_beforediscount">￥89.00</span>
									</div>
								</div>
							</div>
						</div>
					</div>


					<!--独家特供-小说-详细-->

					<div class="tab-pane fade in" id="picture-novel">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/novel1.jpg" alt="人间失格" /></a>
									<div class="caption">
										<a href="#" class="text">人间失格</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥18.80</span> <span
											class="price_beforediscount">￥25.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/novel2.jpg" alt="方岛" /></a>
									<div class="caption">
										<a href="#" class="text">方岛</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥43.40</span> <span
											class="price_beforediscount">￥55.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/novel3.jpg" alt="东野圭吾作品：假面" /></a>
									<div class="caption">
										<a href="#" class="text">东野圭吾作品：假面</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥99.70</span> <span
											class="price_beforediscount">￥137.60</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/novel4.jpg" alt="焚曲" /></a>
									<div class="caption">
										<a href="#" class="text">焚曲</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥26.10</span> <span
											class="price_beforediscount">￥42.80</span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/novel5.jpg" alt="肯·福莱特世纪三部" /></a>
									<div class="caption">
										<a href="#" class="text">肯·福莱特世纪三部</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥214.90</span> <span
											class="price_beforediscount">￥429.80</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/novel6.jpg" alt="滴泪痣" /></a>
									<div class="caption">
										<a href="#" class="text">滴泪痣</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥45.60</span> <span
											class="price_beforediscount">￥59.80</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/novel7.jpg" alt="化身" /></a>
									<div class="caption">
										<a href="#" class="text">化身</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥40.70</span> <span
											class="price_beforediscount">￥59.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/novel8.jpg" alt="瞬间" /></a>
									<div class="caption">
										<a href="#" class="text">瞬间</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥20.80</span> <span
											class="price_beforediscount">￥32.00</span>
									</div>
								</div>
							</div>
						</div>
					</div>


					<!--独家特供-青春励志-详细-->

					<div class="tab-pane fade in" id="picture-young">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/young1.jpg" alt="决定你成功的不是情" /></a>
									<div class="caption">
										<a href="#" class="text">决定你成功的不是情</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥28.60</span> <span
											class="price_beforediscount">￥39.80</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/young2.jpg" alt="别让你的焦虑，拖累" /></a>
									<div class="caption">
										<a href="#" class="text">别让你的焦虑，拖累</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥26.40</span> <span
											class="price_beforediscount">￥45.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/young3.jpg" alt="滕王阁秘闻" /></a>
									<div class="caption">
										<a href="#" class="text">滕王阁秘闻</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥80.90</span> <span
											class="price_beforediscount">￥98.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/young4.jpg" alt="呼叫空港" /></a>
									<div class="caption">
										<a href="#" class="text">呼叫空港</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥31.90</span> <span
											class="price_beforediscount">￥39.80</span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/young5.jpg" alt="一个人的修养，看失" /></a>
									<div class="caption">
										<a href="#" class="text">一个人的修养，看失</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥28.90</span> <span
											class="price_beforediscount">￥38.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/young6.jpg" alt="内向者的沟通课" /></a>
									<div class="caption">
										<a href="#" class="text">内向者的沟通课</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥33.60</span> <span
											class="price_beforediscount">￥42.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/young7.jpg" alt="火鸟" /></a>
									<div class="caption">
										<a href="#" class="text">火鸟</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥666.00</span> <span
											class="price_beforediscount">￥888.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/young8.jpg" alt="窝在角落好安心2 角" /></a>
									<div class="caption">
										<a href="#" class="text">窝在角落好安心2 角</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥25.80</span> <span
											class="price_beforediscount">￥39.80</span>
									</div>
								</div>
							</div>
						</div>
					</div>


					<!--独家特供-经管-详细-->

					<div class="tab-pane fade in" id="picture-manage">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/manage1.jpg" alt="谈判：如何在博弈中" /></a>
									<div class="caption">
										<a href="#" class="text">谈判：如何在博弈中</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥35.60</span> <span
											class="price_beforediscount">￥45.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/manage2.jpg" alt="大败局1、2" /></a>
									<div class="caption">
										<a href="#" class="text">大败局1、2</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥69.30</span> <span
											class="price_beforediscount">￥80.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/manage3.jpg" alt="财务自由之路：7年" /></a>
									<div class="caption">
										<a href="#" class="text">财务自由之路：7年</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥40.00</span> <span
											class="price_beforediscount">￥58.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/manage4.jpg" alt="励志与管理手册丛" /></a>
									<div class="caption">
										<a href="#" class="text">励志与管理手册丛</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥38.20</span> <span
											class="price_beforediscount">￥128.00</span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/manage5.jpg" alt="斯坦福极简经济学" /></a>
									<div class="caption">
										<a href="#" class="text">斯坦福极简经济学</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥42.60</span> <span
											class="price_beforediscount">￥48.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/manage6.jpg" alt="工匠精神：向价值型" /></a>
									<div class="caption">
										<a href="#" class="text">工匠精神：向价值型</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥36.20</span> <span
											class="price_beforediscount">￥39.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/manage7.jpg" alt="林毅夫文集 经济学" /></a>
									<div class="caption">
										<a href="#" class="text">林毅夫文集 经济学</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥173.80</span> <span
											class="price_beforediscount">￥220.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/manage8.jpg" alt="高效能人士的七个习" /></a>
									<div class="caption">
										<a href="#" class="text">高效能人士的七个习</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥88.50</span> <span
											class="price_beforediscount">￥118.00</span>
									</div>
								</div>
							</div>
						</div>
					</div>


					<!--独家特供-生活-详细-->

					<div class="tab-pane fade in" id="picture-live">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/live1.jpg" alt="给孩子的50堂情商课" /></a>
									<div class="caption">
										<a href="#" class="text">给孩子的50堂情商课</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥25.60</span> <span
											class="price_beforediscount">￥39.80</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/live2.jpg" alt="小家，越住越大" /></a>
									<div class="caption">
										<a href="#" class="text">小家，越住越大</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥39.50</span> <span
											class="price_beforediscount">￥68.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/live3.jpg" alt="最好的养育，是让孩" /></a>
									<div class="caption">
										<a href="#" class="text">最好的养育，是让孩</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥24.30</span> <span
											class="price_beforediscount">￥39.80</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/live4.jpg" alt="家常菜精选1288" /></a>
									<div class="caption">
										<a href="#" class="text">家常菜精选1288</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥14.40</span> <span
											class="price_beforediscount">￥29.80</span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/live5.jpg" alt="愉快地吃，痛快地瘦" /></a>
									<div class="caption">
										<a href="#" class="text">愉快地吃，痛快地瘦</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥43.50</span> <span
											class="price_beforediscount">￥58.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/live6.jpg" alt="儿童社交的爱与痛" /></a>
									<div class="caption">
										<a href="#" class="text">儿童社交的爱与痛</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥75.70</span> <span
											class="price_beforediscount">￥87.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/live7.jpg" alt="游戏力经典套装" /></a>
									<div class="caption">
										<a href="#" class="text">游戏力经典套装</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥84.40</span> <span
											class="price_beforediscount">￥97.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/live8.jpg" alt="男人这东西" /></a>
									<div class="caption">
										<a href="#" class="text">男人这东西</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥25.30</span> <span
											class="price_beforediscount">￥39.00</span>
									</div>
								</div>
							</div>
						</div>
					</div>


					<!--独家特供-教育-详细-->

					<div class="tab-pane fade in" id="picture-teach">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/teach1.jpg" alt="教师资格证考试用书" /></a>
									<div class="caption">
										<a href="#" class="text">教师资格证考试用书</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥89.00</span> <span
											class="price_beforediscount">￥168.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/teach2.jpg" alt="小学生作文优秀辅导" /></a>
									<div class="caption">
										<a href="#" class="text">小学生作文优秀辅导</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥15.20</span> <span
											class="price_beforediscount">￥22.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/teach3.jpg" alt="安徒生童话" /></a>
									<div class="caption">
										<a href="#" class="text">安徒生童话</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥17.80</span> <span
											class="price_beforediscount">￥20.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/teach4.jpg" alt="小学生作文套装共4" /></a>
									<div class="caption">
										<a href="#" class="text">小学生作文套装共4</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥73.00</span> <span
											class="price_beforediscount">￥91.20</span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/teach5.jpg" alt="2018春 小学生生字" /></a>
									<div class="caption">
										<a href="#" class="text">2018春 小学生生字</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥12.00</span> <span
											class="price_beforediscount">￥15.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/teach6.jpg" alt="商务印书馆民国老课" /></a>
									<div class="caption">
										<a href="#" class="text">商务印书馆民国老课</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥139.20</span> <span
											class="price_beforediscount">￥174.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/teach7.jpg" alt="语文地图" /></a>
									<div class="caption">
										<a href="#" class="text">语文地图</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥159.40</span> <span
											class="price_beforediscount">￥199.20</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/teach8.jpg" alt="68所名校教科所" /></a>
									<div class="caption">
										<a href="#" class="text">68所名校教科所</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥42.40</span> <span
											class="price_beforediscount">￥53.00</span>
									</div>
								</div>
							</div>
						</div>
					</div>


					<!--独家特供-电子书-详细-->

					<div class="tab-pane fade in" id="picture-ebooks">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/ebooks1.jpg" alt="行动变现：如何让我" /></a>
									<div class="caption">
										<a href="#" class="text">行动变现：如何让我</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥19.99</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/ebooks2.jpg" alt="一个人的修养，看失" /></a>
									<div class="caption">
										<a href="#" class="text">一个人的修养，看失</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥11.40</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/ebooks3.jpg" alt="后背留给我" /></a>
									<div class="caption">
										<a href="#" class="text">后背留给我</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥11.99</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/ebooks4.jpg" alt="淘宝运营速成指南" /></a>
									<div class="caption">
										<a href="#" class="text">淘宝运营速成指南</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥52.99</span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/ebooks5.jpg" alt="上帝怀中的羔羊" /></a>
									<div class="caption">
										<a href="#" class="text">上帝怀中的羔羊</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥12.99</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/ebooks6.jpg" alt="猛虎工作法" /></a>
									<div class="caption">
										<a href="#" class="text">猛虎工作法</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥11.90</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/ebooks7.jpg" alt="旅程结束时" /></a>
									<div class="caption">
										<a href="#" class="text">旅程结束时</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥11.99</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/ebooks8.jpg" alt="终身学习" /></a>
									<div class="caption">
										<a href="#" class="text">终身学习</a><br> <span
											class="glyphicon glyphicon-book"></span> <span
											class="text-success">当当独家特供</span><br> <span
											class="price_afterdiscount">￥9.99</span>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>

			<!--图书畅销榜-->
			<div id="content-supply-right">

				<!--图书畅销榜--头部-->
				<div id="content-supply-right-top">
					<span class="glyphicon glyphicon-certificate"></span> <a href="#">图书畅销榜</a>
				</div>

				<!--图书畅销榜---分类---->
				<div id="content-supply-right-down" class="list-group">
					<ul class="nav nav-tabs nav-justified">
						<li class="active"><a href="#total_list2" data-toggle="tab">总榜</a></li>
						<li><a href="#children2" data-toggle="tab">童书</a></li>
						<li><a href="#philosophy" data-toggle="tab">哲学</a></li>
						<li><a href="#psychology" data-toggle="tab">心理</a></li>
						<li><a href="#ancient_books" data-toggle="tab">古籍</a></li>
					</ul>
					<div class="tab-content">
						<!--图书畅销榜-总榜排名-->
						<div class="tab-pane active fade in" id="total_list2">
							<div class="list-group">
								<a href="#" class="list-group-item">1、活着</a> <a href="#"
									class="list-group-item">2、雪落香杉树</a> <a href="#"
									class="list-group-item">3、小熊和最好的爸爸</a> <a href="#"
									class="list-group-item">4、我喜欢生命本来的样子</a> <a href="#"
									class="list-group-item">5、神奇校车(图画书版)</a> <a href="#"
									class="list-group-item">6、我的第一本地理启蒙书</a> <a href="#"
									class="list-group-item">7、神奇校车(桥梁书版)</a> <a href="#"
									class="list-group-item">8、你坏</a> <a href="#"
									class="list-group-item">9、正门管教</a> <a href="#"
									class="list-group-item">10、月亮与六便士</a>
							</div>
						</div>

						<!--图书畅销榜-童书排名-->
						<div class="tab-pane fade in" id="children2">
							<div class="list-group">
								<a href="#" class="list-group-item">1、我的第一本地理启蒙书</a> <a href="#"
									class="list-group-item">2、神奇校车·图画书版</a> <a href="#"
									class="list-group-item">3、小熊和最好的爸爸</a> <a href="#"
									class="list-group-item">4、神奇校车(桥梁书版)</a> <a href="#"
									class="list-group-item">5、在教室说错了没关系</a> <a href="#"
									class="list-group-item">6、少年读史记</a> <a href="#"
									class="list-group-item">7、夏洛的网</a> <a href="#"
									class="list-group-item">8、这就是二十四节气</a> <a href="#"
									class="list-group-item">9、魔法拼音国</a> <a href="#"
									class="list-group-item">10、不一样的卡梅拉手绘本</a>
							</div>
						</div>

						<!--图书畅销榜-哲学排名-->
						<div class="tab-pane fade in" id="philosophy">
							<div class="list-group">
								<a href="#" class="list-group-item">1、论语译注</a> <a href="#"
									class="list-group-item">2、美的历程</a> <a href="#"
									class="list-group-item">3、理想国</a> <a href="#"
									class="list-group-item">4、复旦名师陈果:好的孤独</a> <a href="#"
									class="list-group-item">5、论语心得</a> <a href="#"
									class="list-group-item">6、简单的逻辑学</a> <a href="#"
									class="list-group-item">7、学会提问</a> <a href="#"
									class="list-group-item">8、人生的智慧</a> <a href="#"
									class="list-group-item">9、中国哲学简史</a> <a href="#"
									class="list-group-item">10、论语别裁</a>
							</div>
						</div>

						<!--图书畅销榜-心理排名-->
						<div class="tab-pane fade in" id="psychology">
							<div class="list-group">
								<a href="#" class="list-group-item">1、天才在左 疯子在右</a> <a href="#"
									class="list-group-item">2、乌合之众</a> <a href="#"
									class="list-group-item">3、墨菲定律</a> <a href="#"
									class="list-group-item">4、自控力</a> <a href="#"
									class="list-group-item">5、微表情心理学</a> <a href="#"
									class="list-group-item">6、群体时代大众心理</a> <a href="#"
									class="list-group-item">7、天生变态狂</a> <a href="#"
									class="list-group-item">8、心理学与生活</a> <a href="#"
									class="list-group-item">9、儿童教育心理学</a> <a href="#"
									class="list-group-item">10、自卑与超越</a>
							</div>
						</div>

						<!--图书畅销榜-古籍排名-->
						<div class="tab-pane fade in" id="ancient_books">
							<div class="list-group">
								<a href="#" class="list-group-item">1、鬼谷子-中华经典藏书</a> <a href="#"
									class="list-group-item">2、古文观止（上下）</a> <a href="#"
									class="list-group-item">3、世说新语（新）</a> <a href="#"
									class="list-group-item">4、诗经（上下册）</a> <a href="#"
									class="list-group-item">5、菜根谭-中华经典藏书</a> <a href="#"
									class="list-group-item">6、古文观止（上下）-中国经典</a> <a href="#"
									class="list-group-item">7、山海经</a> <a href="#"
									class="list-group-item">8、史记</a> <a href="#"
									class="list-group-item">9、世说新语</a> <a href="#"
									class="list-group-item">10、人间词话 汇编汇校汇评</a>
							</div>
						</div>
					</div>
					<a href="#">查看完整榜单>>></a>
				</div>
			</div>
		</div>
		<!--中间部分--上三连图片-->
		<div id="content-picture">
			<div class="row">
				<div class="col-md-4">
					<div class="thumbnail">
						<a href="#"><img src="img/9003260090499602_1_o.jpg"
							alt="picture1" /></a>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<a href="#"><img src="img/daguanhonglou382140.jpg"
							alt="pictur2" /></a>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<a href="#"><img src="img/DK_ZSSMY_20180904_382_140.jpg"
							alt="picture3" /></a>
					</div>
				</div>
			</div>
		</div>

		<!--主编推荐-->
		<div id="content-supply">
			<!--主编推荐--左边-->
			<div id="content-supply-left">
				<!--主编推荐--分类头部-->
				<ul class="nav nav-tabs nav-justified">
					<li class="active"><a href="#main-chief" data-toggle="tab">主打</a></li>
					<li><a href="#picture-child-chief" data-toggle="tab">儿童</a></li>
					<li><a href="#picture-literature-chief" data-toggle="tab">文艺</a></li>
					<li><a href="#picture-novel-chief" data-toggle="tab">小说</a></li>
					<li><a href="#picture-young-chief" data-toggle="tab">青春励志</a></li>
					<li><a href="#picture-manage-chief" data-toggle="tab">经管</a></li>
					<li><a href="#picture-live-chief" data-toggle="tab">生活</a></li>
					<li><a href="#picture-teach-chief" data-toggle="tab">教育</a></li>
					<li><a href="#picture-ebooks-chief" data-toggle="tab">电子书</a></li>
				</ul>


				<!--主编推荐--具体分类内容-->
				<div class="tab-content">
					<!--主编推荐--主打--详细-->
					<div class="tab-pane active fade in" id="main-chief">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/半小时漫画中国史.jpg" alt="半小时漫画中国史" /></a>
									<div class="caption">
										<a href="#" class="text">半小时漫画中国史</a><br> <span
											class="text-warning">陈磊</span><br> <span
											class="price_afterdiscount">￥126.10</span> <span
											class="price_beforediscount">￥159.60</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/云边有个小卖部.jpg" alt="云边有个小卖部" /></a>
									<div class="caption">
										<a href="#" class="text">云边有个小卖部</a><br> <span
											class="text-warning">张嘉佳</span><br> <span
											class="price_afterdiscount">￥32.00</span> <span
											class="price_beforediscount">￥42.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/给孩子立界限.jpg" alt="给孩子立界限" /></a>
									<div class="caption">
										<a href="#" class="text">给孩子立界限</a><br> <span
											class="text-warning">钱儿妈</span><br> <span
											class="price_afterdiscount">￥38.50</span> <span
											class="price_beforediscount">￥52.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/总要习惯一个人.jpg" alt="总要习惯一个人" /></a>
									<div class="caption">
										<a href="#" class="text">总要习惯一个人</a><br> <span
											class="text-warning">蕊希</span><br> <span
											class="price_afterdiscount">￥37.90</span> <span
											class="price_beforediscount">49.80</span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/少有人走的路.jpg" alt="少有人走的路" /></a>
									<div class="caption">
										<a href="#" class="text">少有人走的路</a><br> <span
											class="text-warning">斯科特·派克</span><br> <span
											class="price_afterdiscount">￥150.00</span> <span
											class="price_beforediscount">￥150.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/经营者养成笔记.jpg" alt="经营者养成笔记" /></a>
									<div class="caption">
										<a href="#" class="text">经营者养成笔记</a><br> <span
											class="text-warning">柳井正</span><br> <span
											class="price_afterdiscount">￥54.75</span> <span
											class="price_beforediscount">￥59.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/星火英语四级真题试卷.jpg" alt="星火英语四级真题试卷" /></a>
									<div class="caption">
										<a href="#" class="text">星火英语四级真题试卷</a><br> <span
											class="text-warning">汪开虎</span><br> <span
											class="price_afterdiscount">￥36.80</span> <span
											class="price_beforediscount">￥56.80</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/中国国家博物馆儿童.jpg" alt="中国国家博物馆儿童" /></a>
									<div class="caption">
										<a href="#" class="text">中国国家博物馆儿童</a><br> <span
											class="text-warning">中国国家博物</span><br> <span
											class="price_afterdiscount">192.00</span> <span
											class="price_beforediscount">240.00</span>
									</div>
								</div>
							</div>
						</div>
					</div>

					<!--主编推荐-童书-详细-->

					<div class="tab-pane fade in" id="picture-child-chief">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/child11.jpg" alt="舒克贝塔传" /></a>
									<div class="caption">
										<a href="#" class="text">舒克贝塔传</a><br> <span
											class="text-warning">郑渊洁</span><br> <span
											class="price_afterdiscount">￥159.60</span> <span
											class="price_beforediscount">￥200.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/child21.jpg" alt="五味太郎四季绘本" /></a>
									<div class="caption">
										<a href="#" class="text">五味太郎四季绘本</a><br> <span
											class="text-warning">[日]五味太郎 著/</span><br> <span
											class="price_afterdiscount">￥74.30</span> <span
											class="price_beforediscount">￥116.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/child31.jpg" alt="我和小姐姐克拉拉" /></a>
									<div class="caption">
										<a href="#" class="text">我和小姐姐克拉拉</a><br> <span
											class="text-warning">（德）迪米特尔茵</span><br> <span
											class="price_afterdiscount">￥40.40</span> <span
											class="price_beforediscount">￥48.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/child41.jpg" alt="魔法拼音国" /></a>
									<div class="caption">
										<a href="#" class="text">魔法拼音国</a><br> <span
											class="text-warning">姜自霞</span><br> <span
											class="price_afterdiscount">￥78.40</span> <span
											class="price_beforediscount">￥98.00</span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/child51.jpg" alt="小兔汤姆的成长烦恼" /></a>
									<div class="caption">
										<a href="#" class="text">小兔汤姆的成长烦恼</a><br> <span
											class="text-warning">（法）玛莉-阿丽</span><br> <span
											class="price_afterdiscount">￥113.70</span> <span
											class="price_beforediscount">￥120.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/child61.jpg" alt="有故事的汉字 " /></a>
									<div class="caption">
										<a href="#" class="text">有故事的汉字 </a><br> <span
											class="text-warning">苏真</span><br> <span
											class="price_afterdiscount">￥130.60</span> <span
											class="price_beforediscount">￥192.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/child71.jpg" alt="男孩的冒险书 " /></a>
									<div class="caption">
										<a href="#" class="text">男孩的冒险书 </a><br> <span
											class="text-warning">【英】康恩·伊古</span><br> <span
											class="price_afterdiscount">￥158.40</span> <span
											class="price_beforediscount">￥198.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/child81.jpg" alt="我的第一套自然拼读" /></a>
									<div class="caption">
										<a href="#" class="text">我的第一套自然拼读</a><br> <span
											class="text-warning">[美]诺拉·盖多斯</span><br> <span
											class="price_afterdiscount">￥198.40</span> <span
											class="price_beforediscount">￥248.00</span>
									</div>
								</div>
							</div>
						</div>
					</div>

					<!--主编推荐-文艺-详细-->

					<div class="tab-pane fade in" id="picture-literature-chief">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/literature11.jpg" alt="沉默的大多数" /></a>
									<div class="caption">
										<a href="#" class="text">沉默的大多数</a><br> <span
											class="text-warning">王小波</span><br> <span
											class="price_afterdiscount">￥31.40</span> <span
											class="price_beforediscount">￥32.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/literature21.jpg" alt="天长地久：给美君的" /></a>
									<div class="caption">
										<a href="#" class="text">天长地久：给美君的</a><br> <span
											class="text-warning">龙应台 著,博集天</span><br> <span
											class="price_afterdiscount">￥44.10</span> <span
											class="price_beforediscount">￥58.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/literature31.jpg" alt="日食记" /></a>
									<div class="caption">
										<a href="#" class="text">日食记</a><br> <span
											class="text-warning">姜老刀</span><br> <span
											class="price_afterdiscount">￥42.10</span> <span
											class="price_beforediscount">￥69.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/literature41.jpg" alt="苏东坡传" /></a>
									<div class="caption">
										<a href="#" class="text">苏东坡传</a><br> <span
											class="text-warning">林语堂 著,博集天</span><br> <span
											class="price_afterdiscount">￥38.30</span> <span
											class="price_beforediscount">￥48.00</span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/literature51.jpg" alt="浮生如梦" /></a>
									<div class="caption">
										<a href="#" class="text">浮生如梦</a><br> <span
											class="text-warning">梁实秋</span><br> <span
											class="price_afterdiscount">￥34.90</span> <span
											class="price_beforediscount">￥49.80</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/literature61.jpg" alt="北斋漫画" /></a>
									<div class="caption">
										<a href="#" class="text">北斋漫画</a><br> <span
											class="text-warning">葛饰北斋绘 紫</span><br> <span
											class="price_afterdiscount">￥109.00</span> <span
											class="price_beforediscount">￥168.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/literature71.jpg" alt="楚辞选：黄永玉插图" /></a>
									<div class="caption">
										<a href="#" class="text">楚辞选：黄永玉插图</a><br> <span
											class="text-warning">[战国]屈原 宋玉 </span><br> <span
											class="price_afterdiscount">￥70.40</span> <span
											class="price_beforediscount">￥88.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/literature81.jpg" alt="与脆弱同行" /></a>
									<div class="caption">
										<a href="#" class="text">与脆弱同行</a><br> <span
											class="text-warning">（法） 让·克劳</span><br> <span
											class="price_afterdiscount">￥27.50</span> <span
											class="price_beforediscount">￥45.00</span>
									</div>
								</div>
							</div>
						</div>
					</div>


					<!--主编推荐-小说-详细-->

					<div class="tab-pane fade in" id="picture-novel-chief">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/novel11.jpg" alt="那不勒斯的萤火" /></a>
									<div class="caption">
										<a href="#" class="text">那不勒斯的萤火</a><br> <span
											class="text-warning">马西米利亚诺·</span><br> <span
											class="price_afterdiscount">￥21.00</span> <span
											class="price_beforediscount">￥42.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/novel21.jpg" alt="藏海花" /></a>
									<div class="caption">
										<a href="#" class="text">藏海花</a><br> <span
											class="text-warning">南派三叔</span><br> <span
											class="price_afterdiscount">￥40.40</span> <span
											class="price_beforediscount">￥48.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/novel31.jpg" alt="S.忒修斯之船" /></a>
									<div class="caption">
										<a href="#" class="text">S.忒修斯之船</a><br> <span
											class="text-warning">[美]J.J.艾布拉姆</span><br> <span
											class="price_afterdiscount">￥97.50</span> <span
											class="price_beforediscount">￥168.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/novel41.jpg" alt="时光边缘的男人" /></a>
									<div class="caption">
										<a href="#" class="text">时光边缘的男人</a><br> <span
											class="text-warning">[英]马特·海格</span><br> <span
											class="price_afterdiscount">￥41.90</span> <span
											class="price_beforediscount">￥49.80</span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/novel51.jpg" alt="雪落香杉树 " /></a>
									<div class="caption">
										<a href="#" class="text">雪落香杉树 </a><br> <span
											class="text-warning">戴维·伽特森</span><br> <span
											class="price_afterdiscount">￥49.40</span> <span
											class="price_beforediscount">￥52.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/novel61.jpg" alt="摆渡人" /></a>
									<div class="caption">
										<a href="#" class="text">摆渡人</a><br> <span
											class="text-warning">[英]克莱儿·麦克</span><br> <span
											class="price_afterdiscount">￥17.90</span> <span
											class="price_beforediscount">￥36.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/novel71.jpg" alt="大树" /></a>
									<div class="caption">
										<a href="#" class="text">大树</a><br> <span
											class="text-warning">（法）贝纳尔·韦</span><br> <span
											class="price_afterdiscount">￥33.60</span> <span
											class="price_beforediscount">￥42.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/novel81.jpg" alt="寻找时间的人" /></a>
									<div class="caption">
										<a href="#" class="text">寻找时间的人</a><br> <span
											class="text-warning">作者 凯特·汤普</span><br> <span
											class="price_afterdiscount">￥28.80</span> <span
											class="price_beforediscount">￥36.00</span>
									</div>
								</div>
							</div>
						</div>
					</div>


					<!--主编推荐-青春励志-详细-->

					<div class="tab-pane fade in" id="picture-young-chief">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/young11.jpg" alt="掌控情绪" /></a>
									<div class="caption">
										<a href="#" class="text">掌控情绪</a><br> <span
											class="text-warning">剑圣喵大师</span><br> <span
											class="price_afterdiscount">￥30.60</span> <span
											class="price_beforediscount">￥42.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/young21.jpg" alt="《香蜜沉沉烬如霜》" /></a>
									<div class="caption">
										<a href="#" class="text">《香蜜沉沉烬如霜》</a><br> <span
											class="text-warning">电线 大鱼文化</span><br> <span
											class="price_afterdiscount">￥36.40</span> <span
											class="price_beforediscount">￥56.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/young31.jpg" alt="行动变现" /></a>
									<div class="caption">
										<a href="#" class="text">行动变现</a><br> <span
											class="text-warning">杨小米 著，轻阅</span><br> <span
											class="price_afterdiscount">￥31.90</span> <span
											class="price_beforediscount">￥39.80</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/young41.jpg" alt="老杨的猫头鹰" /></a>
									<div class="caption">
										<a href="#" class="text">老杨的猫头鹰</a><br> <span
											class="text-warning">老杨的猫头鹰</span><br> <span
											class="price_afterdiscount">￥82.40</span> <span
											class="price_beforediscount">￥117.60</span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/young51.jpg" alt="钝感力" /></a>
									<div class="caption">
										<a href="#" class="text">钝感力</a><br> <span
											class="text-warning">渡边淳一著；李迎</span><br> <span
											class="price_afterdiscount">￥20.80</span> <span
											class="price_beforediscount">￥32.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/young61.jpg" alt="九型人格 : 职场高品" /></a>
									<div class="caption">
										<a href="#" class="text">九型人格 : 职场高品</a><br> <span
											class="text-warning">（美）海伦·帕尔</span><br> <span
											class="price_afterdiscount">￥35.40</span> <span
											class="price_beforediscount">￥39.80</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/young71.jpg" alt="如果历史是一群喵" /></a>
									<div class="caption">
										<a href="#" class="text">如果历史是一群喵</a><br> <span
											class="text-warning">肥志</span><br> <span
											class="price_afterdiscount">￥82.10</span> <span
											class="price_beforediscount">￥104.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/young81.jpg" alt="吸引力法则  2018年 角" /></a>
									<div class="caption">
										<a href="#" class="text">吸引力法则 2018年 角</a><br> <span
											class="text-warning">（美）杰克·坎菲</span><br> <span
											class="price_afterdiscount">￥23.90</span> <span
											class="price_beforediscount">￥29.80</span>
									</div>
								</div>
							</div>
						</div>
					</div>


					<!--主编推荐-经管-详细-->

					<div class="tab-pane fade in" id="picture-manage-chief">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/manage11.jpg" alt="领导力21法则:追随" /></a>
									<div class="caption">
										<a href="#" class="text">领导力21法则:追随</a><br> <span
											class="text-warning">(美)约翰C.马克斯</span><br> <span
											class="price_beforediscount">￥45.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/manage21.jpg" alt="抢占心智:产品与品" /></a>
									<div class="caption">
										<a href="#" class="text">抢占心智:产品与品</a><br> <span
											class="text-warning">江南春</span><br> <span
											class="price_afterdiscount">￥43.50</span> <span
											class="price_beforediscount">￥58.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/manage31.jpg" alt="共生：未来企业组织" /></a>
									<div class="caption">
										<a href="#" class="text">共生：未来企业组织</a><br> <span
											class="text-warning">陈春花、赵海然</span><br> <span
											class="price_afterdiscount">￥51.00</span> <span
											class="price_beforediscount">￥68.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/manage41.jpg" alt="无条件增长" /></a>
									<div class="caption">
										<a href="#" class="text">无条件增长</a><br> <span
											class="text-warning">李践，黄强</span><br> <span
											class="price_afterdiscount">￥41.10</span> <span
											class="price_beforediscount">￥59.00</span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/manage51.jpg" alt="生命3.0" /></a>
									<div class="caption">
										<a href="#" class="text">生命3.0</a><br> <span
											class="text-warning">迈克斯·泰格马克</span><br> <span
											class="price_afterdiscount">￥92.60</span> <span
											class="price_beforediscount">￥99.90</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/manage61.jpg" alt="创业在路上 罗永" /></a>
									<div class="caption">
										<a href="#" class="text">创业在路上 罗永</a><br> <span
											class="text-warning">罗永浩</span><br> <span
											class="price_afterdiscount">￥43.50</span> <span
											class="price_beforediscount">￥58.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/manage71.jpg" alt="深度思考：不断逼近" /></a>
									<div class="caption">
										<a href="#" class="text">深度思考：不断逼近</a><br> <span
											class="text-warning">[美]莫琳·希凯 </span><br> <span
											class="price_afterdiscount">￥41.60</span> <span
											class="price_beforediscount">￥48.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/manage81.jpg" alt="活力——稻盛和夫的" /></a>
									<div class="caption">
										<a href="#" class="text">活力——稻盛和夫的</a><br> <span
											class="text-warning">稻盛和夫</span><br> <span
											class="price_afterdiscount">￥27.40</span> <span
											class="price_beforediscount">￥39.80</span>
									</div>
								</div>
							</div>
						</div>
					</div>


					<!--主编推荐-生活-详细-->

					<div class="tab-pane fade in" id="picture-live-chief">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/live11.jpg" alt="美国儿科学会育儿百" /></a>
									<div class="caption">
										<a href="#" class="text">美国儿科学会育儿百</a><br> <span
											class="text-warning">〔美〕斯蒂文·谢</span><br> <span
											class="price_afterdiscount">￥54.90</span> <span
											class="price_beforediscount">￥89.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/live21.jpg" alt="医学就会" /></a>
									<div class="caption">
										<a href="#" class="text">医学就会</a><br> <span
											class="text-warning">懒兔子</span><br> <span
											class="price_afterdiscount">￥43.90</span> <span
											class="price_beforediscount">￥48.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/live31.jpg" alt="武志红经典作品" /></a>
									<div class="caption">
										<a href="#" class="text">武志红经典作品</a><br> <span
											class="text-warning">武志红</span><br> <span
											class="price_afterdiscount">￥36.40</span> <span
											class="price_beforediscount">￥39.80</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/live41.jpg" alt="好妈妈胜过好老师" /></a>
									<div class="caption">
										<a href="#" class="text">好妈妈胜过好老师</a><br> <span
											class="text-warning">尹建莉 著；读客</span><br> <span
											class="price_afterdiscount">￥35.90</span> <span
											class="price_beforediscount">￥49.80</span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/live51.jpg" alt="护肤全书" /></a>
									<div class="caption">
										<a href="#" class="text">护肤全书</a><br> <span
											class="text-warning">庆田朋子 著 快读</span><br> <span
											class="price_afterdiscount">￥30.80</span> <span
											class="price_beforediscount">￥58.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/live61.jpg" alt="崔玉涛图解家庭育" /></a>
									<div class="caption">
										<a href="#" class="text">崔玉涛图解家庭育</a><br> <span
											class="text-warning">崔玉涛</span><br> <span
											class="price_afterdiscount">￥357.20</span> <span
											class="price_beforediscount">￥376.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/live71.jpg" alt="王霄老师的5堂幸福" /></a>
									<div class="caption">
										<a href="#" class="text">王霄老师的5堂幸福</a><br> <span
											class="text-warning">王霄</span><br> <span
											class="price_afterdiscount">￥36.30</span> <span
											class="price_beforediscount">￥49.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/live81.jpg" alt="孩子：挑战" /></a>
									<div class="caption">
										<a href="#" class="text">孩子：挑战</a><br> <span
											class="text-warning">（美）鲁道夫德雷</span><br> <span
											class="price_afterdiscount">￥33.40</span> <span
											class="price_beforediscount">￥48.00</span>
									</div>
								</div>
							</div>
						</div>
					</div>


					<!--主编推荐-教育-详细-->

					<div class="tab-pane fade in" id="picture-teach-chief">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/teach11.jpg" alt="教师资格证考试用书" /></a>
									<div class="caption">
										<a href="#" class="text">教师资格证考试用书</a><br> <span
											class="text-warning">李永新</span><br> <span
											class="price_afterdiscount">￥89.00</span> <span
											class="price_beforediscount">￥168.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/teach21.jpg" alt="稻草人" /></a>
									<div class="caption">
										<a href="#" class="text">稻草人</a><br> <span
											class="text-warning">叶圣陶著</span><br> <span
											class="price_afterdiscount">￥12.60</span> <span
											class="price_beforediscount">￥15.80</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/teach31.jpg" alt="笠翁对韵 中华经典" /></a>
									<div class="caption">
										<a href="#" class="text">笠翁对韵 中华经典</a><br> <span
											class="text-warning">(清) 李渔 著</span><br> <span
											class="price_afterdiscount">￥14.40</span> <span
											class="price_beforediscount">￥18.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/teach41.jpg" alt="公务员考试用书" /></a>
									<div class="caption">
										<a href="#" class="text">公务员考试用书</a><br> <span
											class="text-warning">李永新</span><br> <span
											class="price_afterdiscount">￥127.30</span> <span
											class="price_beforediscount">￥288.00</span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/teach51.jpg" alt="注册会计师教材" /></a>
									<div class="caption">
										<a href="#" class="text">注册会计师教材</a><br> <span
											class="text-warning">中国注册会计师协</span><br> <span
											class="price_afterdiscount">￥71.00</span> <span
											class="price_beforediscount">￥88.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/teach61.jpg" alt="新版 企业人力资源" /></a>
									<div class="caption">
										<a href="#" class="text">新版 企业人力资源</a><br> <span
											class="text-warning">中国就业培训技术</span><br> <span
											class="price_afterdiscount">￥141.50</span> <span
											class="price_beforediscount">￥173.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/teach71.jpg" alt="牛津高阶英汉双解词" /></a>
									<div class="caption">
										<a href="#" class="text">牛津高阶英汉双解词</a><br> <span
											class="text-warning">[英]霍恩比 原著</span><br> <span
											class="price_afterdiscount">￥143.60</span> <span
											class="price_beforediscount">￥169.00</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/teach81.jpg" alt="新东方 四级词汇词" /></a>
									<div class="caption">
										<a href="#" class="text">新东方 四级词汇词</a><br> <span
											class="text-warning">俞敏洪</span><br> <span
											class="price_afterdiscount">￥36.00</span> <span
											class="price_beforediscount">￥48.00</span>
									</div>
								</div>
							</div>
						</div>
					</div>


					<!--主编推荐-电子书-详细-->

					<div class="tab-pane fade in" id="picture-ebooks-chief">
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/ebooks11.jpg" alt="同情者" /></a>
									<div class="caption">
										<a href="#" class="text">同情者</a><br> <span
											class="text-warning">阮清越</span><br> <span
											class="price_afterdiscount">￥39.99</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/ebooks21.jpg" alt="心理罪Ⅱ, 祛除心态" /></a>
									<div class="caption">
										<a href="#" class="text">心理罪Ⅱ, 祛除心态</a><br> <span
											class="text-warning">庞向前</span><br> <span
											class="price_afterdiscount">￥9.90</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/ebooks31.jpg" alt="悉达多" /></a>
									<div class="caption">
										<a href="#" class="text">悉达多</a><br> <span
											class="text-warning">（德）赫尔曼·黑</span><br> <span
											class="price_afterdiscount">￥1.99</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/ebooks41.jpg" alt="狱火烈烈空自华" /></a>
									<div class="caption">
										<a href="#" class="text">狱火烈烈空自华</a><br> <span
											class="text-warning">寒烈</span><br> <span
											class="price_afterdiscount">￥6.99</span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/ebooks51.jpg" alt="你的善意终将改变这" /></a>
									<div class="caption">
										<a href="#" class="text">你的善意终将改变这</a><br> <span
											class="text-warning">莎莉·阿里森,陈</span><br> <span
											class="price_afterdiscount">￥14.99</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/ebooks61.jpg" alt="一万小时天才理论" /></a>
									<div class="caption">
										<a href="#" class="text">一万小时天才理论</a><br> <span
											class="text-warning">丹尼尔?科伊尔</span><br> <span
											class="price_afterdiscount">￥19.90</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/ebooks71.jpg" alt="极简" /></a>
									<div class="caption">
										<a href="#" class="text">极简</a><br> <span
											class="text-warning">（美）乔舒亚·贝</span><br> <span
											class="price_afterdiscount">￥9.50</span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="thumbnail">
									<a href="#"><img src="img/ebooks81.jpg" alt="夜脑" /></a>
									<div class="caption">
										<a href="#" class="text">夜脑</a><br> <span
											class="text-warning">理查德·怀斯曼</span><br> <span
											class="price_afterdiscount">￥11.99</span>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>

			</div>

			<!--电子书榜-->
			<div id="content-supply-right">
				<div id="content-supply-right-top">
					<span class="glyphicon glyphicon-certificate"></span> <a href="#">电子书榜</a>
				</div>
				<div class="list-group">
					<div class="list-group">
						<a href="#" class="list-group-item">1、杀死一只知更鸟</a> <a href="#"
							class="list-group-item">2、月亮与六便士</a> <a href="#"
							class="list-group-item">3、年轻人要熟知的2000个文化常识</a> <a href="#"
							class="list-group-item">4、财务自由之路</a> <a href="#"
							class="list-group-item">5、别输在不会表达上</a> <a href="#"
							class="list-group-item">6、博弈心理学</a> <a href="#"
							class="list-group-item">7、公主走进黑森林</a> <a href="#"
							class="list-group-item">8、全球通史</a> <a href="#"
							class="list-group-item">9、韭菜的自我修养</a> <a href="#"
							class="list-group-item">10、时间管理</a>
					</div>
				</div>
				<a href="#" style="text-align: right;">查看完整榜单>>></a>
			</div>
		</div>

		<!--热门作者分类-->
		<div id="content-author">
			<!--热门作者分类--头部-->
			<div id="content-author-left">
				<ul class="nav nav-tabs">
					<li class="active"><a href="#hotAuthor" data-toggle="tab">热门作者</a></li>
					<li><a href="#famousAuthor" data-toggle="tab">名人堂</a></li>
					<li><a href="#newAuthor" data-toggle="tab">新锐作家</a></li>
				</ul>
				<div class="tab-content">

					<!--作家分类--热门作者-->
					<div class="tab-pane active fade in" id="hotAuthor">
						<div class="media">
							<div class="media-left" id="content-media-left">
								<a href="#"><img src="img/艾伦·贝克尔.jpg" alt="艾伦·贝克尔"
									class="media-object"></a>
							</div>
							<div class="media-body">
								<p></p>
								<a href="#">艾伦·贝克尔</a>
								<p></p>
								<p>艾伦·贝克尔：绘本作家，凯迪克奖得主。曾参与制作《极地特快》等电影，其绘本代表作《不可思议的旅程》，构建了一个让想象力驰骋的魔法世界，一经出版便荣获凯迪克奖。新作《莎莎的石头》画面更加厚重沉稳、作者用更加史诗级别的视角将目光从想象国度转向现实世界的历史和地域，带来跨越时空和文化的迷人场景。一个女孩走到海边，捡起一块石头扔出去，又一段不可思议的旅程开始了……</p>
							</div>
							<button class="btn btn-info btn-md" value="相关作品"
								style="margin-top: 20px;">相关作品</button>
						</div>
						<div id="content-author-left-down">
							<div class="row">
								<div class="col-md-3">
									<div class="thumbnail">
										<a href="#"><img src="img/莎莎的石头.jpg" alt="莎莎的石头" /></a>
										<div class="caption">
											<a href="#" class="text">莎莎的石头</a><br> <span
												class="text-danger">评分:5.0</span><br> <span
												class="price_afterdiscount">￥49.80</span> <span
												class="price_beforediscount">￥49.80</span>
										</div>
									</div>
								</div>
								<div class="col-md-3">
									<div class="thumbnail">
										<a href="#"><img src="img/不可思议的旅程(全三部).jpg"
											alt="不可思议的旅程(全三部)" /></a>
										<div class="caption">
											<a href="#" class="text">不可思议的旅程三部</a><br> <span
												class="text-danger">评分:5.0</span><br> <span
												class="price_afterdiscount">￥117.60</span> <span
												class="price_beforediscount">￥118.80</span>
										</div>
									</div>
								</div>
								<div class="col-md-3">
									<div class="thumbnail">
										<a href="#"><img src="img/不可思议的旅程.jpg" alt="不可思议的旅程" /></a>
										<div class="caption">
											<a href="#" class="text">不可思议的旅程</a><br> <span
												class="text-danger">评分:5.0</span><br> <span
												class="price_afterdiscount">￥39.20</span> <span
												class="price_beforediscount">￥39.60</span>
										</div>
									</div>
								</div>
								<div class="col-md-3">
									<div class="thumbnail">
										<a href="#"><img src="img/不可思议的旅程：回归之夜.jpg"
											alt="不可思议的旅程：回归之夜" /></a>
										<div class="caption">
											<a href="#" class="text">不可思议的旅程四</a><br> <span
												class="text-danger">评分:5.0</span><br> <span
												class="price_afterdiscount">￥39.20</span> <span
												class="price_beforediscount">￥39.60</span>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<!--作家分类--名人堂-->
					<div class="tab-pane fade in" id="famousAuthor">
						<!--作家分类--名人堂--左边-->
						<div id="famousAuthor-left">
							<div id="famousAuthor-left-up">
								<p>
									<a href="#"><img src="img/冯唐.jpg" alt="冯唐" /></a>
								</p>
								<p>
									<a href="#">冯唐</a>
								</p>
							</div>
							<div id="famousAuthor-left-down">
								<span>冯唐，1971年生于北京，诗人、作家、古器物爱好者。1998年，获协和医科大学临床医学博士，2000年，获美国埃默里大学MBA学位，2000—2008年，麦肯锡公司全球董事合伙人，2009—2014年，华润医疗集团创始CEO，2015年始，从事医疗投资。</span>
							</div>
						</div>
						<!--作家分类--名人堂--右边-->
						<div id="famousAuthor-right-up">
							<div class="media">
								<div class="media-left">
									<a href="#"><img src="img/无所畏2.jpg" alt="无所畏2"
										class="media-object"></a>
								</div>
								<div class="media-body">
									<p>
										<a href="#">无所畏</a>
									</p>
									<span class="price_afterdiscount">￥34.40</span> <span
										class="price_beforediscount">￥49.80</span>
									<p></p>
									<p>冯唐全新作品，一部坦露自我的真诚之作。全书分为如何获得成功、爱情如何对抗时间、生活怎么过才算有意义、自我价值如何体现四个章节，并收录《如何避免成为一个油腻的中年猥琐男》《找个好看的扑倒》《爱情如何对抗时间》《我爸认识所有的鱼》等知名篇</p>
								</div>
							</div>
						</div>

						<div id="famousAuthor-right-down">
							<p>
								<span>该作者的其他作品:</span> <a href="#">在宇宙间不易被风吹散</a> <a href="#">不三</a>
								<a href="#">冯唐文集</a>
							</p>
							<p>
								<span>该作者推荐的图书:</span> <a href="#">人生因孤独而丰盛</a> <a href="#">四时之诗</a>
								<a href="#">于丹 重温最美古诗词</a>
							</p>
							<p>
								<span>喜欢该作者还喜欢:</span> <a href="#">镜湖</a> <a href="#">唐诗可以这样读</a>
								<a href="#">孤独是灵魂的必修课</a> <a href="#">那年 那信</a>
							</p>

						</div>
					</div>

					<!--作家分类--新锐作家-->
					<div class="tab-pane fade in" id="newAuthor">
						<!--作家分类--新锐作家--左边-->
						<div id="famousAuthor-left">
							<div id="famousAuthor-left-up">
								<p>
									<a href="#"><img src="img/钱儿妈.jpg" alt="钱儿妈" /></a>
								</p>
								<p>
									<a href="#">钱儿妈</a>
								</p>
							</div>
							<div id="famousAuthor-left-down">
								<span>本名白雁飞，读者们爱称她“白大人”，亲子微信大号“Michael钱儿频道”联合创始人。中国传媒大学语言学硕士，英文纪录片专业翻译，长期致力于儿童英文启蒙教育，讲解的英文教程“牛津阅读树”，深受父母和孩子们喜爱。</span>
							</div>
						</div>
						<!--作家分类--新锐作家--右边-->
						<div id="famousAuthor-right-up">
							<div class="media">
								<div class="media-left">
									<a href="#"><img src="img/给孩子立界限2.jpg" alt="给孩子立界限2.jpg"
										class="media-object"></a>
								</div>
								<div class="media-body">
									<p>
										<a href="#">给孩子立界限</a>
									</p>
									<span class="price_afterdiscount">￥31.50</span> <span
										class="price_beforediscount">￥52.00</span>
									<p></p>
									<p>年幼时，任何知识、技能的学习，都处在起步阶段，不经过努力进取，长大是不可能自然而然就好了的。本书记录的不仅仅是作者自己的育儿故事，也是“80后”“90后”父母所共同面临的育儿难题。书中围绕树立规矩、学习习惯、科目学习、素质提高、教育体制、艺术</p>
								</div>
							</div>
						</div>

						<div id="famousAuthor-right-down">
							<p>
								<span>该作者的其他作品:</span> <a href="#">让孩子像孩子那样长大（亲笔签名版）</a>
							</p>
							<p>
								<span>该作者推荐的图书:</span> <a href="#">养育女孩</a> <a href="#">养育男孩（典藏版）</a>
								<a href="#">通往幸福的教育</a> <a href="#">法国妈妈育儿经</a>
							</p>
							<p>
								<span>喜欢该作者还喜欢:</span> <a href="#">给孩子的未来脑计划</a> <a href="#">养育的选择</a>
								<a href="#">天才赢在注意力</a>
							</p>

						</div>
					</div>



				</div>
			</div>


			<!--热门作者分类--右边图片（4张）-->
			<div id="content-author-right">
				<div class="row">
					<div class="col-sm-12">
						<a href="#"><img src="img/n238130.jpg"
							style="margin-top: 6px;" alt="picture_ar1" /></a>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<a href="#"><img src="img/2401200312-1520848660.jpg"
							style="width: 240px;" alt="picture_ar2" /></a>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<a href="#"><img src="img/ycxb-0913-1536832980.jpg"
							alt="picture_ar3" /></a>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<a href="#"><img src="img/9ym2j6z240-120.jpg"
							alt="picture_ar4" /></a>
					</div>
				</div>
			</div>
		</div>


		<!--中间部分--下三连图片-->
		<div id="content-picture">
			<div class="row">
				<div class="col-md-4">
					<div class="thumbnail">
						<a href="#"><img src="img/9001320067409437_1_o.jpg"
							alt="picture4" /></a>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<a href="#"><img src="img/tszb-0913-1536832971.jpg"
							alt="pictur5" /></a>
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<a href="#"><img src="img/382-140-1537345544.jpg"
							alt="picture6" /></a>
					</div>
				</div>
			</div>
		</div>

		<!--中间部分--猜你喜欢-->
		<div id="content-loves">

			<!--中间部分--猜你喜欢--头部logo-->
			<div id="content-loves-top">
				<a href="#"><span class="glyphicon glyphicon-transfer"
					style="margin-right: 10px;"></span>换一批</a>
			</div>

			<!--中间部分--猜你喜欢--具体书籍-->
			<div id="content-loves-left">
				<div id="content-loves-left-down">
					<div class="row">
						<div class="col-md-3">
							<div class="thumbnail">
								<a href="#"><img src="img/不做小屁孩.jpg" alt="不做小屁孩" /></a>
								<div class="caption">
									<a href="#" class="text">不做小屁孩</a><br> <span
										class="price_afterdiscount">￥56.80</span>
								</div>
							</div>
						</div>
						<div class="col-md-3">
							<div class="thumbnail">
								<a href="#"><img src="img/莫可可看世界全8册.jpg" alt="莫可可看世界全8册" /></a>
								<div class="caption">
									<a href="#" class="text">莫可可看世界全8册</a><br> <span
										class="price_afterdiscount">￥133.80</span>
								</div>
							</div>
						</div>
						<div class="col-md-3">
							<div class="thumbnail">
								<a href="#"><img src="img/蒲公英·英语拼读王.jpg" alt="蒲公英·英语拼读王" /></a>
								<div class="caption">
									<a href="#" class="text">蒲公英·英语拼读王</a><br> <span
										class="price_afterdiscount">￥241.20</span>
								</div>
							</div>
						</div>
						<div class="col-md-3">
							<div class="thumbnail">
								<a href="#"><img src="img/从侠道到王道：刘邦传.jpg" alt="从侠道到王道：刘邦传" /></a>
								<div class="caption">
									<a href="#" class="text">从侠道到王道：刘邦传</a><br> <span
										class="price_afterdiscount">￥36.00</span>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-3">
							<div class="thumbnail">
								<a href="#"><img src="img/写给想哭的你.jpg" alt="写给想哭的你" /></a>
								<div class="caption">
									<a href="#" class="text">写给想哭的你</a><br> <span
										class="price_afterdiscount">￥31.90</span>
								</div>
							</div>
						</div>
						<div class="col-md-3">
							<div class="thumbnail">
								<a href="#"><img src="img/我的前半生：全本.jpg" alt="我的前半生：全本" /></a>
								<div class="caption">
									<a href="#" class="text">我的前半生：全本</a><br> <span
										class="price_afterdiscount">￥102.40</span>
								</div>
							</div>
						</div>
						<div class="col-md-3">
							<div class="thumbnail">
								<a href="#"><img src="img/你真的会跑步吗.jpg" alt="你真的会跑步吗" /></a>
								<div class="caption">
									<a href="#" class="text">你真的会跑步吗</a><br> <span
										class="price_afterdiscount">￥59.20</span>
								</div>
							</div>
						</div>
						<div class="col-md-3">
							<div class="thumbnail">
								<a href="#"><img src="img/品味公文.jpg" alt="品味公文" /></a>
								<div class="caption">
									<a href="#" class="text">品味公文</a><br> <span
										class="price_afterdiscount">￥66.20</span>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>


			<!--中间部分--猜你喜欢--右边--你可能喜欢的作者-->
			<div id="content-loves-right">
				<div id="content-loves-right-lovesAuthor">
					<span>你可能喜欢的作者:</span>
				</div>
				<div>
					<ul>
						<li><a href="#">龙应台</a></li>
						<li><a href="#">韩寒</a></li>
						<li><a href="#">张小娴</a></li>
						<li><a href="#">哥伦</a></li>
						<li><a href="#">德鲁克</a></li>
						<li><a href="#">赵伟</a></li>
						<li><a href="#">塞林格</a></li>
						<li><a href="#">圣埃克苏佩里</a></li>
						<li><a href="#">刘慈欣</a></li>
						<li><a href="#">路易斯·卡夫曼</a></li>
					</ul>
				</div>
			</div>
		</div>



		<!--中间部分--评论-->
		<div id="content-comments">

			<!--中间部分--评论--分类头部-->
			<div id="content-comments-left">
				<ul class="nav nav-tabs">
					<li class="active"><a href="#comments" data-toggle="tab">最多好评</a></li>
					<li><a href="#mostWatched" data-toggle="tab">最受关注</a></li>
					<li><a href="#popularCollection" data-toggle="tab">人气收藏</a></li>
				</ul>

				<!--中间部分--评论--具体部分-->
				<div class="tab-content">

					<!--评价--最多好评-->
					<div class="tab-pane active fade in" id="comments">
						<div class="media">
							<span class="content-comments-left-down-pic-pos">1.</span>
							<div class="media-left" id="content-media-left-comments">
								<a href="#"><img src="img/岛上书店.jpg" alt="岛上书店"
									class="media-object"></a>
							</div>
							<div class="media-body">
								<a href="#" style="font-size: 18px;">岛上书店（每个人的生命中，都有无比艰难的那一年，将人生变得美好而辽阔。）</a>
								<p></p>
								<p>
									当当价:<span style="color: red;">￥24.20</span> <span
										style="color: gray; text-decoration: line-through;">市场价:￥35.00</span>
									<span>电子书¥8.99</span>
								</p>
								<p>岛上书店是间维多利亚风格的小屋，门廊上挂着褪色的招牌，上面写着：没有谁是一座孤岛，每本书都是一个世界A．J．费克里，人近中年，在一座与世隔绝的小岛上，经营一家书店。命运从未眷顾过他，爱妻去世，书店危机，就连值钱的宝贝也遭窃。他的人生陷入僵局，他的内心沦为荒岛。就在此时，一个神秘的包袱出现在书店中，意外地拯救了陷于孤独绝境中的A．J．，成为了连接他和妻姐伊斯梅、警长兰比亚斯、出版社女业务员阿米莉娅之间的纽带，为他的生活带来了转机。小岛上的几个生命紧紧相依，走出了人生的困境，而所有对书和生活的热爱都周而复始，愈加汹涌。</p>
							</div>
						</div>
						<div id="content-comments-left-down">
							<div class="row">
								<div class="col-md-3">
									<span class="content-comments-left-down-pic-pos">2.</span>
									<div class="thumbnail">
										<a href="#"><img src="img/我家宝贝不偏食.jpg" alt="我家宝贝不偏食" /></a>
										<div class="caption">
											<a href="#" class="text">我家宝贝不偏食</a><br> <span
												class="text-danger">评分:4.8</span><br> <span
												class="price_afterdiscount">￥10.20</span> <span
												class="price_beforediscount">￥35.00</span>
											<p>电子书:暂无</p>
										</div>
									</div>
								</div>
								<div class="col-md-3">
									<span class="content-comments-left-down-pic-pos">3.</span>
									<div class="thumbnail">
										<a href="#"><img src="img/怀孕40周看这本就够.jpg" alt="怀孕40周看这本就够" /></a>
										<div class="caption">
											<a href="#" class="text">怀孕40周看这本就够</a><br> <span
												class="text-danger">评分:4.7</span><br> <span
												class="price_afterdiscount">￥36.60</span> <span
												class="price_beforediscount">￥48.00</span>
											<p>电子书¥1.49</p>
										</div>
									</div>
								</div>
								<div class="col-md-3">
									<span class="content-comments-left-down-pic-pos">4.</span>
									<div class="thumbnail">
										<a href="#"><img src="img/如何让你爱的人爱上.jpg" alt="如何让你爱的人爱上" /></a>
										<div class="caption">
											<a href="#" class="text">如何让你爱的人爱上</a><br> <span
												class="text-danger">评分:4.7</span><br> <span
												class="price_afterdiscount">￥31.90</span> <span
												class="price_beforediscount">￥38.50</span>
											<p>电子书¥6.99</p>
										</div>
									</div>
								</div>
								<div class="col-md-3">
									<span class="content-comments-left-down-pic-pos">5.</span>
									<div class="thumbnail">
										<a href="#"><img src="img/男人来自火星，女人.jpg" alt="男人来自火星，女人" /></a>
										<div class="caption">
											<a href="#" class="text">男人来自火星，女人</a><br> <span
												class="text-danger">评分:4.5</span><br> <span
												class="price_afterdiscount">￥22.60</span> <span
												class="price_beforediscount">￥32.80</span>
											<p>电子书¥8.99</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<!--评价--最受关注-->
					<div class="tab-pane fade in" id="mostWatched">
						<div class="media">
							<span class="content-comments-left-down-pic-pos">1.</span>
							<div class="media-left" id="content-media-left-comments">
								<a href="#"><img src="img/mostWatched1.jpg"
									alt="杀死一只知更鸟（纪念版，此版售罄不再加印）" class="media-object"></a>
							</div>
							<div class="media-body">
								<a href="#" style="font-size: 18px;">杀死一只知更鸟（纪念版，此版售罄不再加印）</a>
								<p></p>
								<p>
									当当价:<span style="color: red;">¥22.30</span> <span
										style="color: gray; text-decoration: line-through;">市场价:￥32.00</span>
								</p>
								<p>《杀死一只知更鸟》二十世纪三十年代，大萧条时期美国南部的一个小镇，三个孩子平静的生活被两桩冤案彻底打破。传闻与事实，坚强与软弱，正义与邪恶，忠诚与背叛，他们在痛苦与矛盾中艰难地拨开生活的重重迷雾，见证了人性的污秽与光辉，理解了真相的残忍与无奈，也感受了人间的温暖与真情。</p>
							</div>
						</div>
						<div id="content-comments-left-down">
							<div class="row">
								<div class="col-md-3">
									<span class="content-comments-left-down-pic-pos">2.</span>
									<div class="thumbnail">
										<a href="#"><img src="img/mostWatched2.jpg" alt="睡前胎教故事" /></a>
										<div class="caption">
											<a href="#" class="text">睡前胎教故事</a><br> <span
												class="text-danger">评分:4.8</span><br> <span
												class="price_afterdiscount">￥26.00</span> <span
												class="price_beforediscount">￥35.00</span>
											<p>电子书:￥6.00</p>
										</div>
									</div>
								</div>
								<div class="col-md-3">
									<span class="content-comments-left-down-pic-pos">3.</span>
									<div class="thumbnail">
										<a href="#"><img src="img/mostWatched3.jpg" alt="学而思思维训练" /></a>
										<div class="caption">
											<a href="#" class="text">学而思思维训练</a><br> <span
												class="text-danger">评分:4.7</span><br> <span
												class="price_afterdiscount">￥15.80</span> <span
												class="price_beforediscount">￥19.80</span>
											<p>电子书¥1.49</p>
										</div>
									</div>
								</div>
								<div class="col-md-3">
									<span class="content-comments-left-down-pic-pos">4.</span>
									<div class="thumbnail">
										<a href="#"><img src="img/mostWatched4.jpg" alt="山水柏舟一席茶" /></a>
										<div class="caption">
											<a href="#" class="text">山水柏舟一席茶</a><br> <span
												class="text-danger">评分:4.7</span><br> <span
												class="price_afterdiscount">￥29.50</span> <span
												class="price_beforediscount">￥50.00</span>
											<p>电子书¥8.99</p>
										</div>
									</div>
								</div>
								<div class="col-md-3">
									<span class="content-comments-left-down-pic-pos">5.</span>
									<div class="thumbnail">
										<a href="#"><img src="img/mostWatched5.jpg"
											alt="男人来自火星，女人" /></a>
										<div class="caption">
											<a href="#" class="text">此刻花开</a><br> <span
												class="text-danger">评分:4.6</span><br> <span
												class="price_afterdiscount">￥50.40</span> <span
												class="price_beforediscount">68.00</span>
											<p>电子书¥19.99</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<!--评价--人气收藏-->
					<div class="tab-pane fade in" id="popularCollection">
						<div class="media">
							<span class="content-comments-left-down-pic-pos">1.</span>
							<div class="media-left" id="content-media-left-comments">
								<a href="#"><img src="img/popularCollection1.jpg"
									alt="哈佛凌晨四点半" class="media-object"></a>
							</div>
							<div class="media-body">
								<a href="#" style="font-size: 18px;">哈佛凌晨四点半·升级版：哈佛大学教给青少年的成功秘诀</a>
								<p></p>
								<p>
									当当价:<span style="color: red;">￥14.00</span> <span
										style="color: gray; text-decoration: line-through;">市场价:￥28.00</span>
									<span>电子书¥1.99</span>
								</p>
								<p>《哈佛凌晨四点半》（升级版）是在畅销书《哈佛凌晨四点半》的基础上对内容板块进行了优化，旨在将哈佛的精神和气质通过更为精炼的语言，更为精彩的故事得以体现。
									《哈佛凌晨四点半》（升级版）除了保留原书中在理想、习惯、性格、情商等方面的内容板块外，又增加了时间管理和自律管理新内容和知识点，能更加激发青少年学生奋发向上，点燃学习热情，引导他们更加努力、更加自觉地学习知识，成为社会的有用之材。</p>
							</div>
						</div>
						<div id="content-comments-left-down">
							<div class="row">
								<div class="col-md-3">
									<span class="content-comments-left-down-pic-pos">2.</span>
									<div class="thumbnail">
										<a href="#"><img src="img/popularCollection2.jpg"
											alt="答案之书" /></a>
										<div class="caption">
											<a href="#" class="text">答案之书</a><br> <span
												class="text-danger">评分:4.8</span><br> <span
												class="price_afterdiscount">￥28.20</span> <span
												class="price_beforediscount">￥38.00</span>
											<p>电子书:暂无</p>
										</div>
									</div>
								</div>
								<div class="col-md-3">
									<span class="content-comments-left-down-pic-pos">3.</span>
									<div class="thumbnail">
										<a href="#"><img src="img/popularCollection3.jpg"
											alt="Hello!烤箱" /></a>
										<div class="caption">
											<a href="#" class="text">Hello!烤箱</a><br> <span
												class="text-danger">评分:4.8</span><br> <span
												class="price_afterdiscount">￥29.50</span> <span
												class="price_beforediscount">￥39.80</span>
											<p>电子书¥11.94</p>
										</div>
									</div>
								</div>
								<div class="col-md-3">
									<span class="content-comments-left-down-pic-pos">4.</span>
									<div class="thumbnail">
										<a href="#"><img src="img/popularCollection4.jpg" alt="格局" /></a>
										<div class="caption">
											<a href="#" class="text">格局</a><br> <span
												class="text-danger">评分:4.8</span><br> <span
												class="price_afterdiscount">￥18.00</span> <span
												class="price_beforediscount">￥36.00</span>
											<p>电子书¥3.99</p>
										</div>
									</div>
								</div>
								<div class="col-md-3">
									<span class="content-comments-left-down-pic-pos">5.</span>
									<div class="thumbnail">
										<a href="#"><img src="img/popularCollection5.jpg"
											alt="男人来自火星，女人" /></a>
										<div class="caption">
											<a href="#" class="text">鬼吹灯全集</a><br> <span
												class="text-danger">评分:4.7</span><br> <span
												class="price_afterdiscount">￥118.70</span> <span
												class="price_beforediscount">￥248.40</span>
											<p>电子书¥39.99</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>


				</div>



			</div>

			<!--评论--喜欢的作者-->
			<div id="content-comments-right">
				<div id="content-comments-right-top">
					<p>当当读书社区</p>
					<p class="glyphicon glyphicon-book" style="padding-top: -20px;"></p>
				</div>
				<div id="content-comments-right-down">
					<h3 class="text-success" style="font-size: 15px;">山月不知心里事</h3>
					<a href="#" style="font-weight: bold;">女人，要做自己的靠山。除了自己，依靠谁，都有风险。</a>
					<p>
						<a href="#"><img src="img/山月不知心里事.jpg" alt="山月不知心里事" /></a>
					</p>
					<a href="#">本书为长篇纪实小说，以在大别山里长大的米燕的生活经历为基础，写了一群山里女孩的命运。每一个人，都是一个故事；每一个故事，都是一本书。米燕就是一个普通的不能再普通的人，她的故事，或许有你我的影子。</a>
					<p></p>
					<p>
						<a href="#"><button class="btn btn-danger" value="电子书"
								style="width: 100px;">电子书</button></a> <a href="#"><button
								class="btn btn-success" value="客户端"
								style="margin-left: 30px; width: 100px;">客户端</button></a>
					</p>
				</div>
			</div>
		</div>

		<!--中间部分--尾品汇--纯图片-->
		<div id="content-weipinhui">
			<ul>
				<li><a href="#"><img src="img/10(2).JPG" alt="10(2)"
						style="height: 178px;" /></a></li>
				<li><a href="#"><img src="img/2.jpg" alt="2" /></a></li>
				<li><a href="#"><img src="img/3.jpg" alt="3" /></a></li>
				<li><a href="#"><img src="img/4.jpg" alt="4" /></a></li>
				<li><a href="#"><img src="img/5.jpg" alt="5" /></a></li>
				<li><a href="#"><img src="img/6.jpg" alt="6" /></a></li>
			</ul>
			<ul>
				<li><a href="#"><img src="img/7.jpg" alt="7" /></a></li>
				<li><a href="#"><img src="img/8.jpg" alt="8" /></a></li>
				<li><a href="#"><img src="img/9.jpg" alt="9" /></a></li>
				<li><a href="#"><img src="img/10.jpg" alt="10" /></a></li>
				<li><a href="#"><img src="img/11.jpg" alt="11" /></a></li>
				<li><a href="#"><img src="img/12.jpg" alt="12" /></a></li>
			</ul>
			<ul>
				<li><a href="#"><img src="img/13.jpg" alt="13" /></a></li>
				<li><a href="#"><img src="img/14.jpg" alt="14"
						class="changePic" /></a></li>
				<li><a href="#"><img src="img/15.jpg" alt="15"
						class="changePic" /></a></li>
				<li><a href="#"><img src="img/16.jpg" alt="16"
						class="changePic" /></a></li>
				<li><a href="#"><img src="img/17.jpg" alt="17"
						class="changePic" /></a></li>
				<li><a href="#"><img src="img/18.jpg" alt="18"
						class="changePic" /></a></li>
			</ul>
		</div>


		<!--中间部分--品牌店铺-->
		<div id="content-brand">
			<div id="content-brand-top">
				<p>品牌店铺</p>
			</div>
			<div id="content-brand-down">
				<div class="content-brand-down-div">
					<p>
						<a href="#">凤凰含章官方旗舰店</a>
					</p>
					<p>
						<a href="#">白马时光</a>
					</p>
					<p>
						<a href="#"><img src="img/新经典文化.jpg" alt="新经典文化"></a>
					</p>
				</div>
				<div class="content-brand-down-div">
					<div class="content-brand-down-div">
						<p>
							<a href="#">耕林童书馆</a>
						</p>
						<p>
							<a href="#">爱心树童书</a>
						</p>
						<p>
							<a href="#"><img src="img/凤凰联动.jpg" alt="凤凰联动"></a>
						</p>
					</div>
				</div>
				<div class="content-brand-down-div">
					<div class="content-brand-down-div">
						<p>
							<a href="#">新蕾出版社</a>
						</p>
						<p>
							<a href="#">蒲公英童书馆</a>
						</p>
						<p>
							<a href="#"><img src="img/读客图书.jpg" alt="读客图书"></a>
						</p>
					</div>
				</div>
				<div class="content-brand-down-div">
					<div class="content-brand-down-div">
						<p>
							<a href="#">双螺旋童书馆</a>
						</p>
						<p>
							<a href="#">歪歪兔童书馆</a>
						</p>
						<p>
							<a href="#"><img src="img/海豚传媒.jpg" alt="海豚传媒"></a>
						</p>
					</div>
				</div>
				<div class="content-brand-down-div">
					<div class="content-brand-down-div">
						<p>
							<a href="#">皮皮鲁总动员</a>
						</p>
						<p>
							<a href="#">乐乐趣童书馆</a>
						</p>
						<p>
							<a href="#"><img src="img/步印童书馆.jpg" alt="步印童书馆"></a>
						</p>
					</div>
				</div>
			</div>
		</div>

		<!--中间部分--下长图片-->
		<div id="content-foot-picture">
			<a href="#"><img src="img/小兔汤姆.jpg" alt="小兔汤姆"></a>
		</div>
	</div>

	<!--尾部-->
	<div id="foot">

		<!--尾部--配送流程图-->
		<div id="foot-send" class="container-fluid">
			<a href="#"><img src="img/foot-send.jpg" alt="foot-send" /></a>
		</div>

		<!--尾部--帮助明细与其他-->
		<div id="foot-ways" class="container">
			<table class="table">
				<thead>
					<th>购物指南</th>
					<th>支付方式</th>
					<th>订单服务</th>
					<th>配送方式</th>
					<th>退换货</th>
					<th>商家服务</th>
				</thead>
				<tbody>
					<tr>
						<td><a href="#">购物流程</a></td>
						<td><a href="#">货到付款</a></td>
						<td><a href="#">配送服务查询</a></td>
						<td><a href="#">当日递</a></td>
						<td><a href="#">退换货服务查询</a></td>
						<td><a href="#">商家中心</a></td>
					</tr>
					<tr>
						<td><a href="#">发票制度</a></td>
						<td><a href="#">网上支付</a></td>
						<td><a href="#">订单状态说明</a></td>
						<td><a href="#">次日达</a></td>
						<td><a href="#">自助申请退换货</a></td>
						<td><a href="#">运营服务</a></td>
					</tr>
					<tr>
						<td><a href="#">账户管理</a></td>
						<td><a href="#">礼品卡支付</a></td>
						<td><a href="#">自助取消订单</a></td>
						<td><a href="#">订单自提</a></td>
						<td><a href="#">退换货进度查询</a></td>
						<td><a href="#">加入尾品汇</a></td>
					</tr>
					<tr>
						<td><a href="#">会员优惠</a></td>
						<td><a href="#">银行转帐</a></td>
						<td><a href="#">自助修改订单</a></td>
						<td><a href="#">验货与签收</a></td>
						<td><a href="#">退款方式和时间</a></td>
						<td><a href="#"></a></td>
					</tr>
				</tbody>
			</table>
		</div>


		<!--尾部--更多明细-->
		<div id="foot-foot" class="container-fluid">

			<!--尾部--other-->
			<div id="foot-foot-top">
				<ul>
					<li><a href="#">公司简介</a></li>
					<li>|</li>
					<li><a href="#">诚聘英才</a></li>
					<li>|</li>
					<li><a href="#">网站联盟</a></li>
					<li>|</li>
					<li><a href="#">当当招商</a></li>
					<li>|</li>
					<li><a href="#">机构销售</a></li>
					<li>|</li>
					<li><a href="#">手机当当</a></li>
					<li>|</li>
					<li><a href="#">官方Blog</a></li>
					<li>|</li>
					<li><a href="#">热词搜索</a></li>
				</ul>
			</div>

			<!--尾部--地址及编码-->
			<div id="foot-foot-down">
				<span>Copyright (C) 当当网 2004-2017, All Rights Reserved</span> <a
					href="#"><img src="img/validate.gif" alt="validate"></a> <a
					href="#">京ICP证041189号</a> <span>出版物经营许可证 新出发京批字第直0673号</span>
			</div>
		</div>
	</div>


</body>
<script src="js/jquery-3.3.1.js"></script>
<script src="js/bootstrap.js"></script>
</html>