package Test5.DaoImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import Test5.DButis.DButils;
import Test5.Dao.CartDao;
import Test5.entity.Cart;
import Test5.entity.PegeBean;

public class CartDaoImpl implements CartDao {
	private QueryRunner qr;
	private Connection conn;

	@Override
	public List<Cart> getCartList(int uid) {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="select * from cart where Uid=?";
			List<Cart> cartList = qr.query(conn, sql, new BeanListHandler<Cart>(Cart.class),uid);
			return cartList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PegeBean<Cart> getPageBeanCart(int pc, int ps,int uid) {
		try {
			conn=DButils.getConn();
			qr=new QueryRunner();
			PegeBean<Cart> pageBean=new PegeBean<Cart>();
			pageBean.setPc(pc);
			pageBean.setPs(ps);
			pageBean.setTr(CountSingleCart(uid));
			String sql="select * from cart where Uid=? limit "+(pc-1)*ps+","+ps;
			List<Cart> ns=qr.query(conn, sql, new BeanListHandler<Cart>(Cart.class),uid);
			pageBean.setBeanList(ns);
			return pageBean;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int CountSingleCart(int uid) {
		try {
			conn=DButils.getConn();
			qr=new QueryRunner();
			String sql="select count(cover) from cart where Uid=?";
			Number cnt=qr.query(conn, sql,new ScalarHandler<Number>(),uid);
			return cnt.intValue();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public int insertCard(String cover, String bookName, double marketPrice, double dangPrice, double price,int uid) {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="insert into cart(cover,bookName,marketPrice,dangPrice,price,uid) values (?,?,?,?,?,?)";
			int num = qr.update(conn, sql,cover,bookName,marketPrice,dangPrice,price,uid);
			return num;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	

}
