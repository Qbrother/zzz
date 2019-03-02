$(function() {
		var totalPrice = 0;
		//初始化
		function init() {
			$("input:checkbox").each(
					function(index, item) {
						let res = $(this).parent().nextAll(".tdn").children(
								".num").val()
								* $(this).parent().nextAll(".tdp").children(
										".price").html()
						$(this).parent().nextAll(".tdt").children(".total")
								.html(res)
						calc()
					})
		}
		init() 
		//加
		 $(".add").click(
				function() {
					let num = $(this).next().val()
					num++
					$(this).next().val(num)
					let res = $(this).next().val()
							* $(this).parent().prev().children(".price").html()
					$(this).parent().next().children(".total").html(res)
					calc()
				})

		//减
		$(".sub").click(
				function() {
					let num = $(this).prev().val()
					if (num == 0) {
						return;
					}
					num--
					$(this).prev().val(num)
					let res = $(this).prev().val()
							* $(this).parent().prev().children(".price").html()
					$(this).parent().next().children(".total").html(res)
					calc()
				}) 
		//复选框变化时计算价格
		$("input:checkbox").change(function() {
			calc()
		})

		//复选框
		function calc() {
			totalPrice = 0
			$("input[name='loves']:checked").each(
					function(index, item) {
						totalPrice += +$(this).parent().nextAll(".tdt")
								.children(".total").html()
					})
			$("#totalPrice").html(totalPrice)
		}
		/*  var book=""; */
		//删除当前选项
		$(".btn").click(function() {
			$(this).parent().parent().remove();
			/* book=$(this).parent().parent().prev().prev().prev().prev().prev().children().html();
			alert(book)
			$(this).nextAll(".book").val(book); */
		})
		
		var bookNames="";
		var counts="";
		var dangPrices="";
		var prices="";
		var allPrice= 0;
		//记录选购商品并传到Servlet中
		$(".buy").click(function(){
			$("input[name='loves']:checked").each(function(index,item){
				let bookName=$(this).parent().next().next().children().html();
				let dangPrice=$(this).parent().nextAll(".tdp").children(".price").html()
				let count=$(this).parent().nextAll(".tdn").children(".num").val();
				let price=$(this).parent().nextAll(".tdt").children().html();
				bookNames+=bookName+",";
				dangPrices+=dangPrice+",";
				counts+=count+",";
				prices+=price+",";
				allPrice +=+price; 
			})
			$(".bookName").val(bookNames)
			$(".dangPrice").val(dangPrices)
			$(".count").val(counts)
			$(".price").val(prices)
			$(".allPrice").val(allPrice)
		})
		
	})