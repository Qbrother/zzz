package Test5.serviceImpl;

import java.util.List;

import Test5.Dao.UserDao;
import Test5.DaoImpl.UserDaoImpl;
import Test5.entity.PegeBean;
import Test5.entity.User;
import Test5.exception.MyException;
import Test5.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao=new UserDaoImpl();

	@Override
	public int insertUser(User user) throws MyException {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}

	@Override
	public List<User> getAllUser() throws MyException {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}

	@Override
	public boolean existUser(String username) throws MyException {
		// TODO Auto-generated method stub
		return userDao.existUser(username);
	}

	@Override
	public boolean isRightUser(String username, String password) throws MyException {
		// TODO Auto-generated method stub
		return userDao.isRightUser(username, password);
	}

	@Override
	public User getUser(String username) throws MyException {
		// TODO Auto-generated method stub
		return userDao.getUser(username);
	}

	@Override
	public int updateUserName(String newUserName, int uid) throws MyException {
		// TODO Auto-generated method stub
		return userDao.updateUserName(newUserName, uid);
	}

	@Override
	public int updateUserPassword(String password, int uid) throws MyException {
		// TODO Auto-generated method stub
		return userDao.updateUserPassword(password, uid);
	}

	@Override
	public int updateUserPhone(String phone, int uid) throws MyException {
		// TODO Auto-generated method stub
		return userDao.updateUserPhone(phone, uid);
	}

	@Override
	public int updateBalance(double charge, int uid) throws MyException {
		// TODO Auto-generated method stub
		return userDao.updateBalance(charge, uid);
	}

	@Override
	public PegeBean<User> getPageBeanUser(int pc, int ps) throws MyException {
		// TODO Auto-generated method stub
		return userDao.getPageBeanUser(pc, ps);
	}

	@Override
	public int CountUser() throws MyException {
		// TODO Auto-generated method stub
		return userDao.CountUser();
	}

	@Override
	public int updateUser(String newUserName, String newPassword, String newPhone, int uid) throws MyException {
		// TODO Auto-generated method stub
		return userDao.updateUser(newUserName, newPassword, newPhone, uid);
	}

	@Override
	public User getSingleUser(int uid) throws MyException {
		// TODO Auto-generated method stub
		return userDao.getSingleUser(uid);
	}

	@Override
	public int getSingleBalance(int uid) throws MyException {
		// TODO Auto-generated method stub
		return userDao.getSingleBalance(uid);
	}



}
