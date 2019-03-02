package view;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import dao.impl.MovieCinemaDaoImpl;
import dao.impl.MovieCommentsDaoImpl;
import dao.impl.MovieDaoImpl;
import dao.impl.MovieHallDaoImpl;
import dao.impl.MovieTicketDaoImpl;
import dao.impl.MovieTimeDaoImpl;
import dao.impl.OrderManageDaoImpl;
import dao.impl.UserDaoImpl;
import dao.impl.UserMoneyDaoImpl;
import entity.Movie;
import entity.MovieCinema;
import entity.MovieComments;
import entity.MovieHall;
import entity.MovieTicket;
import entity.MovieTime;
import entity.OrderManage;
import entity.User;
import entity.UserMoney;

/**
 * 界面
 */

public class UserView {
	private static Scanner SCAN;
	private static UserDaoImpl user;
	public static MovieDaoImpl movie;
	public static int movieNumber;
	public static int newFocus;
	public static MovieCommentsDaoImpl moviecomment;
	public static MovieCinemaDaoImpl moviecinema;
	public static int cinemaChoose;
	public static MovieHallDaoImpl moviehall;
	public static int movieHallChoose;
	public static MovieTimeDaoImpl movietime;
	public static int movieTimeQuery;
	public static int seatChoose;
	public static MovieTicketDaoImpl movieticket;
	private static String movie_Name;
	private static String cinema_Name;
	private static String movieHall_Name;
	private static float movie_Price;
	public static UserMoneyDaoImpl usermoney;
	public static String userMoneyName;
	public static float balance;
	public static OrderManageDaoImpl orderManage;
	public static String movie_Time;

	
	static {
		movieNumber = 0;
		newFocus = 0;
		cinemaChoose = 0;
		movieHallChoose = 0;
		SCAN = new Scanner(System.in);
		user = new UserDaoImpl();
		movie = new MovieDaoImpl();
		moviecomment = new MovieCommentsDaoImpl();
		moviecinema = new MovieCinemaDaoImpl();
		moviehall = new MovieHallDaoImpl();
		movietime = new MovieTimeDaoImpl();
		movieticket = new MovieTicketDaoImpl();
		usermoney = new UserMoneyDaoImpl();
		orderManage=new OrderManageDaoImpl();
	}

	public static void welcome() {
		System.out.println("**************启动**************");
		System.out.println("欢迎进入电影购票系统:");
		System.out.println("1.登录");
		System.out.println("2.注册");
		System.out.println("3.后台");
		System.out.println("0.退出");

		switch (getNumber()) {
		case 1:
			userLogin();
			break;
		case 2:
			userRegist();
			break;
		case 3:
			administratorLogin();
			break;
		case 0:
			System.out.println("谢谢使用本系统！");
			break;
		default:
			System.out.println("格式错误，请重新输入！");
			welcome();
			break;
		}
	}

	// 1.用户登录
	public static void userLogin() {
		System.out.println("*************用户登录*************");
		System.out.println("请输入账号:");
		String user_name = getString();
		System.out.println("请输入密码:");
		String user_psd = getString();

		HashMap<String, String> hmap = user.getUser();
		Set<Entry<String, String>> entrys = hmap.entrySet();

		for (Entry<String, String> entry : entrys) {
			if (user_name.equals(entry.getKey()) && user_psd.equals(entry.getValue())) {
				System.out.println("登录成功！");
				userMoneyName = entry.getKey();
				manage();
				return;
			}
		}
		System.out.println("用户名或密码错误，请重新输入！");
		userLogin();
	}

	// 2.用户注册
	public static void userRegist() {
		System.out.println("************用户注册************");
		System.out.println("请输入账号:");
		String user_name = getString();
		HashMap<String, String> hmap = user.getUser();
		Set<Entry<String, String>> entrys = hmap.entrySet();
		for (Entry<String, String> entry : entrys) {
			if (user_name.equals(entry.getKey())) {
				System.out.println("已有账号名，请重新输入！");
				userRegist();
			}
		}
		System.out.println("请输入密码:");
		String user_psd = getString();
		System.out.println("再次确认密码:");
		String user_psd2 = getString();
		if (!user_psd.equals(user_psd2)) {
			System.out.println("两次输入密码不一致！请重新输入!");
			userRegist();
		}
		System.out.println("请输入你的性别（男/女）:");
		String user_sex = getString();
		System.out.println("请输入你的电话号码:");
		long user_phone = getPhone();

		user.insert(new User(user_name, user_psd2, user_sex, user_phone));
		System.out.println();
		System.out.println("注册成功！");
		usermoney.insertUserMoney(new UserMoney(user_name));
		welcome();
	}
	
	//3.后台管理员登录
	public static void administratorLogin(){
		System.out.println("管理员账号:");
		String administratorAccount=getString();
		System.out.println("管理员密码:");
		String administratorPsd=getString();
		
		if(administratorAccount.equals("admin")&&administratorPsd.equals("admin")) {
			ManageView.background();
		}else {
			System.out.println("登录失败！");
			welcome();
		}
	}
	

	// 登录成功（首页）
	public static void manage() {
		System.out.println("**************首页**************");
		System.out.println("1.购票");
		System.out.println("2.电影查询");
		System.out.println("3.充值");
		System.out.println("4.我的电影票【评论】");
		System.out.println("5.个人信息");
		System.out.println("0.退出");

		switch (getNumber()) {
		case 1:
			buy();
			break;
		case 2:
			moiveQuery();
			break;
		case 3:
			charge();
			break;
		case 4:
			myMovie();
			break;
		case 5:
			information();
			break;
		case 0:
			ex();
			break;
		default:
			System.out.println("格式错误，请重新输入！");
			break;
		}
	}

	// 1.购票
	public static void buy() {
		System.out.println("************电影列表************");
		System.out.println("请选择电影:");
		List<Movie> mlist = movie.getMovieInformation();
		for (Movie m : mlist) {
			System.out.println(m.getMovieId() + "、" + m.getMovieName() + "(" + m.getType() + ")");
		}

		System.out.println();
		System.out.println("0.返回");
		System.out.println("请选择:");
		
		movieNumber = getNumber();
		
		if(movieNumber==0) {
			manage();
		}else if(movieNumber>=1&&movieNumber<=mlist.size()) {
			for (Movie m : mlist) {
				if (movieNumber == m.getMovieId()) {
					System.out.println(m.toString());
					movie_Name = m.getMovieName();
					buyGetMore();
					return;
				}
			}
		}else {
			System.out.println("未查到该电影，请重新输入！");
			buy();
		}

	}

	public static void buyGetMore() {
		System.out.println();
		System.out.println("1.购票");
		System.out.println("2.关注电影");
		System.out.println("3.查看评论");
		System.out.println("0.返回电影列表");

		switch (getNumber()) {
		case 0:
			buy();
			break;
		case 1:
			selectCinema();
			break;
		case 2:
			buyFocus();
			break;
		case 3:
			buyGetMoreComments();
			break;
		default:
			System.out.println("你的输入有误，请重新输入！");
			buyGetMore();
			break;
		}
	}

	// 补充关注
	public static void buyFocus() {
		List<Movie> mlist = movie.getMovieInformation();
		for (Movie m : mlist) {
			if (movieNumber == m.getMovieId()) {
				newFocus = m.getFocus() + 1;
			}
		}

		movie.updateFocus();
		List<Movie> newlist = movie.getMovieInformation();
		for (Movie m : newlist) {
			if (movieNumber == m.getMovieId()) {
				System.out.println(m.toString());
				buyGetMore();
			}
		}
	}

	// 补充得到更多评论,mcsList=movieCommentSingleList
	public static void buyGetMoreComments() {
		List<MovieComments> mcsList = moviecomment.getSingleMovieComments();
		int count=1;
		System.out.println("评论区:");
		for (MovieComments m : mcsList) {
			System.out.println((count++)+"."+m.getMoreComment());
		}

		System.out.println();
		System.out.println("0.返回电影列表");

		switch (getNumber()) {
		case 0:
			buy();
			break;
		default:
			System.out.println("你的输入有误，请重新输入！");
			System.out.println("============================================================================");
			buyGetMoreComments();
			break;
		}
	}

	// 影院选择
	public static void selectCinema() {
		System.out.println("************影院选择************");
		List<MovieCinema> cinemaList = moviecinema.getCinema();
		for (MovieCinema cml : cinemaList) {
			System.out.println(cml.toString());
		}

		System.out.println();
		System.out.println("0.返回电影选择");
		System.out.println("请选择:");
		cinemaChoose = getNumber();

		if (cinemaChoose == 0) {
			buy();
		} else if (cinemaChoose >= 1 && cinemaChoose <= cinemaList.size()) {
			for (MovieCinema c : cinemaList) {
				if (cinemaChoose == c.getCinemaId()) {
					cinema_Name = c.getCinemaName();
				}
			}
			MovieHallQuery();
		} else {
			System.out.println("你的输入有误，请重新输入！");
			System.out.println("请选择影院:");
			selectCinema();
		}

	}

	// 影厅选择
	public static void MovieHallQuery() {
		System.out.println("************影厅选择************");
		List<MovieHall> mhList = moviehall.getMovieHall(cinemaChoose);
		for (MovieHall mh : mhList) {
			System.out.println(mh.toString());
		}

		System.out.println();
		System.out.println("0.返回影院选择");
		System.out.println("请选择:");

		movieHallChoose = getNumber();

		if (movieHallChoose == 0) {
			selectCinema();
		} else if (movieHallChoose >= 1 && movieHallChoose <= mhList.size()) {
			for (MovieHall m : mhList) {
				if (movieHallChoose == m.getHallId()) {
					movieHall_Name = m.getMovieHallName();
				}
			}
			MovieTimeQuery();
		} else {
			System.out.println("你的输入有误，请重新输入！");
			System.out.println("请选择影厅:");
			MovieHallQuery();
		}

	}

	// 场次选择
	public static void MovieTimeQuery() {
		System.out.println("************场次选择************");
		List<MovieTime> mtList = movietime.getSingleTime(movieNumber,cinemaChoose,movieHallChoose);
		int count=1;
		for (MovieTime mt : mtList) {
			System.out.println((count++)+"."+mt.timeChoose());
		}

		System.out.println();
		System.out.println("0.返回影厅选择");
		System.out.println("请选择:");

		movieTimeQuery = getNumber();

		if (movieTimeQuery == 0) {
			MovieHallQuery();
		} else if (movieTimeQuery >= 1 && movieTimeQuery <= mtList.size()) {
			for (MovieTime mtp : mtList) {
				if (movieHallChoose == mtp.getHallId()) {
					movie_Price = mtp.getPrice();
					//保存时间
					movie_Time=mtp.getTime();
				}
			}
			seat();
		} else {
			System.out.println("你的输入有误，请重新输入！");
			System.out.println("请选择:");
			MovieTimeQuery();
		}
	}

	public static void seat() {
		System.out.println("************座位选择************");
		System.out.println("                    =============大屏幕=============");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 3 || j == 4 || j == 5 || j == 6) {
					System.out.print(10 * i + j + ".[X]" + "\t");

				} else {
					System.out.print(10 * i + j + ".[_]" + "\t");
					if (j == 9) {
						System.out.println();
					}
				}
			}
		}

		System.out.println();
		System.out.println("请选择座位:");
		seatChoose = getNumber();
		if (seatChoose <= 10 || seatChoose >= 100) {
			System.out.println("为查找到座位号，请输入正确的座位号！");
			seat();
		} else if (seatChoose % 10 == 3 || seatChoose % 10 == 4 || seatChoose % 10 == 5 || seatChoose % 10 == 6) {
			System.out.println("该座位已有人，请重新选择座位号！");
			seat();
		}
		movieInformation();
	}

	// 电影票详情
	public static void movieInformation() {
		System.out.println("************电影票************");

		System.out.println();
		System.out.println("电影:" + movie_Name);
		System.out.println("影院:" + cinema_Name);
		System.out.println("影厅:" + movieHall_Name);
		System.out.println("座位:" + seatChoose);
		System.out.println("场次:" + movie_Time);
		System.out.println("金额:" + movie_Price + "元");

		System.out.println();
		System.out.println("1.购买--【yes：完成，no：提示余额不足】");
		System.out.println("2.充值");
		System.out.println("3.返回主界面");
		System.out.println("0.返回选座");

		System.out.println();
		System.out.println("请选择:");

		switch (getNumber()) {
		case 1:
			buyTicket();
			break;
		case 2:
			charge();
			break;
		case 3:
			manage();
			break;
		case 0:
			seat();
			break;
		default:
			System.out.println("你的输入有误，请重新输入！");
			movieInformation();
		}
	}

	public static void buyTicket() {
		HashMap<String, Float> umMap = usermoney.getSingle();
		Set<Entry<String, Float>> entrys = umMap.entrySet();
		for (Entry<String, Float> entry : entrys) {
			if (entry.getKey().equals(userMoneyName)) {
				balance = entry.getValue();
			}
		}
		if (balance >= movie_Price) {
			balance -= movie_Price;
			System.out.println("yes，购买成功！");
			//传入订单管理(目前已支付)
			orderManage.insertBuyOrder(new OrderManage(userMoneyName,movieNumber,cinemaChoose,movieHallChoose,movie_Price,1));
			movieticket.insertMovieTicket(new MovieTicket(userMoneyName,movieNumber, cinemaChoose, movieHallChoose, movie_Name,
					cinema_Name, movieHall_Name,movie_Time,movie_Price));
			usermoney.updateMoney();
			manage();
		} else {
			System.out.println("no,余额不足！");
			//传入订单管理(未支付)
			orderManage.insertBuyOrder(new OrderManage(userMoneyName,movieNumber,cinemaChoose,movieHallChoose,movie_Price,0));
			movieInformation();
		}
	}

	// 2.电影查询
	public static void moiveQuery() {
		System.out.println("************电影票************");
		System.out.println("请输入你要查询的电影名称:");
		String moiveQueryName = getString();
		List<Movie> movieList = movie.getMovieInformation();
		boolean flag = true;
		if (flag) {
			for (Movie ml : movieList) {
				if (moiveQueryName.equals(ml.getMovieName())) {
					System.out.println(ml.toString());
					flag = false;
				}
			}
		}

		if (flag) {
			System.out.println("未查到此电影！请重新操作");
			moiveQuery();
		}

		System.out.println();
		System.out.println("1.购买电影");
		System.out.println("0.返回");
		switch (getNumber()) {
		case 1:
			selectCinema();
		case 0:
			manage();
			break;
		default:
			System.out.println("你的输入有误，请重新操作！");
			moiveQuery();
			break;
		}

	}

	// 3.充值
	public static void charge() {
		System.out.println("************充值界面************");
		System.out.println("请输入要充值的金额:");
		
		int chargeMoney = getNumber();
		HashMap<String, Float> umMap = usermoney.getSingle();
		Set<Entry<String, Float>> entrys = umMap.entrySet();
		for (Entry<String, Float> entry : entrys) {
			if (entry.getKey().equals(userMoneyName)) {
				balance = entry.getValue();
			}
		}
		balance += chargeMoney;
		usermoney.updateMoney();
		System.out.println("充值成功");
		
		System.out.println("==============================");
		System.out.println("1.返回支付界面");
		System.out.println("0.返回主界面");
		
		switch(getNumber()) {
		case 1:
			movieInformation();
			break;
		case 0:
			manage();
		default:
			System.out.println("你的输入有误，请重新输入！");
			manage();
		}
	}

	// 4.我的电影票【评论】
	public static void myMovie() {
		System.out.println("************我的电影票************");
		List<MovieTicket> myMTList = movieticket.getMovieTicket(userMoneyName);
		int count=1;
		for (MovieTicket my : myMTList) {
			System.out.println((count++)+"."+my.toString());
		}

		System.out.println();
		System.out.println("1.对电影评价");
		System.out.println("0.返回");
		switch (getNumber()) {
		case 1:
			comments();
			break;
		case 0:
			manage();
			break;
		default:
			System.out.println("你的输入有误，请重新输入！");
			myMovie();
			break;
		}
	}

	// 已购电影的评价,电影名字一样的话将所有该电影的评价一起发出来
	public static void comments() {
		System.out.println("************电影评论************");
		System.out.println("我的评论:");
		System.out.println("\t"+"评论内容"+"\t"+"电影Id"+"\t"+"时间");
		System.out.println("============================================================================");
		List<MovieComments> sgucList = moviecomment.getSingleUserComments(userMoneyName);
		int count=1;
		for (MovieComments m : sgucList) {
			System.out.println((count++)+"."+m.toString());
		}
	
		System.out.println("============================================================================");
		
		System.out.println("(只有已购电影才能评论!)");
		System.out.println("你需要评论的电影名:");
		String commentsMovieName = getString();
		String commentsContent = null;
		boolean flag = true;
		List<MovieTicket> myMTList = movieticket.getMovieTicket(userMoneyName);
		if (flag) {
			for (MovieTicket my : myMTList) {
				if (commentsMovieName.equals(my.getMovieName())) {
					int movieNumber = my.getMovieId();
					System.out.println("评论内容:");
					flag = false;
					commentsContent = getString();
					// 获取当前时间
					Date date = new Date();
					String time = DateFormat.getDateTimeInstance().format(date);

					moviecomment.insertComments(new MovieComments(commentsContent, movieNumber, time, userMoneyName));
					System.out.println("评论成功！");
					manage();
				}
				
			}
		}

		if (flag) {
			System.out.println("你未购买此电影，故不能评论！");
			comments();
		}

	}

	// 5.个人信息
	public static void information() {
		System.out.println("************个人信息************");
		User usersingle = user.getSingleUser();
		System.out.println(usersingle.toString());
		HashMap<String, Float> umMap = usermoney.getSingle();
		Set<Entry<String, Float>> entrys = umMap.entrySet();
		for (Entry<String, Float> entry : entrys) {
			if (entry.getKey().equals(userMoneyName)) {
				balance = entry.getValue();
			}
		}
		System.out.println("余额:" + balance + "元");
		System.out.println();
		System.out.println("1.修改");
		System.out.println("0.返回");
		switch (getNumber()) {
		case 1:
			change();
			break;
		case 0:
			manage();
			break;
		default:
			System.out.println("你的输入有误，请重新输入！");
			information();
			break;
		}
	}

	// 修改
	public static void change() {
		System.out.println("**********个人信息修改**********");
		System.out.println("(目前只能修改密码)");
		System.out.println("将密码修改为:");
		String psd = getString();
		user.updateUserPsd(psd);
		System.out.println("修改成功！");

		information();
	}

	// 0.退出
	public static void ex() {
		welcome();
	}

	// 获得键盘输入数字
	public static int getNumber() {
		while (true) {
			try {
				int value = SCAN.nextInt();
				return value;
			} catch (Exception e) {
				SCAN = new Scanner(System.in);
				System.out.println("格式错误，请重新输入！");
			}
		}
	}

	// 获得键盘输入电话号码
	public static long getPhone() {
		while (true) {
			try {
				long value = SCAN.nextLong();
				return value;
			} catch (Exception e) {
				SCAN = new Scanner(System.in);
				System.out.println("请输入正确的电话号码！");
			}
		}
	}

	// 获得键盘输入字符串
	public static String getString() {
		String value = SCAN.next();
		return value;
	}

}
