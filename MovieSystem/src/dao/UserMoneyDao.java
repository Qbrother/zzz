package dao;

import java.util.HashMap;

import entity.UserMoney;

public interface UserMoneyDao {
	void insertUserMoney(UserMoney usermoney);
	
	void updateMoney();
	
	HashMap<String, Float> getSingle();
}
