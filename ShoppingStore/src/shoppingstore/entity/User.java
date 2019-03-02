package Test5.entity;

public class User {
	private int Uid;
	private String username;
	private String password;
	private String phone;
	private double balance;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String phone) {
		super();
		this.username = username;
		this.password = password;
		this.phone = phone;
	}
	
	public User(String username, String password, String phone, double balance) {
		super();
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.balance = balance;
	}
	public User(int uid, String username, String password, String phone, double balance) {
		super();
		Uid = uid;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.balance = balance;
	}
	public User(int uid, String username, String password, String phone) {
		super();
		Uid = uid;
		this.username = username;
		this.password = password;
		this.phone = phone;
	}
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Uid;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
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
		User other = (User) obj;
		if (Uid != other.Uid)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
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
		return "User [Uid=" + Uid + ", username=" + username + ", password=" + password + ", phone=" + phone
				+ ", balance=" + balance + "]";
	}
	
}
