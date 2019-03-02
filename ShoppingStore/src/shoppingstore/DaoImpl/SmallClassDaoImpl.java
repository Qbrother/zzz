package Test5.DaoImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import Test5.DButis.DButils;
import Test5.Dao.SmallClassDao;
import Test5.entity.BigClass;
import Test5.entity.PegeBean;
import Test5.entity.SmallClass;
import Test5.entity.User;
import Test5.exception.MyException;

public class SmallClassDaoImpl implements SmallClassDao {
	private QueryRunner qr;
	private Connection conn;
	
	@Override
	public int insertSmallClass(String bigname, String smallname) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="insert into smallclass(bigname,smallname) values (?,?)";
			int num = qr.update(conn, sql,bigname,smallname);
			return num;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public int updateSmallClass(String bigname, String oldsmallname, String newsamllname) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="update smallclass set smallname=? where bigname=? and smallname=?";
			int num=qr.update(conn, sql, newsamllname,bigname,oldsmallname);
			return num;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public List<SmallClass> getAllSmallClass() throws MyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PegeBean<SmallClass> getPageBeanSmallClass(int pc, int ps) throws MyException {
		try {
			conn=DButils.getConn();
			qr=new QueryRunner();
			PegeBean<SmallClass> pageBean=new PegeBean<SmallClass>();
			pageBean.setPc(pc);
			pageBean.setPs(ps);
			pageBean.setTr( CountSmallClass());
			String sql="select * from smallclass limit "+(pc-1)*ps+","+ps;
			List<SmallClass> ns=qr.query(conn, sql, new BeanListHandler<SmallClass>(SmallClass.class));
			pageBean.setBeanList(ns);
			return pageBean;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int CountSmallClass() throws MyException {
		try {
			conn=DButils.getConn();
			qr=new QueryRunner();
			String sql="select count(smallname) from smallclass";
			Number cnt=qr.query(conn, sql,new ScalarHandler<Number>());
			return cnt.intValue();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public boolean existSmallClass(String bigname, String smallname) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="select 1 from smallclass where bigname=? and smallname=?";
			SmallClass small = qr.query(conn, sql, new BeanHandler<SmallClass>(SmallClass.class),bigname,smallname);
			if(small!=null) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<SmallClass> getSingleSmallClass(String bigname) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="select * from smallclass where bigname=?";
			List<SmallClass> singleAll = qr.query(conn, sql, new BeanListHandler<SmallClass>(SmallClass.class),bigname);
			return singleAll;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
