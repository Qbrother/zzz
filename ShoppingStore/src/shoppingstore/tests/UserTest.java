package Test5.tests;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Test5.Dao.UserDao;
import Test5.DaoImpl.UserDaoImpl;
import Test5.entity.User;
import Test5.exception.MyException;

public class UserTest {
	private UserDao userDao;
	
	@Before
	public void userDaoImpl() {
		userDao=new UserDaoImpl();
	}
	
	@Test
	public void insertUser() throws MyException{
		int num = userDao.insertUser(new User("lili","zzz111","333333"));
		System.out.println("测试添加===="+num);
	}
	
	@Test
	public void getAllUser() throws MyException{
		List<User> userlist=userDao.getAllUser();
		System.out.println("测试查询所有user==="+userlist);
	}
	
	@Test
	public void existUser() throws MyException{
		boolean flag = userDao.existUser("jack");
		System.out.println("测试用户名是否存在==="+flag);
	}
	
	@Test
	public void isRightUser() throws MyException{
		boolean flag = userDao.isRightUser("jack","123456");
		System.out.println("测试是否为正确的用户==="+flag);
	}
	
	@Test
	public void getUser() throws MyException{
		User user = userDao.getUser("jack");
		System.out.println("测试拿到目标用户==="+user);
	}
	
	@Test
	public void updateUserName() throws MyException{
		int num=userDao.updateUserName("qqqqqq",4);
		System.out.println("测试修改用户名===="+num);
	}
	
	@Test
	public void updateBalance() throws MyException{
		int num=userDao.updateBalance(88.4, 5);
		System.out.println("测试修改用户名===="+num);
	}
	
	@Test
	public void getSingleBalance() throws MyException{
		int num=userDao.getSingleBalance(1);
		System.out.println("测试用户余额===="+num);
	}
	
}
