package Test5.entity;

public class BigClass {
	private int Bid;
	private String bigname;
	public BigClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BigClass(String bigname) {
		super();
		this.bigname = bigname;
	}

	public BigClass(int bid, String bigname) {
		super();
		Bid = bid;
		this.bigname = bigname;
	}
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBigname() {
		return bigname;
	}
	public void setBigname(String bigname) {
		this.bigname = bigname;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Bid;
		result = prime * result + ((bigname == null) ? 0 : bigname.hashCode());
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
		BigClass other = (BigClass) obj;
		if (Bid != other.Bid)
			return false;
		if (bigname == null) {
			if (other.bigname != null)
				return false;
		} else if (!bigname.equals(other.bigname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BigClass [Bid=" + Bid + ", bigname=" + bigname + "]";
	}
	
	
}
