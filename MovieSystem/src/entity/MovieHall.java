package entity;

/**
 * Ӱ��
 * id��Ӱ�����룬Ӱ������ӰԺid
 */

public class MovieHall {
//	Ӱ����
//	 (id��Ӱ������,Ӱ������ӰԺid)
//	1��1��һ������1
//	2��2����������1
//	3��1��3dmax����1
//	4��2��4d����2
//	5��4����Ļ����2
//	6��5��vrӰ����2
	
	private int movieHallId;
	private int hallId;
	private String movieHallName;
	private int cinemaId;
	public MovieHall() {
		
	}
	public MovieHall(String movieHallName) {
		this.movieHallName = movieHallName;
	}
	
	public MovieHall(int movieHallId, int hallId, String movieHallName, int cinemaId) {
		this.movieHallId = movieHallId;
		this.hallId = hallId;
		this.movieHallName = movieHallName;
		this.cinemaId = cinemaId;
	}
	
	public MovieHall(int hallId, String movieHallName, int cinemaId) {
		this.hallId = hallId;
		this.movieHallName = movieHallName;
		this.cinemaId = cinemaId;
	}
	
	public MovieHall(String movieHallName, int cinemaId) {
		this.movieHallName = movieHallName;
		this.cinemaId = cinemaId;
	}

	public int getMovieHallId() {
		return movieHallId;
	}
	public void setMovieHallId(int hallId) {
		this.hallId = hallId;
	}
	public String getMovieHallName() {
		return movieHallName;
	}

	public void setMovieHallName(String movieHallName) {
		this.movieHallName = movieHallName;
	}
	
	public int getHallId() {
		return hallId;
	}
	public void setHallId(int hallId) {
		this.hallId = hallId;
	}
	public int getCinemaId() {
		return cinemaId;
	}
	public void setCinemaId(int cinemaId) {
		this.cinemaId = cinemaId;
	}
	@Override
	public String toString() {
		return hallId+"."+movieHallName;			
	}
	
	
	
	
	
	
	
	
}
