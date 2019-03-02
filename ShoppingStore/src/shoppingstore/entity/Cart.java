package Test5.entity;

public class Cart {
	private int Cid;
	private String cover;
	private String bookName;
	private double marketPrice;
	private double dangPrice;
	private double price;
	private int amount;
	private int Uid;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int cid, String cover, String bookName, double marketPrice, double dangPrice, double price, int amount,
			int uid) {
		super();
		Cid = cid;
		this.cover = cover;
		this.bookName = bookName;
		this.marketPrice = marketPrice;
		this.dangPrice = dangPrice;
		this.price = price;
		this.amount = amount;
		Uid = uid;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}
	public double getDangPrice() {
		return dangPrice;
	}
	public void setDangPrice(double dangPrice) {
		this.dangPrice = dangPrice;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
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
		result = prime * result + Cid;
		result = prime * result + Uid;
		result = prime * result + amount;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + ((cover == null) ? 0 : cover.hashCode());
		long temp;
		temp = Double.doubleToLongBits(dangPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(marketPrice);
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
		Cart other = (Cart) obj;
		if (Cid != other.Cid)
			return false;
		if (Uid != other.Uid)
			return false;
		if (amount != other.amount)
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (cover == null) {
			if (other.cover != null)
				return false;
		} else if (!cover.equals(other.cover))
			return false;
		if (Double.doubleToLongBits(dangPrice) != Double.doubleToLongBits(other.dangPrice))
			return false;
		if (Double.doubleToLongBits(marketPrice) != Double.doubleToLongBits(other.marketPrice))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cart [Cid=" + Cid + ", cover=" + cover + ", bookName=" + bookName + ", marketPrice=" + marketPrice
				+ ", dangPrice=" + dangPrice + ", price=" + price + ", amount=" + amount + ", Uid=" + Uid + "]";
	}
	
	
}
