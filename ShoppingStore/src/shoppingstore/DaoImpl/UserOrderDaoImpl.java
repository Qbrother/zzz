package Test5.DaoImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import Test5.DButis.DButils;
import Test5.Dao.UserOrderDao;
import Test5.entity.Cart;
import Test5.entity.PegeBean;
import Test5.entity.User;
import Test5.entity.UserOrder;
import Test5.exception.MyException;

public class UserOrderDaoImpl implements UserOrderDao {
	private QueryRunner qr;
	private Connection conn;
	
	@Override
	public int insertUserOrder(UserOrder userOrder) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="insert into userorder(ordernumber,bookName,dangPrice,count,price,address,username,state,uid) "
					+ "values (?,?,?,?,?,?,?,?,?)";
			int num = qr.update(conn, sql, userOrder.getOrdernumber(),userOrder.getBookName(),
					userOrder.getDangPrice(),userOrder.getCount(),userOrder.getPrice(),userOrder.getAddress(),
					userOrder.getUsername(),userOrder.getState(),userOrder.getUid());
			return num;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public List<UserOrder> getSingleUserOrder(int uid) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="select * from userorder where Uid=?";
			List<UserOrder> userorderAll = qr.query(conn, sql, new BeanListHandler<UserOrder>(UserOrder.class),uid);
			return userorderAll;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PegeBean<UserOrder> getPageBeanUserOrder(int pc, int ps, int uid) throws MyException {
		try {
			conn=DButils.getConn();
			qr=new QueryRunner();
			PegeBean<UserOrder> pageBean=new PegeBean<UserOrder>();
			pageBean.setPc(pc);
			pageBean.setPs(ps);
			pageBean.setTr(CountSingleOrder(uid));
			String sql="select * from userorder where Uid=? limit "+(pc-1)*ps+","+ps;
			List<UserOrder> ns=qr.query(conn, sql, new BeanListHandler<UserOrder>(UserOrder.class),uid);
			pageBean.setBeanList(ns);
			return pageBean;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int CountSingleOrder(int uid) throws MyException {
		try {
			conn=DButils.getConn();
			qr=new QueryRunner();
			String sql="select count(ordernumber) from userorder where Uid=?";
			Number cnt=qr.query(conn, sql,new ScalarHandler<Number>(),uid);
			return cnt.intValue();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public PegeBean<UserOrder> getPageBeanAllOrder(int pc, int ps) throws MyException {
		try {
			conn=DButils.getConn();
			qr=new QueryRunner();
			PegeBean<UserOrder> pageBean=new PegeBean<UserOrder>();
			pageBean.setPc(pc);
			pageBean.setPs(ps);
			pageBean.setTr(CountAllOrder());
			String sql="select * from userorder limit "+(pc-1)*ps+","+ps;
			List<UserOrder> ns=qr.query(conn, sql, new BeanListHandler<UserOrder>(UserOrder.class));
			pageBean.setBeanList(ns);
			return pageBean;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int CountAllOrder() throws MyException {
		try {
			conn=DButils.getConn();
			qr=new QueryRunner();
			String sql="select count(ordernumber) from userorder";
			Number cnt=qr.query(conn, sql,new ScalarHandler<Number>());
			return cnt.intValue();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

}
