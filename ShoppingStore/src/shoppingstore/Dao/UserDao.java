package Test5.Dao;

import java.util.List;

import Test5.entity.Cart;
import Test5.entity.PegeBean;
import Test5.entity.User;
import Test5.exception.MyException;

public interface UserDao {
	public int insertUser(User user) throws MyException;
	
	public List<User> getAllUser() throws MyException;
	
	public boolean existUser(String username) throws MyException;
	
	public boolean isRightUser(String username,String password) throws MyException;
	
	public User getUser(String username) throws MyException;
	
	public int updateUser(String newUserName,String newPassword,String newPhone,int uid) throws MyException;
	
	public int updateUserName(String newUserName,int uid) throws MyException;
	
	public int updateUserPassword(String password,int uid) throws MyException;
		
	public int updateUserPhone(String phone,int uid) throws MyException;
	
	public int updateBalance(double charge,int uid) throws MyException;
	
	public PegeBean<User> getPageBeanUser(int pc, int ps) throws MyException;
	
	public int CountUser() throws MyException;
	
	public User getSingleUser(int uid) throws MyException;
	
	public int getSingleBalance(int uid) throws MyException;
}
