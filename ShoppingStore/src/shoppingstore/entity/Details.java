package Test5.entity;

public class Details {
	private int Did;
	private String detailsName;
	private String detailsAddress;
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Details(int did, String detailsName, String detailsAddress) {
		super();
		Did = did;
		this.detailsName = detailsName;
		this.detailsAddress = detailsAddress;
	}
	public Details(String detailsName, String detailsAddress) {
		super();
		this.detailsName = detailsName;
		this.detailsAddress = detailsAddress;
	}
	public int getDid() {
		return Did;
	}
	public void setDid(int did) {
		Did = did;
	}
	public String getDetailsName() {
		return detailsName;
	}
	public void setDetailsName(String detailsName) {
		this.detailsName = detailsName;
	}
	public String getDetailsAddress() {
		return detailsAddress;
	}
	public void setDetailsAddress(String detailsAddress) {
		this.detailsAddress = detailsAddress;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Did;
		result = prime * result + ((detailsAddress == null) ? 0 : detailsAddress.hashCode());
		result = prime * result + ((detailsName == null) ? 0 : detailsName.hashCode());
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
		Details other = (Details) obj;
		if (Did != other.Did)
			return false;
		if (detailsAddress == null) {
			if (other.detailsAddress != null)
				return false;
		} else if (!detailsAddress.equals(other.detailsAddress))
			return false;
		if (detailsName == null) {
			if (other.detailsName != null)
				return false;
		} else if (!detailsName.equals(other.detailsName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Details [Did=" + Did + ", detailsName=" + detailsName + ", detailsAddress=" + detailsAddress + "]";
	}
	
	
}
