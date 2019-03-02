package Test5.DaoImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import Test5.DButis.DButils;
import Test5.Dao.GoodsDao;
import Test5.entity.Goods;
import Test5.entity.PegeBean;
import Test5.exception.MyException;

public class GoodsDaoImpl implements GoodsDao {
	private QueryRunner qr;
	private Connection conn;

	@Override
	public int insertGoods(String bigname, String smallname, String bookname,double price) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="insert into goods(bigname,smallname,bookname,dangPrice) values (?,?,?,?)";
			int num = qr.update(conn, sql,bigname,smallname,bookname,price);
			return num;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public int updateGoods(String bigname, String smallname,String oldbookname, String newbookname) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="update goods set bookname=? where bigname=? and smallname=? and bookname=?";
			int num=qr.update(conn, sql, newbookname,bigname,smallname,oldbookname);
			return num;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public List<Goods> getAllGoods() throws MyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PegeBean<Goods> getPageBeanGoods(int pc, int ps) throws MyException {
		try {
			conn=DButils.getConn();
			qr=new QueryRunner();
			PegeBean<Goods> pageBean=new PegeBean<Goods>();
			pageBean.setPc(pc);
			pageBean.setPs(ps);
			pageBean.setTr(CountGoods());
			String sql="select * from goods limit "+(pc-1)*ps+","+ps;
			List<Goods> ns=qr.query(conn, sql, new BeanListHandler<Goods>(Goods.class));
			pageBean.setBeanList(ns);
			return pageBean;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int CountGoods() throws MyException {
		try {
			conn=DButils.getConn();
			qr=new QueryRunner();
			String sql="select count(bookname) from goods";
			Number cnt=qr.query(conn, sql,new ScalarHandler<Number>());
			return cnt.intValue();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public boolean existGoods(String bigname, String smallname, String bookname) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="select 1 from goods where bigname=? and smallname=? and bookname=?";
			Goods goods = qr.query(conn, sql, new BeanHandler<Goods>(Goods.class),bigname,smallname,bookname);
			if(goods!=null) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
