package entity;
/**
 * 电影院
 * id，影院名，地址，地区
 */
public class MovieCinema {
//	影院表，
//	 (id，影院名，地址，地区)
//	1，万达，上海人民广场，上海
//	2，中影，天安门广场，北京
	private int cinemaId;
	private String cinemaName;
	private String cinemaAdress;
	private String cinemaRegion;
	
	public MovieCinema() {
		
	}

	public MovieCinema(int cinemaId, String cinemaName, String cinemaAdress, String cinemaRegion) {
		this.cinemaId = cinemaId;
		this.cinemaName = cinemaName;
		this.cinemaAdress = cinemaAdress;
		this.cinemaRegion = cinemaRegion;
	}
	
	public MovieCinema( String cinemaName, String cinemaAdress, String cinemaRegion) {
		this.cinemaName = cinemaName;
		this.cinemaAdress = cinemaAdress;
		this.cinemaRegion = cinemaRegion;
	}

	public int getCinemaId() {
		return cinemaId;
	}

	public void setCinemaId(int cinemaId) {
		this.cinemaId = cinemaId;
	}

	public String getCinemaName() {
		return cinemaName;
	}

	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}

	public String getCinemaAdress() {
		return cinemaAdress;
	}

	public void setCinemaAdress(String cinemaAdress) {
		this.cinemaAdress = cinemaAdress;
	}

	public String getCinemaRegion() {
		return cinemaRegion;
	}

	public void setCinemaRegion(String cinemaCity) {
		this.cinemaRegion = cinemaCity;
	}

	@Override
	public String toString() {
		return  cinemaId+"."+cinemaName+"\n"+"所属地区:"+cinemaRegion+"\n"+"详细地址:"+cinemaAdress;
	}
	
	public String movieList() {
		return cinemaId+"."+cinemaName;
	}
}
