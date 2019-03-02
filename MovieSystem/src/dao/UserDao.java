package dao;

import java.util.HashMap;

import entity.User;

/**
 *	用户的数据库的传入与获取
 */
public interface UserDao {
	void insert(User user);
	
	HashMap<String,String> getUser();
	
	User getSingleUser();
	
	void updateUserPsd(String psd);
	
}
