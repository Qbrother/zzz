package dao;

import java.util.HashMap;

import entity.User;

/**
 *	�û������ݿ�Ĵ������ȡ
 */
public interface UserDao {
	void insert(User user);
	
	HashMap<String,String> getUser();
	
	User getSingleUser();
	
	void updateUserPsd(String psd);
	
}
