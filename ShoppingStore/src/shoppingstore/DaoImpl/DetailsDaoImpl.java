package Test5.DaoImpl;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import Test5.DButis.DButils;
import Test5.Dao.DetailsDao;
import Test5.entity.Details;
import Test5.exception.MyException;

public class DetailsDaoImpl implements DetailsDao {
	private QueryRunner qr;
	private Connection conn;

	@Override
	public Details getDetails(String queryname) throws MyException {
		try {
			qr=new QueryRunner();
			conn=DButils.getConn();
			String sql="select detailsAddress from details where detailsName=?";
			Details detail = qr.query(conn, sql, new BeanHandler<Details>(Details.class),queryname);
			return detail;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
