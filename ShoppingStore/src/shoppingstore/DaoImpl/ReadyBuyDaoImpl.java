package Test5.DaoImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import Test5.DButis.DButils;
import Test5.Dao.ReadyBuyDao;
import Test5.entity.ReadyBuy;
import Test5.entity.User;
import Test5.exception.MyException;

public class ReadyBuyDaoImpl implements ReadyBuyDao {
	private QueryRunner qr;
	private Connection conn;

	@Override
	public int insertReadyBuy(String bookName, double dangPrice, int count, double price, int uid) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="insert into readybuy(bookName,dangPrice,count,price,uid) values (?,?,?,?,?)";
			int num = qr.update(conn, sql,bookName,dangPrice,count,price,uid);
			return num;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public List<ReadyBuy> getSingleReadyBuy(int uid) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="select * from readybuy where Uid=?";
			List<ReadyBuy> singleAll = qr.query(conn, sql, new BeanListHandler<ReadyBuy>(ReadyBuy.class),uid);
			return singleAll;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
