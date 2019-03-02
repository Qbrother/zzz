package Test5.entity;


public class UserOrder {
	private int Oid;
	private String ordernumber;
	private String bookName;
	private double dangPrice;
	private int count;
	private double price;
	private String address;
	private String username;
	private String state;
	private int Uid;
	public UserOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserOrder(String ordernumber, String bookName, double dangPrice, int count, double price, String address,
			String username, String state, int uid) {
		super();
		this.ordernumber = ordernumber;
		this.bookName = bookName;
		this.dangPrice = dangPrice;
		this.count = count;
		this.price = price;
		this.address = address;
		this.username = username;
		this.state = state;
		Uid = uid;
	}

	public UserOrder(int oid, String ordernumber, String bookName, double dangPrice, int count, double price,
			String address, String username, String state, int uid) {
		super();
		Oid = oid;
		this.ordernumber = ordernumber;
		this.bookName = bookName;
		this.dangPrice = dangPrice;
		this.count = count;
		this.price = price;
		this.address = address;
		this.username = username;
		this.state = state;
		Uid = uid;
	}
	public int getOid() {
		return Oid;
	}
	public void setOid(int oid) {
		Oid = oid;
	}
	public String getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getDangPrice() {
		return dangPrice;
	}
	public void setDangPrice(double dangPrice) {
		this.dangPrice = dangPrice;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Oid;
		result = prime * result + Uid;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + count;
		long temp;
		temp = Double.doubleToLongBits(dangPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((ordernumber == null) ? 0 : ordernumber.hashCode());
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		UserOrder other = (UserOrder) obj;
		if (Oid != other.Oid)
			return false;
		if (Uid != other.Uid)
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (count != other.count)
			return false;
		if (Double.doubleToLongBits(dangPrice) != Double.doubleToLongBits(other.dangPrice))
			return false;
		if (ordernumber == null) {
			if (other.ordernumber != null)
				return false;
		} else if (!ordernumber.equals(other.ordernumber))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserOrder [Oid=" + Oid + ", ordernumber=" + ordernumber + ", bookName=" + bookName + ", dangPrice="
				+ dangPrice + ", count=" + count + ", price=" + price + ", address=" + address + ", username="
				+ username + ", state=" + state + ", Uid=" + Uid + "]";
	}
	
	
	
}
