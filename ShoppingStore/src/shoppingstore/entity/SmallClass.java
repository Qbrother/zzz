package Test5.entity;

public class SmallClass {
	private int Sid;
	private String bigname;
	private String smallname;
	public SmallClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SmallClass(String bigname, String smallname) {
		super();
		this.bigname = bigname;
		this.smallname = smallname;
	}
	public SmallClass(int sid, String bigname, String smallname) {
		super();
		Sid = sid;
		this.bigname = bigname;
		this.smallname = smallname;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Sid;
		result = prime * result + ((bigname == null) ? 0 : bigname.hashCode());
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
		SmallClass other = (SmallClass) obj;
		if (Sid != other.Sid)
			return false;
		if (bigname == null) {
			if (other.bigname != null)
				return false;
		} else if (!bigname.equals(other.bigname))
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
		return "SmallClass [Sid=" + Sid + ", bigname=" + bigname + ", smallname=" + smallname + "]";
	}
	
}
