package entity;

public class OrderManage {
	//订单管理
	//订单序号，用户名，电影id，影院id，影厅id，价格，支付状态[1:支付，0:未支付]
	
	private int orderId;
	private String userName;
	private int movieId;
	private int cinemaId;
	private int movieHallId;
	private float price;
	private int payStatus;
	
	public OrderManage() {

	}
	
	public OrderManage( String userName, int movieId, int cinemaId, int movieHallId, float price) {
		this.userName = userName;
		this.movieId = movieId;
		this.cinemaId = cinemaId;
		this.movieHallId = movieHallId;
		this.price = price;
	}

	
	public OrderManage( String userName, int movieId, int cinemaId, int movieHallId, float price, int payStatus) {
		this.userName = userName;
		this.movieId = movieId;
		this.cinemaId = cinemaId;
		this.movieHallId = movieHallId;
		this.price = price;
		this.payStatus = payStatus;
	}

	public OrderManage(int orderId, String userName, int movieId, int cinemaId, int movieHallId, float price, int payStatus) {
		this.orderId = orderId;
		this.userName = userName;
		this.movieId = movieId;
		this.cinemaId = cinemaId;
		this.movieHallId = movieHallId;
		this.price = price;
		this.payStatus = payStatus;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getCinemaId() {
		return cinemaId;
	}

	public void setCinemaId(int cinemaId) {
		this.cinemaId = cinemaId;
	}

	public int getMovieHallId() {
		return movieHallId;
	}

	public void setMovieHallId(int movieHallId) {
		this.movieHallId = movieHallId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(int payStatus) {
		this.payStatus = payStatus;
	}

	@Override
	public String toString() {
		return orderId+"\t"+userName+"\t"+movieId+"\t"+cinemaId+"\t"+movieHallId+"\t"+price+"\t"+payStatus;
	}
	
	
	
}
