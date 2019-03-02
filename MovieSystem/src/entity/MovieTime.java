package entity;


/**
 * 场次
 * id，电影id，放映时间，价格，影厅id
 */

public class MovieTime {
//	场次表，
//	（id，电影id，放映时间，价格，影厅id）
//	1,1,2018-09-09,200,1
//	2,1,2018-09-09,100,2
//	3,1,2018-09-09,100,3
//	4,2,2018-09-19,800,6
//	5,2,2018-04-11,300,5
	private int movieTimeId;
	private int movieId;
	private String time;
	private float price;
	private int cinemaId;
	private int hallId;
	
	
	public MovieTime() {
		
	}
	
	public MovieTime(String time,int cinemaId, int hallId) {
		super();
		this.time = time;
		this.cinemaId = cinemaId;
		this.hallId = hallId;
	}
	
	public MovieTime( int movieId, String time, float price, int cinemaId, int hallId) {
		this.movieId = movieId;
		this.time = time;
		this.price = price;
		this.cinemaId = cinemaId;
		this.hallId = hallId;
	}

	public MovieTime(int movieTimeId, int movieId, String time, float price, int cinemaId, int hallId) {
		super();
		this.movieTimeId = movieTimeId;
		this.movieId = movieId;
		this.time = time;
		this.price = price;
		this.cinemaId = cinemaId;
		this.hallId = hallId;
	}

	public int getmovieTimeId() {
		return movieTimeId;
	}

	public void setmovieTimeId(int movieTimeId) {
		this.movieTimeId = movieTimeId;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getCinemaId() {
		return cinemaId;
	}

	public void setCinemaId(int cinemaId) {
		this.cinemaId = cinemaId;
	}

	
	public int getMovieTimeId() {
		return movieTimeId;
	}

	public void setMovieTimeId(int movieTimeId) {
		this.movieTimeId = movieTimeId;
	}

	public int getHallId() {
		return hallId;
	}

	public void setMovieHallId(int hallId) {
		this.hallId = hallId;
	}
	
	public String timeChoose() {
		return time+"\t"+"金额:"+price+"元";
	}

	@Override
	public String toString() {
		return "\t"+hallId+"\t"+time;
	}
	
	public String toSingleAllTime() {
		return "影院Id:"+cinemaId+",影厅Id:"+hallId+",场次:"+time;
	}

	
}
