package Test5.service;

import java.util.List;

import Test5.entity.PegeBean;
import Test5.entity.User;
import Test5.exception.MyException;

public interface UserService {
	public int insertUser(User user) throws MyException;
	
	public List<User> getAllUser() throws MyException;
	
	public boolean existUser(String username) throws MyException;//用在注册，检测用户名是否存在
	
	public boolean isRightUser(String username,String password) throws MyException;//用于登录，检测用户名、密码是否正确

	public User getUser(String username) throws MyException;//获取单个用户信息
	
	public int updateUserName(String newUserName,int uid) throws MyException;//更新单个用户的用户名

	public int updateUserPassword(String password,int uid) throws MyException;//更新单个用户的密码
	
	public int updateUserPhone(String phone,int uid) throws MyException;//更新单个用户的电话号码
	
	public int updateBalance(double charge,int uid) throws MyException;//更新余额
	
	public PegeBean<User> getPageBeanUser(int pc, int ps) throws MyException;//获取用户信息（当前页）
	
	public int CountUser() throws MyException;//获取所有用户数量
	
	public int updateUser(String newUserName,String newPassword,String newPhone,int uid) throws MyException;//修改用户信息

	public User getSingleUser(int uid) throws MyException;//通过id获得单个用户信息
	
	public int getSingleBalance(int uid) throws MyException;//获得单个用户的余额
}
