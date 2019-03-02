package Test5.DaoImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import Test5.DButis.DButils;
import Test5.Dao.BigClassDao;
import Test5.entity.BigClass;
import Test5.entity.PegeBean;
import Test5.entity.User;
import Test5.exception.MyException;

public class BigClassDaoImpl implements BigClassDao {
	private QueryRunner qr;
	private Connection conn;

	@Override
	public int insertBigClass(BigClass bigclass) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="insert into bigclass(bigname) values (?)";
			int num = qr.update(conn, sql, bigclass.getBigname());
			return num;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public int updateBigClass(String oldbigname,String newbigname) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="update bigclass set bigname=? where bigname=?";
			int num=qr.update(conn, sql, newbigname,oldbigname);
			return num;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public List<BigClass> getAllBigClass() throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="select * from bigclass";
			List<BigClass> userAll = qr.query(conn, sql, new BeanListHandler<BigClass>(BigClass.class));
			return userAll;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PegeBean<BigClass> getPageBeanBigClass(int pc, int ps) throws MyException {
		try {
			conn=DButils.getConn();
			qr=new QueryRunner();
			PegeBean<BigClass> pageBean=new PegeBean<BigClass>();
			pageBean.setPc(pc);
			pageBean.setPs(ps);
			pageBean.setTr( CountBigClass());
			String sql="select * from bigclass limit "+(pc-1)*ps+","+ps;
			List<BigClass> ns=qr.query(conn, sql, new BeanListHandler<BigClass>(BigClass.class));
			pageBean.setBeanList(ns);
			return pageBean;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int CountBigClass() throws MyException {
		try {
			conn=DButils.getConn();
			qr=new QueryRunner();
			String sql="select count(bigname) from bigclass";
			Number cnt=qr.query(conn, sql,new ScalarHandler<Number>());
			return cnt.intValue();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public boolean existBigClass(String bigname) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="select 1 from bigclass where bigname=?";
			BigClass big = qr.query(conn, sql, new BeanHandler<BigClass>(BigClass.class),bigname);
			if(big!=null) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
