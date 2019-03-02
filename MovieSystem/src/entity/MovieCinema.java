package entity;
/**
 * ��ӰԺ
 * id��ӰԺ������ַ������
 */
public class MovieCinema {
//	ӰԺ��
//	 (id��ӰԺ������ַ������)
//	1�����Ϻ�����㳡���Ϻ�
//	2����Ӱ���찲�Ź㳡������
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
		return  cinemaId+"."+cinemaName+"\n"+"��������:"+cinemaRegion+"\n"+"��ϸ��ַ:"+cinemaAdress;
	}
	
	public String movieList() {
		return cinemaId+"."+cinemaName;
	}
}
