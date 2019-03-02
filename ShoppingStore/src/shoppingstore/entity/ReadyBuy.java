package Test5.entity;

public class ReadyBuy{
	private int Rid;
	private String bookName;
	private double dangPrice;
	private int count;
	private double price;
	private int Uid;
	public ReadyBuy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReadyBuy(String bookName, double dangPrice, int count, double price, int uid) {
		super();
		this.bookName = bookName;
		this.dangPrice = dangPrice;
		this.count = count;
		this.price = price;
		Uid = uid;
	}
	public ReadyBuy(int rid, String bookName, double dangPrice, int count, double price, int uid) {
		super();
		Rid = rid;
		this.bookName = bookName;
		this.dangPrice = dangPrice;
		this.count = count;
		this.price = price;
		Uid = uid;
	}
	public int getRid() {
		return Rid;
	}
	public void setRid(int rid) {
		Rid = rid;
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
		result = prime * result + Rid;
		result = prime * result + Uid;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + count;
		long temp;
		temp = Double.doubleToLongBits(dangPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		ReadyBuy other = (ReadyBuy) obj;
		if (Rid != other.Rid)
			return false;
		if (Uid != other.Uid)
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
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ReadyBuy [Rid=" + Rid + ", bookName=" + bookName + ", dangPrice=" + dangPrice + ", count=" + count
				+ ", price=" + price + ", Uid=" + Uid + "]";
	}
	
}
