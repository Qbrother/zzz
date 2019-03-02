package view;

import java.util.List;

import entity.Movie;
import entity.MovieCinema;
import entity.MovieComments;
import entity.MovieHall;
import entity.MovieTime;
import entity.OrderManage;

/**
 *	后台
 */
public class ManageView {
	
	public static int cinema_Id;
	public static int hall_Id;
	
	
	
	public static void background() {
		System.out.println("***************首页***************");
		System.out.println("1.电影管理");
		System.out.println("2.影院管理");
		System.out.println("3.影厅管理");
		System.out.println("4.场次管理");
		System.out.println("5.订单管理【影票】");// vip【选做】
		System.out.println("6.影评管理");
		System.out.println("0.退出");

		switch (UserView.getNumber()) {
		case 1:
			movieManage();
			break;
		case 2:
			cinemaManage();
			break;
		case 3:
			hallManage();
			break;
		case 4:
			sessionManage();
			break;
		case 5:
			orderManage();
			break;
		case 6:
			commentsManage();
			break;
		case 0:
			exit();
			break;
		default:
			System.out.println("格式错误，请重新输入！");
			break;
		}
	}

	// 1.电影管理
	public static void movieManage() {
		System.out.println("*************电影管理*************");
		System.out.println("电影列表:");
		List<Movie> mlist = UserView.movie.getMovieInformation();
		for (Movie m : mlist) {
			System.out.println(m.getMovieId() + "、" + m.getMovieName() + "(" + m.getType() + ")");
		}
		
		System.out.println();
		System.out.println("1.添加电影");
		System.out.println("0.返回");
		
		switch(UserView.getNumber()) {
			case 1:
				addMovie();
				break;
			case 0:
				background();
				break;
			default:
				System.out.println("你的输入有误，请重新输入！");
				movieManage();
				break;
		}
	}
	
	//添加电影
	public static void addMovie() {
		System.out.println("*************添加电影*************");
		System.out.println("电影名:");
		String movieName=UserView.getString();
		System.out.println("演员:");
		String actor=UserView.getString();
		System.out.println("时长:");
		String timeLength=UserView.getString();
		System.out.println("类型:");
		String type=UserView.getString();
		System.out.println("上映时间:");
		String releaseTime=UserView.getString();
		System.out.println("简介:");
		String introduction=UserView.getString();
		
		System.out.println();
		UserView.movie.insert(new Movie(movieName,actor,timeLength,type,releaseTime,introduction));
		System.out.println("电影添加成功！");
		movieManage();
	}

	
	
	// 2.影院管理
	public static void cinemaManage() {
		System.out.println("*************影院管理*************");
		System.out.println("影院列表:");
		List<MovieCinema> cinemaList = UserView.moviecinema.getCinema();
		for (MovieCinema cml : cinemaList) {
			System.out.println(cml.toString());
		}
		
		System.out.println();
		System.out.println("1.添加影院");
		System.out.println("0.返回");
		
		switch(UserView.getNumber()) {
			case 1:
				addCinema();
				break;
			case 0:
				background();
				break;
			default:
				System.out.println("你的输入有误，请重新输入！");
				cinemaManage();
				break;
		}
		
	}
	
	//添加影院
	public static void addCinema() {
		System.out.println("*************添加影院*************");
		System.out.println("影院名:");
		String cinemaName=UserView.getString();
		System.out.println("所属地区:");
		String cinemaRegion=UserView.getString();
		System.out.println("详细地址:");
		String cinemaAdress=UserView.getString();
		
		System.out.println();
		UserView.moviecinema.insertCinema(new MovieCinema(cinemaName,cinemaAdress,cinemaRegion));
		System.out.println("影院添加成功！");
		cinemaManage();
	}

	// 3.影厅管理
	public static void hallManage() {
		System.out.println("*************影厅管理*************");
		
		System.out.println("================================");
		System.out.println("已有的影院:");
		List<MovieCinema> cinemaList = UserView.moviecinema.getCinema();
		for (MovieCinema cml : cinemaList) {
			System.out.println(cml.movieList());
		}
		System.out.println();
		System.out.println("0.返回");
		System.out.println("================================");
		System.out.println("请输入要添加影厅的影院Id:");
		cinema_Id=UserView.getNumber();
		
		if(cinema_Id==0) {
			background();
		}else if(cinema_Id>=1&&cinema_Id<=cinemaList.size()) {
			addMovieHall();
		}else {
			System.out.println("你的输入有误，请重新输入！");
			hallManage();
		}
		
	}
	
	//添加影厅
	public static void addMovieHall() {
		System.out.println("*************添加影厅*************");
		System.out.println("================================");
		System.out.println("已有的影厅:");
		List<MovieHall> mhList = UserView.moviehall.getMovieHall(cinema_Id);
		for (MovieHall mh : mhList) {
			System.out.println(mh.toString());
		}
		System.out.println();
		System.out.println("0.返回");
		System.out.println("================================");
		System.out.println("请输入要添加的影厅Id:");
		int hallId=UserView.getNumber();
		
		if(hallId==0) {
			hallManage();
		}else if(hallId>=1&&hallId<=mhList.size()) {
			System.out.println("你输入的影厅已存在！");
			addMovieHall();
		}else {
			System.out.println("请输入影厅名:");
			String hallName=UserView.getString();
			System.out.println("影厅添加成功！");
			UserView.moviehall.insertMovieHall(new MovieHall(hallId,hallName,cinema_Id));
			addMovieHall();
		}
	}

	// 4.场次管理
	public static void sessionManage() {
		System.out.println("*************场次管理*************");
		System.out.println("================================");
		System.out.println("已有的影院:");
		List<MovieCinema> cinemaList = UserView.moviecinema.getCinema();
		for (MovieCinema cml : cinemaList) {
			System.out.println(cml.movieList());
		}
		System.out.println();
		System.out.println("0.返回");
		System.out.println("================================");
		System.out.println("请输入要添加场次的影院Id:");
		cinema_Id=UserView.getNumber();
		
		if(cinema_Id==0) {
			background();
		}else if(cinema_Id>=1&&cinema_Id<=cinemaList.size()) {
			hallNumber();
		}else {
			System.out.println("你的输入有误，请重新输入！");
			sessionManage();
		}
	}
	
	//已有影厅的选择
	public static void hallNumber() {
		System.out.println("================================");
		System.out.println("已有的影厅:");
		List<MovieHall> mhList = UserView.moviehall.getMovieHall(cinema_Id);
		for (MovieHall mh : mhList) {
			System.out.println(mh.toString());
		}
		System.out.println();
		System.out.println("0.返回");
		System.out.println("================================");
		System.out.println("请输入要添加场次的影厅Id:");
		hall_Id=UserView.getNumber();
		
		if(hall_Id==0) {
			sessionManage();
		}else if(hall_Id>=1&&hall_Id<=mhList.size()) {
			addSession();
		}else {
			System.out.println("你的输入有误，请重新输入！");
			hallNumber();
		}
	}
	
	//场次添加
	public static void addSession() {
		System.out.println("*************添加场次*************");
		System.out.println("================================");
		System.out.println("场次时间表:");
		
		int count=1;
		System.out.println("\t"+"影厅Id"+"\t"+"场次");
		List<MovieTime> mtList = UserView.movietime.getSingleAll(cinema_Id, hall_Id);
		for (MovieTime mt : mtList) {
			System.out.println((count++)+"."+mt.toString());
		}
		System.out.println();
		System.out.println("0.返回");
		System.out.println("================================");
		System.out.println("请输入要添加场次的电影Id:");
		
		int movieId=UserView.getNumber();
		if(movieId==0) {
			hallNumber();
		}else {
			System.out.println("请输入要添加场次的时间段:");
			String sessionTime=UserView.getString();
			System.out.println("请输入金额:");
			int price=UserView.getNumber();
			System.out.println("场次添加成功！");
			UserView.movietime.insertMovieTime(new MovieTime(movieId,sessionTime,price,cinema_Id,hall_Id));
			background();
		}

	}

	// 5.订单管理【影票】
	public static void orderManage() {
		System.out.println("*************订单管理*************");
		
		System.out.println("订单序号"+"\t"+"用户名"+"\t"+"电影ID"+"\t"+"影院ID"+"\t"+"影厅ID"+"\t"
		+"价格"+"\t"+"支付状态[1:支付，0:未支付]");
		
		List<OrderManage> orderManageList=UserView.orderManage.getOrder();
		for(OrderManage oml:orderManageList) {
			System.out.println(oml);
		}
		System.out.println();
		System.out.println("0.返回");
		switch(UserView.getNumber()) {
		case 0:
			background();
			break;
		default:
			System.out.println("你的输入有误，请重新输入！");
			orderManage();
			break;
		}
	}
	
	//6.获得所有影评
	public static void commentsManage() {
		System.out.println("*************影评管理*************");
		System.out.println("============================================================================");
		System.out.println("\t"+"评论内容"+"\t"+"电影Id"+"\t"+"时间"+"\t"+"用户名");
		System.out.println("============================================================================");
		List<MovieComments> sgucList = UserView.moviecomment.getALLComments();
		for (MovieComments m : sgucList) {
			System.out.println(m.allComments());
		}
	
		System.out.println();
		System.out.println("0.返回");
		System.out.println("============================================================================");
		
		switch(UserView.getNumber()) {
		case 0:
			background();
			break;
		default:
			System.out.println("操作有误！请重新输入！");
			commentsManage();
		}
	}

	// 0.退出
	public static void exit() {
		UserView.welcome();
	}
}
