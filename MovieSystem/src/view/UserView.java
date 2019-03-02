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
 * ����
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
		System.out.println("**************����**************");
		System.out.println("��ӭ�����Ӱ��Ʊϵͳ:");
		System.out.println("1.��¼");
		System.out.println("2.ע��");
		System.out.println("3.��̨");
		System.out.println("0.�˳�");

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
			System.out.println("ллʹ�ñ�ϵͳ��");
			break;
		default:
			System.out.println("��ʽ�������������룡");
			welcome();
			break;
		}
	}

	// 1.�û���¼
	public static void userLogin() {
		System.out.println("*************�û���¼*************");
		System.out.println("�������˺�:");
		String user_name = getString();
		System.out.println("����������:");
		String user_psd = getString();

		HashMap<String, String> hmap = user.getUser();
		Set<Entry<String, String>> entrys = hmap.entrySet();

		for (Entry<String, String> entry : entrys) {
			if (user_name.equals(entry.getKey()) && user_psd.equals(entry.getValue())) {
				System.out.println("��¼�ɹ���");
				userMoneyName = entry.getKey();
				manage();
				return;
			}
		}
		System.out.println("�û���������������������룡");
		userLogin();
	}

	// 2.�û�ע��
	public static void userRegist() {
		System.out.println("************�û�ע��************");
		System.out.println("�������˺�:");
		String user_name = getString();
		HashMap<String, String> hmap = user.getUser();
		Set<Entry<String, String>> entrys = hmap.entrySet();
		for (Entry<String, String> entry : entrys) {
			if (user_name.equals(entry.getKey())) {
				System.out.println("�����˺��������������룡");
				userRegist();
			}
		}
		System.out.println("����������:");
		String user_psd = getString();
		System.out.println("�ٴ�ȷ������:");
		String user_psd2 = getString();
		if (!user_psd.equals(user_psd2)) {
			System.out.println("�����������벻һ�£�����������!");
			userRegist();
		}
		System.out.println("����������Ա���/Ů��:");
		String user_sex = getString();
		System.out.println("��������ĵ绰����:");
		long user_phone = getPhone();

		user.insert(new User(user_name, user_psd2, user_sex, user_phone));
		System.out.println();
		System.out.println("ע��ɹ���");
		usermoney.insertUserMoney(new UserMoney(user_name));
		welcome();
	}
	
	//3.��̨����Ա��¼
	public static void administratorLogin(){
		System.out.println("����Ա�˺�:");
		String administratorAccount=getString();
		System.out.println("����Ա����:");
		String administratorPsd=getString();
		
		if(administratorAccount.equals("admin")&&administratorPsd.equals("admin")) {
			ManageView.background();
		}else {
			System.out.println("��¼ʧ�ܣ�");
			welcome();
		}
	}
	

	// ��¼�ɹ�����ҳ��
	public static void manage() {
		System.out.println("**************��ҳ**************");
		System.out.println("1.��Ʊ");
		System.out.println("2.��Ӱ��ѯ");
		System.out.println("3.��ֵ");
		System.out.println("4.�ҵĵ�ӰƱ�����ۡ�");
		System.out.println("5.������Ϣ");
		System.out.println("0.�˳�");

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
			System.out.println("��ʽ�������������룡");
			break;
		}
	}

	// 1.��Ʊ
	public static void buy() {
		System.out.println("************��Ӱ�б�************");
		System.out.println("��ѡ���Ӱ:");
		List<Movie> mlist = movie.getMovieInformation();
		for (Movie m : mlist) {
			System.out.println(m.getMovieId() + "��" + m.getMovieName() + "(" + m.getType() + ")");
		}

		System.out.println();
		System.out.println("0.����");
		System.out.println("��ѡ��:");
		
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
			System.out.println("δ�鵽�õ�Ӱ�����������룡");
			buy();
		}

	}

	public static void buyGetMore() {
		System.out.println();
		System.out.println("1.��Ʊ");
		System.out.println("2.��ע��Ӱ");
		System.out.println("3.�鿴����");
		System.out.println("0.���ص�Ӱ�б�");

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
			System.out.println("��������������������룡");
			buyGetMore();
			break;
		}
	}

	// �����ע
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

	// ����õ���������,mcsList=movieCommentSingleList
	public static void buyGetMoreComments() {
		List<MovieComments> mcsList = moviecomment.getSingleMovieComments();
		int count=1;
		System.out.println("������:");
		for (MovieComments m : mcsList) {
			System.out.println((count++)+"."+m.getMoreComment());
		}

		System.out.println();
		System.out.println("0.���ص�Ӱ�б�");

		switch (getNumber()) {
		case 0:
			buy();
			break;
		default:
			System.out.println("��������������������룡");
			System.out.println("============================================================================");
			buyGetMoreComments();
			break;
		}
	}

	// ӰԺѡ��
	public static void selectCinema() {
		System.out.println("************ӰԺѡ��************");
		List<MovieCinema> cinemaList = moviecinema.getCinema();
		for (MovieCinema cml : cinemaList) {
			System.out.println(cml.toString());
		}

		System.out.println();
		System.out.println("0.���ص�Ӱѡ��");
		System.out.println("��ѡ��:");
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
			System.out.println("��������������������룡");
			System.out.println("��ѡ��ӰԺ:");
			selectCinema();
		}

	}

	// Ӱ��ѡ��
	public static void MovieHallQuery() {
		System.out.println("************Ӱ��ѡ��************");
		List<MovieHall> mhList = moviehall.getMovieHall(cinemaChoose);
		for (MovieHall mh : mhList) {
			System.out.println(mh.toString());
		}

		System.out.println();
		System.out.println("0.����ӰԺѡ��");
		System.out.println("��ѡ��:");

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
			System.out.println("��������������������룡");
			System.out.println("��ѡ��Ӱ��:");
			MovieHallQuery();
		}

	}

	// ����ѡ��
	public static void MovieTimeQuery() {
		System.out.println("************����ѡ��************");
		List<MovieTime> mtList = movietime.getSingleTime(movieNumber,cinemaChoose,movieHallChoose);
		int count=1;
		for (MovieTime mt : mtList) {
			System.out.println((count++)+"."+mt.timeChoose());
		}

		System.out.println();
		System.out.println("0.����Ӱ��ѡ��");
		System.out.println("��ѡ��:");

		movieTimeQuery = getNumber();

		if (movieTimeQuery == 0) {
			MovieHallQuery();
		} else if (movieTimeQuery >= 1 && movieTimeQuery <= mtList.size()) {
			for (MovieTime mtp : mtList) {
				if (movieHallChoose == mtp.getHallId()) {
					movie_Price = mtp.getPrice();
					//����ʱ��
					movie_Time=mtp.getTime();
				}
			}
			seat();
		} else {
			System.out.println("��������������������룡");
			System.out.println("��ѡ��:");
			MovieTimeQuery();
		}
	}

	public static void seat() {
		System.out.println("************��λѡ��************");
		System.out.println("                    =============����Ļ=============");
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
		System.out.println("��ѡ����λ:");
		seatChoose = getNumber();
		if (seatChoose <= 10 || seatChoose >= 100) {
			System.out.println("Ϊ���ҵ���λ�ţ���������ȷ����λ�ţ�");
			seat();
		} else if (seatChoose % 10 == 3 || seatChoose % 10 == 4 || seatChoose % 10 == 5 || seatChoose % 10 == 6) {
			System.out.println("����λ�����ˣ�������ѡ����λ�ţ�");
			seat();
		}
		movieInformation();
	}

	// ��ӰƱ����
	public static void movieInformation() {
		System.out.println("************��ӰƱ************");

		System.out.println();
		System.out.println("��Ӱ:" + movie_Name);
		System.out.println("ӰԺ:" + cinema_Name);
		System.out.println("Ӱ��:" + movieHall_Name);
		System.out.println("��λ:" + seatChoose);
		System.out.println("����:" + movie_Time);
		System.out.println("���:" + movie_Price + "Ԫ");

		System.out.println();
		System.out.println("1.����--��yes����ɣ�no����ʾ���㡿");
		System.out.println("2.��ֵ");
		System.out.println("3.����������");
		System.out.println("0.����ѡ��");

		System.out.println();
		System.out.println("��ѡ��:");

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
			System.out.println("��������������������룡");
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
			System.out.println("yes������ɹ���");
			//���붩������(Ŀǰ��֧��)
			orderManage.insertBuyOrder(new OrderManage(userMoneyName,movieNumber,cinemaChoose,movieHallChoose,movie_Price,1));
			movieticket.insertMovieTicket(new MovieTicket(userMoneyName,movieNumber, cinemaChoose, movieHallChoose, movie_Name,
					cinema_Name, movieHall_Name,movie_Time,movie_Price));
			usermoney.updateMoney();
			manage();
		} else {
			System.out.println("no,���㣡");
			//���붩������(δ֧��)
			orderManage.insertBuyOrder(new OrderManage(userMoneyName,movieNumber,cinemaChoose,movieHallChoose,movie_Price,0));
			movieInformation();
		}
	}

	// 2.��Ӱ��ѯ
	public static void moiveQuery() {
		System.out.println("************��ӰƱ************");
		System.out.println("��������Ҫ��ѯ�ĵ�Ӱ����:");
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
			System.out.println("δ�鵽�˵�Ӱ�������²���");
			moiveQuery();
		}

		System.out.println();
		System.out.println("1.�����Ӱ");
		System.out.println("0.����");
		switch (getNumber()) {
		case 1:
			selectCinema();
		case 0:
			manage();
			break;
		default:
			System.out.println("����������������²�����");
			moiveQuery();
			break;
		}

	}

	// 3.��ֵ
	public static void charge() {
		System.out.println("************��ֵ����************");
		System.out.println("������Ҫ��ֵ�Ľ��:");
		
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
		System.out.println("��ֵ�ɹ�");
		
		System.out.println("==============================");
		System.out.println("1.����֧������");
		System.out.println("0.����������");
		
		switch(getNumber()) {
		case 1:
			movieInformation();
			break;
		case 0:
			manage();
		default:
			System.out.println("��������������������룡");
			manage();
		}
	}

	// 4.�ҵĵ�ӰƱ�����ۡ�
	public static void myMovie() {
		System.out.println("************�ҵĵ�ӰƱ************");
		List<MovieTicket> myMTList = movieticket.getMovieTicket(userMoneyName);
		int count=1;
		for (MovieTicket my : myMTList) {
			System.out.println((count++)+"."+my.toString());
		}

		System.out.println();
		System.out.println("1.�Ե�Ӱ����");
		System.out.println("0.����");
		switch (getNumber()) {
		case 1:
			comments();
			break;
		case 0:
			manage();
			break;
		default:
			System.out.println("��������������������룡");
			myMovie();
			break;
		}
	}

	// �ѹ���Ӱ������,��Ӱ����һ���Ļ������иõ�Ӱ������һ�𷢳���
	public static void comments() {
		System.out.println("************��Ӱ����************");
		System.out.println("�ҵ�����:");
		System.out.println("\t"+"��������"+"\t"+"��ӰId"+"\t"+"ʱ��");
		System.out.println("============================================================================");
		List<MovieComments> sgucList = moviecomment.getSingleUserComments(userMoneyName);
		int count=1;
		for (MovieComments m : sgucList) {
			System.out.println((count++)+"."+m.toString());
		}
	
		System.out.println("============================================================================");
		
		System.out.println("(ֻ���ѹ���Ӱ��������!)");
		System.out.println("����Ҫ���۵ĵ�Ӱ��:");
		String commentsMovieName = getString();
		String commentsContent = null;
		boolean flag = true;
		List<MovieTicket> myMTList = movieticket.getMovieTicket(userMoneyName);
		if (flag) {
			for (MovieTicket my : myMTList) {
				if (commentsMovieName.equals(my.getMovieName())) {
					int movieNumber = my.getMovieId();
					System.out.println("��������:");
					flag = false;
					commentsContent = getString();
					// ��ȡ��ǰʱ��
					Date date = new Date();
					String time = DateFormat.getDateTimeInstance().format(date);

					moviecomment.insertComments(new MovieComments(commentsContent, movieNumber, time, userMoneyName));
					System.out.println("���۳ɹ���");
					manage();
				}
				
			}
		}

		if (flag) {
			System.out.println("��δ����˵�Ӱ���ʲ������ۣ�");
			comments();
		}

	}

	// 5.������Ϣ
	public static void information() {
		System.out.println("************������Ϣ************");
		User usersingle = user.getSingleUser();
		System.out.println(usersingle.toString());
		HashMap<String, Float> umMap = usermoney.getSingle();
		Set<Entry<String, Float>> entrys = umMap.entrySet();
		for (Entry<String, Float> entry : entrys) {
			if (entry.getKey().equals(userMoneyName)) {
				balance = entry.getValue();
			}
		}
		System.out.println("���:" + balance + "Ԫ");
		System.out.println();
		System.out.println("1.�޸�");
		System.out.println("0.����");
		switch (getNumber()) {
		case 1:
			change();
			break;
		case 0:
			manage();
			break;
		default:
			System.out.println("��������������������룡");
			information();
			break;
		}
	}

	// �޸�
	public static void change() {
		System.out.println("**********������Ϣ�޸�**********");
		System.out.println("(Ŀǰֻ���޸�����)");
		System.out.println("�������޸�Ϊ:");
		String psd = getString();
		user.updateUserPsd(psd);
		System.out.println("�޸ĳɹ���");

		information();
	}

	// 0.�˳�
	public static void ex() {
		welcome();
	}

	// ��ü�����������
	public static int getNumber() {
		while (true) {
			try {
				int value = SCAN.nextInt();
				return value;
			} catch (Exception e) {
				SCAN = new Scanner(System.in);
				System.out.println("��ʽ�������������룡");
			}
		}
	}

	// ��ü�������绰����
	public static long getPhone() {
		while (true) {
			try {
				long value = SCAN.nextLong();
				return value;
			} catch (Exception e) {
				SCAN = new Scanner(System.in);
				System.out.println("��������ȷ�ĵ绰���룡");
			}
		}
	}

	// ��ü��������ַ���
	public static String getString() {
		String value = SCAN.next();
		return value;
	}

}
