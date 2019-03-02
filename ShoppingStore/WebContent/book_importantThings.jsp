<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<%@page import="java.util.*" session="true" isELIgnored="false"
	buffer="8kb" autoFlush="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>那些重要的事</title>
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/book_importantThings.css" />
</head>

<body>
	<div class="container">

		<!--书信息-头部-->
		<div id="book-head">
			<a href="MyHome.jsp"><img src="img/DangDanglogoNEW-1531446546.png"
				alt="当当logo"></a>
		</div>

		<!--书信息-内容-->

		<!--书信息-内容--上半部分-->
		<div id="book-content-top">
			<div class="media">
				<div class="media-left">
					<a href="#"><img src="img/25233424-1_l_3.jpg" alt="那些重要的事"
						class="media-object" style="width: 200px;"></a>
				</div>
				<div class="media-body">
					<h1>DK幼儿百科全书——那些重要的事</h1>
					<span class="introduce">英国DK专为学龄前儿童设计的百科全书，那些孩子们应该知道的重要的事，都在这里！英国《少年杂志》设计奖ZUI佳童书类银奖！扫描封底二维码，免费音频同步听，解决科普难讲的大难题！</span><br>
					<p></p>
					<p>
						作者:<a href="">英国DK公司</a>
					</p>
					<p>
						出版社:<a href="">中国大百科全书出版社</a>
					</p>
					<p>出版时间:2017年07月</p>
					<p>
						原版书名:<a href="">My Encyclopedia of Very Important Things</a>
					</p>
					<p>
						<span class="price_afterdiscount">￥41.80</span> <span
							class="price_beforediscount">￥58.00</span>
					</p>
					<p></p>
					<form method="get" action="book1.do">
					<input type="submit" name="join" value="加入购物车"/>
					</form>
				</div>
			</div>
		</div>
		<!--书信息-内容--下半部分-->
		<div id="book-content-down">
			<!--书信息--明细-->
			<div id="classification">
				<ul class="nav nav-tabs">
					<li class="active"><a href="#details" data-toggle="tab">商品详情</a></li>
					<li><a href="#comments" data-toggle="tab">商品评论</a></li>
					<li><a href="#questionAnswer" data-toggle="tab">商品问答</a></li>
				</ul>
				<div class="tab-content">

					<!--书信息--明细--商品详情-->
					<div class="tab-pane active fade in" id="details">
						<div>
							<p>开 本：16开</p>
							<p>纸 张：铜版纸</p>
							<p>包 装：精装</p>
							<p>是否套装：否</p>
							<p>国际标准书号ISBN：9787520201056</p>
						</div>
						<div class="features container-fluid">
							<span class="fontStyle">产品特色</span>
						</div>
						<div class="imgstyle">
							<img src="img/那些重要的事_详情1.jpg" alt="那些重要的事_详情1">
						</div>
						<div class="features container-fluid">
							<span class="fontStyle">编辑推荐</span>
						</div>
						<div>
							<p>★ 英国DK出版社与中国大百科全书出版社联合策划，专为中国儿童设计的的幼儿入门科普书；</p>
							<p>★ 英国DK出版社第YI本从幼儿视角出发的百科全书；</p>
							<p>★ 根据幼儿特殊的认知需求，结合英国DK特有的讲述方式；</p>
							<p>★ DK首次采用手绘插图 实拍照片的图片处理方式；语言风格轻松愉快，自然流露，赋予了知识更多的文学性</p>
						</div>
						<div class="features container-fluid">
							<span class="fontStyle">内容简介</span>
						</div>
						<div>
							<p>《DK幼儿百科全书——那些重要的事》是中国大百科全书出版社与英国DK公司共同策划的选题，是一本针对3-6岁学龄前儿童的综合百科。书的内容围绕儿童身边重要的事物叙述，一共分为六个章节，分别是：有关地球的重要知识，有关地理的重要知识，有关动物的重要知识，有关人类的重要知识，与我相关的重要知识，其他的重要知识。这本书的编辑思路旨在使孩子认识世界，了解身边事物的来龙去脉，培养健康的生活和学习习惯。</p>
						</div>
						<div class="features container-fluid">
							<span class="fontStyle">作者简介</span>
						</div>
						<div>
							<p>英国DK公司建立于1974年。他们的愿景就是创作既有视觉冲击力又包含信息丰富的图书，使读者能够理解每一个主题。DK图书被认为是从出生到年老不断学习的生活指南。</p>
						</div>
						<div class="features container-fluid">
							<span class="fontStyle">目 录</span>
						</div>
						<div>
							<p>有关我们地球的重要知识(以下罗列部分)</p>
							<p>10 我们在太空中的位置</p>
							<p>12 我们的地球</p>
							<p>14 太空在哪儿？</p>
							<p>16 夜幕下的天空</p>
							<p>18 海底世界</p>
							<p>20 山脉</p>
							<p>22 激烈的火山爆发</p>
							<p>24 地震</p>
							<p>26 干旱的沙漠</p>
							<p>28 雨林</p>
							<p>30 神奇的水资源</p>
						</div>
						<div class="features container-fluid">
							<span class="fontStyle">书摘插画</span>
						</div>
						<div class="imgstyle">
							<img src="img/那些重要的事_详情2.jpg" alt="书摘插画" />
						</div>
						<div class="price">
							<p>
								<span class="pricetitle">价格说明</span>
							</p>
							<p></p>
							<p>
								<span class="priceWord">当当价：</span>为商品的销售价，具体的成交价可能因会员使用优惠券、积分等发生变化，最终以订单结算页价格为准。
							</p>
							<p>
								<span class="priceWord">划线价：</span>划线价格可能是图书封底定价、商品吊牌价、品牌专柜价或由品牌供应商提供的正品零售价（如厂商指导价、建议零售价等）或该商品曾经展示过的销售价等，由于地区、时间的差异化和市场行情波动，商品吊牌价、品牌专柜价等可能会与您购物时展示的不一致，该价格仅供您参考。
							</p>
							<p>
								<span class="priceWord">折扣：</span>折扣指在划线价（图书定价、商品吊牌价、品牌专柜价、厂商指导价等）某一价格基础上计算出的优惠比例或优惠金额。如有疑问，您可在购买前联系客服咨询。
							</p>
							<p>
								<span class="priceWord">异常问题：</span>如您发现活动商品销售价或促销信息有异常，请立即联系我们补正，以便您能顺利购物。
							</p>
						</div>
					</div>

					<!--书信息--明细--商品评论-->
					<div class="tab-pane fade in" id="comments">
						<div class="container-fluid" id="comments-head">
							<p>商品评论</p>
						</div>
					</div>

					<!--书信息--明细--商品问答-->
					<div class="tab-pane fade in" id="questionAnswer">
						<div class="container-fluid" id="questionAnswer-head">
							<p>商品问答</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="js/jquery-3.3.1.js"></script>
	<script src="js/bootstrap.js"></script>

</body>

</html>