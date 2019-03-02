package entity;

/**
 * 用户
 * id，name，password，性别，手机
 */

public class User {
//	用户表，
//	（id，name，password，性别，手机，......）
//	1，姚明，123，男，13088886666
//	2，刘德华，123456，男，13199886655
	
	private int userId;
	private String userName;
	private String psd;
	private String sex;
	private long phone;
	
	public User() {
		
	}
	
	public User(String userName, String psd, String sex, long phone) {
		this.userName = userName;
		this.psd = psd;
		this.sex = sex;
		this.phone = phone;
	}

	public User(int userId, String userName, String psd, String sex, long phone) {
		this.userId = userId;
		this.userName = userName;
		this.psd = psd;
		this.sex = sex;
		this.phone = phone;
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

	public String getPsd() {
		return psd;
	}

	public void setPsd(String psd) {
		this.psd = psd;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "编号:"+userId+"\n"+
				"账号:"+userName+"\n"+
				"密码:"+psd+"\n"+
				"性别:"+sex+"\n"+
				"电话号码:"+phone;
	}
	
	
	
}
