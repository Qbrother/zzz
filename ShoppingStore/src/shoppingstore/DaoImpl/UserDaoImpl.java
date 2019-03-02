package Test5.DaoImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import Test5.DButis.DButils;
import Test5.Dao.UserDao;
import Test5.entity.Cart;
import Test5.entity.PegeBean;
import Test5.entity.User;
import Test5.exception.MyException;

public class UserDaoImpl implements UserDao {
	private QueryRunner qr;
	private Connection conn;

	@Override
	public int insertUser(User user) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="insert into user(username,password,phone) values (?,?,?)";
			int num = qr.update(conn, sql, user.getUsername(),user.getPassword(),user.getPhone());
			return num;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public List<User> getAllUser() throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="select * from user";
			List<User> userAll = qr.query(conn, sql, new BeanListHandler<User>(User.class));
			return userAll;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean existUser(String username) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="select 1 from user where username=?";
			User user = qr.query(conn, sql, new BeanHandler<User>(User.class),username);
			if(user!=null) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean isRightUser(String username, String password) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="select 1 from user where username=? and password=?";
			User user = qr.query(conn, sql, new BeanHandler<User>(User.class),username,password);
			if(user!=null) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public User getUser(String username) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="select Uid,username,password,phone,balance from user where username=?";
			User user = qr.query(conn, sql, new BeanHandler<User>(User.class),username);
				return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int updateUserName(String newUserName,int uid) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="update user set username=? where Uid=?";
			int num=qr.update(conn, sql, newUserName,uid);
			return num;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public int updateUserPassword(String password,int uid) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="update user set password=? where Uid=?";
			int num=qr.update(conn, sql, password,uid);
			return num;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public int updateUserPhone(String phone,int uid) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="update user set phone=? where Uid=?";
			int num=qr.update(conn, sql, phone,uid);
			return num;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public int updateBalance(double charge,int uid) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="update user set balance=? where Uid=?";
			int num=qr.update(conn, sql, charge,uid);
			return num;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public PegeBean<User> getPageBeanUser(int pc, int ps) throws MyException {
		try {
			conn=DButils.getConn();
			qr=new QueryRunner();
			PegeBean<User> pageBean=new PegeBean<User>();
			pageBean.setPc(pc);
			pageBean.setPs(ps);
			pageBean.setTr(CountUser());
			String sql="select * from user limit "+(pc-1)*ps+","+ps;
			List<User> ns=qr.query(conn, sql, new BeanListHandler<User>(User.class));
			pageBean.setBeanList(ns);
			return pageBean;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int CountUser() throws MyException {
		try {
			conn=DButils.getConn();
			qr=new QueryRunner();
			String sql="select count(username) from user";
			Number cnt=qr.query(conn, sql,new ScalarHandler<Number>());
			return cnt.intValue();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public int updateUser(String newUserName, String newPassword, String newPhone, int uid) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="update user set username=? and password=? and phone=? where Uid=?";
			int num=qr.update(conn, sql, newUserName,newPassword,newPhone,uid);
			return num;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public User getSingleUser(int uid) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="select Uid,username,password,phone,balance from user where Uid=?";
			User user = qr.query(conn, sql, new BeanHandler<User>(User.class),uid);
				return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int getSingleBalance(int uid) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="select balance from user where Uid=?";
			int num=qr.update(conn, sql,uid);
			return num;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

}
