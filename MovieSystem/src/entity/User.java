package entity;

/**
 * �û�
 * id��name��password���Ա��ֻ�
 */

public class User {
//	�û���
//	��id��name��password���Ա��ֻ���......��
//	1��Ҧ����123���У�13088886666
//	2�����»���123456���У�13199886655
	
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
		return "���:"+userId+"\n"+
				"�˺�:"+userName+"\n"+
				"����:"+psd+"\n"+
				"�Ա�:"+sex+"\n"+
				"�绰����:"+phone;
	}
	
	
	
}
