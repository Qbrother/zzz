package Test5.entity;

public class Goods {
	private int Gid;
	private String bigname;
	private String smallname;
	private String bookname;
	private String dangPrice;
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(int gid, String bigname, String smallname, String bookname, String dangPrice) {
		super();
		Gid = gid;
		this.bigname = bigname;
		this.smallname = smallname;
		this.bookname = bookname;
		this.dangPrice = dangPrice;
	}
	public Goods(String bigname, String smallname, String bookname, String dangPrice) {
		super();
		this.bigname = bigname;
		this.smallname = smallname;
		this.bookname = bookname;
		this.dangPrice = dangPrice;
	}
	public int getGid() {
		return Gid;
	}
	public void setGid(int gid) {
		Gid = gid;
	}
	public String getBigname() {
		return bigname;
	}
	public void setBigname(String bigname) {
		this.bigname = bigname;
	}
	public String getSmallname() {
		return smallname;
	}
	public void setSmallname(String smallname) {
		this.smallname = smallname;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getDangPrice() {
		return dangPrice;
	}
	public void setDangPrice(String dangPrice) {
		this.dangPrice = dangPrice;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Gid;
		result = prime * result + ((bigname == null) ? 0 : bigname.hashCode());
		result = prime * result + ((bookname == null) ? 0 : bookname.hashCode());
		result = prime * result + ((dangPrice == null) ? 0 : dangPrice.hashCode());
		result = prime * result + ((smallname == null) ? 0 : smallname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		if (Gid != other.Gid)
			return false;
		if (bigname == null) {
			if (other.bigname != null)
				return false;
		} else if (!bigname.equals(other.bigname))
			return false;
		if (bookname == null) {
			if (other.bookname != null)
				return false;
		} else if (!bookname.equals(other.bookname))
			return false;
		if (dangPrice == null) {
			if (other.dangPrice != null)
				return false;
		} else if (!dangPrice.equals(other.dangPrice))
			return false;
		if (smallname == null) {
			if (other.smallname != null)
				return false;
		} else if (!smallname.equals(other.smallname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Goods [Gid=" + Gid + ", bigname=" + bigname + ", smallname=" + smallname + ", bookname=" + bookname
				+ ", dangPrice=" + dangPrice + "]";
	}
	
	
	
}
