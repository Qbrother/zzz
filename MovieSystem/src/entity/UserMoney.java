package entity;

public class UserMoney {
	private int userId;
	private String userName;
	private float money;
	
	public UserMoney() {
		
	}
	
	public UserMoney(String userName) {
		this.userName = userName;
	}
	
	public UserMoney(int userId,  float money) {
		this.userId = userId;
		this.money = money;
	}
	
	public UserMoney(String userName, float money) {
		this.userName = userName;
		this.money = money;
	}


	public UserMoney(int userId, String userName, float money) {
		this.userId = userId;
		this.userName = userName;
		this.money = money;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "UserMoney [userId=" + userId + ", userName=" + userName + ", money=" + money + "]";
	}
	
	
	
}
