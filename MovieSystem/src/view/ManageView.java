package view;

import java.util.List;

import entity.Movie;
import entity.MovieCinema;
import entity.MovieComments;
import entity.MovieHall;
import entity.MovieTime;
import entity.OrderManage;

/**
 *	��̨
 */
public class ManageView {
	
	public static int cinema_Id;
	public static int hall_Id;
	
	
	
	public static void background() {
		System.out.println("***************��ҳ***************");
		System.out.println("1.��Ӱ����");
		System.out.println("2.ӰԺ����");
		System.out.println("3.Ӱ������");
		System.out.println("4.���ι���");
		System.out.println("5.��������ӰƱ��");// vip��ѡ����
		System.out.println("6.Ӱ������");
		System.out.println("0.�˳�");

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
			System.out.println("��ʽ�������������룡");
			break;
		}
	}

	// 1.��Ӱ����
	public static void movieManage() {
		System.out.println("*************��Ӱ����*************");
		System.out.println("��Ӱ�б�:");
		List<Movie> mlist = UserView.movie.getMovieInformation();
		for (Movie m : mlist) {
			System.out.println(m.getMovieId() + "��" + m.getMovieName() + "(" + m.getType() + ")");
		}
		
		System.out.println();
		System.out.println("1.��ӵ�Ӱ");
		System.out.println("0.����");
		
		switch(UserView.getNumber()) {
			case 1:
				addMovie();
				break;
			case 0:
				background();
				break;
			default:
				System.out.println("��������������������룡");
				movieManage();
				break;
		}
	}
	
	//��ӵ�Ӱ
	public static void addMovie() {
		System.out.println("*************��ӵ�Ӱ*************");
		System.out.println("��Ӱ��:");
		String movieName=UserView.getString();
		System.out.println("��Ա:");
		String actor=UserView.getString();
		System.out.println("ʱ��:");
		String timeLength=UserView.getString();
		System.out.println("����:");
		String type=UserView.getString();
		System.out.println("��ӳʱ��:");
		String releaseTime=UserView.getString();
		System.out.println("���:");
		String introduction=UserView.getString();
		
		System.out.println();
		UserView.movie.insert(new Movie(movieName,actor,timeLength,type,releaseTime,introduction));
		System.out.println("��Ӱ��ӳɹ���");
		movieManage();
	}

	
	
	// 2.ӰԺ����
	public static void cinemaManage() {
		System.out.println("*************ӰԺ����*************");
		System.out.println("ӰԺ�б�:");
		List<MovieCinema> cinemaList = UserView.moviecinema.getCinema();
		for (MovieCinema cml : cinemaList) {
			System.out.println(cml.toString());
		}
		
		System.out.println();
		System.out.println("1.���ӰԺ");
		System.out.println("0.����");
		
		switch(UserView.getNumber()) {
			case 1:
				addCinema();
				break;
			case 0:
				background();
				break;
			default:
				System.out.println("��������������������룡");
				cinemaManage();
				break;
		}
		
	}
	
	//���ӰԺ
	public static void addCinema() {
		System.out.println("*************���ӰԺ*************");
		System.out.println("ӰԺ��:");
		String cinemaName=UserView.getString();
		System.out.println("��������:");
		String cinemaRegion=UserView.getString();
		System.out.println("��ϸ��ַ:");
		String cinemaAdress=UserView.getString();
		
		System.out.println();
		UserView.moviecinema.insertCinema(new MovieCinema(cinemaName,cinemaAdress,cinemaRegion));
		System.out.println("ӰԺ��ӳɹ���");
		cinemaManage();
	}

	// 3.Ӱ������
	public static void hallManage() {
		System.out.println("*************Ӱ������*************");
		
		System.out.println("================================");
		System.out.println("���е�ӰԺ:");
		List<MovieCinema> cinemaList = UserView.moviecinema.getCinema();
		for (MovieCinema cml : cinemaList) {
			System.out.println(cml.movieList());
		}
		System.out.println();
		System.out.println("0.����");
		System.out.println("================================");
		System.out.println("������Ҫ���Ӱ����ӰԺId:");
		cinema_Id=UserView.getNumber();
		
		if(cinema_Id==0) {
			background();
		}else if(cinema_Id>=1&&cinema_Id<=cinemaList.size()) {
			addMovieHall();
		}else {
			System.out.println("��������������������룡");
			hallManage();
		}
		
	}
	
	//���Ӱ��
	public static void addMovieHall() {
		System.out.println("*************���Ӱ��*************");
		System.out.println("================================");
		System.out.println("���е�Ӱ��:");
		List<MovieHall> mhList = UserView.moviehall.getMovieHall(cinema_Id);
		for (MovieHall mh : mhList) {
			System.out.println(mh.toString());
		}
		System.out.println();
		System.out.println("0.����");
		System.out.println("================================");
		System.out.println("������Ҫ��ӵ�Ӱ��Id:");
		int hallId=UserView.getNumber();
		
		if(hallId==0) {
			hallManage();
		}else if(hallId>=1&&hallId<=mhList.size()) {
			System.out.println("�������Ӱ���Ѵ��ڣ�");
			addMovieHall();
		}else {
			System.out.println("������Ӱ����:");
			String hallName=UserView.getString();
			System.out.println("Ӱ����ӳɹ���");
			UserView.moviehall.insertMovieHall(new MovieHall(hallId,hallName,cinema_Id));
			addMovieHall();
		}
	}

	// 4.���ι���
	public static void sessionManage() {
		System.out.println("*************���ι���*************");
		System.out.println("================================");
		System.out.println("���е�ӰԺ:");
		List<MovieCinema> cinemaList = UserView.moviecinema.getCinema();
		for (MovieCinema cml : cinemaList) {
			System.out.println(cml.movieList());
		}
		System.out.println();
		System.out.println("0.����");
		System.out.println("================================");
		System.out.println("������Ҫ��ӳ��ε�ӰԺId:");
		cinema_Id=UserView.getNumber();
		
		if(cinema_Id==0) {
			background();
		}else if(cinema_Id>=1&&cinema_Id<=cinemaList.size()) {
			hallNumber();
		}else {
			System.out.println("��������������������룡");
			sessionManage();
		}
	}
	
	//����Ӱ����ѡ��
	public static void hallNumber() {
		System.out.println("================================");
		System.out.println("���е�Ӱ��:");
		List<MovieHall> mhList = UserView.moviehall.getMovieHall(cinema_Id);
		for (MovieHall mh : mhList) {
			System.out.println(mh.toString());
		}
		System.out.println();
		System.out.println("0.����");
		System.out.println("================================");
		System.out.println("������Ҫ��ӳ��ε�Ӱ��Id:");
		hall_Id=UserView.getNumber();
		
		if(hall_Id==0) {
			sessionManage();
		}else if(hall_Id>=1&&hall_Id<=mhList.size()) {
			addSession();
		}else {
			System.out.println("��������������������룡");
			hallNumber();
		}
	}
	
	//�������
	public static void addSession() {
		System.out.println("*************��ӳ���*************");
		System.out.println("================================");
		System.out.println("����ʱ���:");
		
		int count=1;
		System.out.println("\t"+"Ӱ��Id"+"\t"+"����");
		List<MovieTime> mtList = UserView.movietime.getSingleAll(cinema_Id, hall_Id);
		for (MovieTime mt : mtList) {
			System.out.println((count++)+"."+mt.toString());
		}
		System.out.println();
		System.out.println("0.����");
		System.out.println("================================");
		System.out.println("������Ҫ��ӳ��εĵ�ӰId:");
		
		int movieId=UserView.getNumber();
		if(movieId==0) {
			hallNumber();
		}else {
			System.out.println("������Ҫ��ӳ��ε�ʱ���:");
			String sessionTime=UserView.getString();
			System.out.println("��������:");
			int price=UserView.getNumber();
			System.out.println("������ӳɹ���");
			UserView.movietime.insertMovieTime(new MovieTime(movieId,sessionTime,price,cinema_Id,hall_Id));
			background();
		}

	}

	// 5.��������ӰƱ��
	public static void orderManage() {
		System.out.println("*************��������*************");
		
		System.out.println("�������"+"\t"+"�û���"+"\t"+"��ӰID"+"\t"+"ӰԺID"+"\t"+"Ӱ��ID"+"\t"
		+"�۸�"+"\t"+"֧��״̬[1:֧����0:δ֧��]");
		
		List<OrderManage> orderManageList=UserView.orderManage.getOrder();
		for(OrderManage oml:orderManageList) {
			System.out.println(oml);
		}
		System.out.println();
		System.out.println("0.����");
		switch(UserView.getNumber()) {
		case 0:
			background();
			break;
		default:
			System.out.println("��������������������룡");
			orderManage();
			break;
		}
	}
	
	//6.�������Ӱ��
	public static void commentsManage() {
		System.out.println("*************Ӱ������*************");
		System.out.println("============================================================================");
		System.out.println("\t"+"��������"+"\t"+"��ӰId"+"\t"+"ʱ��"+"\t"+"�û���");
		System.out.println("============================================================================");
		List<MovieComments> sgucList = UserView.moviecomment.getALLComments();
		for (MovieComments m : sgucList) {
			System.out.println(m.allComments());
		}
	
		System.out.println();
		System.out.println("0.����");
		System.out.println("============================================================================");
		
		switch(UserView.getNumber()) {
		case 0:
			background();
			break;
		default:
			System.out.println("�����������������룡");
			commentsManage();
		}
	}

	// 0.�˳�
	public static void exit() {
		UserView.welcome();
	}
}
