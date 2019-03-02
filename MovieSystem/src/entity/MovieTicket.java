package entity;

/**
 * 电影票
 * id，用户名，选座位id，场次id，用户id，支付价格，状态[1:支付，0:未支付]
 */

public class MovieTicket {
//	影票表，
//	（id，选座位id，场次id，用户id，支付价格，状态[1:支付，0:未支付]）
//	1，33,1,1,200,1
//	2，34,1,1,200,1
//	3，12,4,2,800,1
//	4，11,4,2,800,0
	
	private int movieTicketId;
	private String userName;
	private int movieId;
	private int cinemaId;
	private int hallId;
	private String movieName;
	private String cinemaName;
	private String movieHallName;
	private String time;
	private float price;
	
	public MovieTicket() {
	}
	
	
	
	public MovieTicket(String userName, int movieId, int cinemaId, int hallId, String movieName,
			String cinemaName, String movieHallName, String time, float price) {
		this.userName = userName;
		this.movieId = movieId;
		this.cinemaId = cinemaId;
		this.hallId = hallId;
		this.movieName = movieName;
		this.cinemaName = cinemaName;
		this.movieHallName = movieHallName;
		this.time = time;
		this.price = price;
	}

	

	public MovieTicket(int movieId, int cinemaId, int hallId, String movieName, String cinemaName,
			String movieHallName, String time, float price) {
		this.movieId = movieId;
		this.cinemaId = cinemaId;
		this.hallId = hallId;
		this.movieName = movieName;
		this.cinemaName = cinemaName;
		this.movieHallName = movieHallName;
		this.time = time;
		this.price = price;
	}

	public MovieTicket(int movieId,String movieName, String cinemaName,
			String movieHallName, String time, float price) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.cinemaName = cinemaName;
		this.movieHallName = movieHallName;
		this.time = time;
		this.price = price;
	}

	public MovieTicket(String movieName,String cinemaName, String movieHallName, float price) {
		this.movieName = movieName;
		this.cinemaName = cinemaName;
		this.movieHallName = movieHallName;
		this.price = price;
	}
	
	public MovieTicket( int movieId, int cinemaId, int hallId, String movieName,
			String cinemaName, String movieHallName, float price) {
		this.movieId = movieId;
		this.cinemaId = cinemaId;
		this.hallId = hallId;
		this.movieName = movieName;
		this.cinemaName = cinemaName;
		this.movieHallName = movieHallName;
		this.price = price;
	}
	
	public MovieTicket(String movieName,String cinemaName, String movieHallName,String time,float price) {
		this.movieName = movieName;
		this.cinemaName = cinemaName;
		this.movieHallName = movieHallName;
		this.time=time;
		this.price = price;
	}

	public MovieTicket(int movieTicketId, int movieId, int cinemaId, int hallId, String movieName,
			String cinemaName, String movieHallName, float price) {
		this.movieTicketId = movieTicketId;
		this.movieId = movieId;
		this.cinemaId = cinemaId;
		this.hallId = hallId;
		this.movieName = movieName;
		this.cinemaName = cinemaName;
		this.movieHallName = movieHallName;
		this.price = price;
	}
	
	public MovieTicket(int movieTicketId, String movieName,String cinemaName, String movieHallName, float price) {
		
		this.movieTicketId = movieTicketId;
		this.movieName = movieName;
		this.cinemaName = cinemaName;
		this.movieHallName = movieHallName;
		this.price = price;
	}
	
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getMovieTicketId() {
		return movieTicketId;
	}

	public void setMovieTicketId(int movieTicketId) {
		this.movieTicketId = movieTicketId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getCinemaId() {
		return cinemaId;
	}

	public void setCinemaId(int cinemaId) {
		this.cinemaId = cinemaId;
	}

	public int getHallId() {
		return hallId;
	}

	public void setHallId(int hallId) {
		this.hallId = hallId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getCinemaName() {
		return cinemaName;
	}

	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}

	public String getMovieHallName() {
		return movieHallName;
	}

	public void setMovieHallName(String movieHallName) {
		this.movieHallName = movieHallName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return 	"电影名:"+movieName+"\n"+
				"影院:"+cinemaName+"\n"+
				"影厅:"+movieHallName+"\n"+
				"场次:"+time+"\n"+
				"金额:"+price;
	}
	
	
	
}
