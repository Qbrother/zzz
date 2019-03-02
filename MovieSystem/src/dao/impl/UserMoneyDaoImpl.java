package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import dao.UserMoneyDao;
import entity.UserMoney;
import view.UserView;

public class UserMoneyDaoImpl implements UserMoneyDao {

	@Override
	public void insertUserMoney(UserMoney usermoney) {
		Connection conn=Conn.getConn();
		String sql="insert into usermoney(userName) values (?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, usermoney.getUserName());
			
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateMoney() {
		Connection conn=Conn.getConn();
		String sql="update usermoney set money='"+UserView.balance
				+"' where userName='"+UserView.userMoneyName+"'";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public HashMap<String, Float> getSingle() {
		Connection conn=Conn.getConn();
		HashMap<String, Float> userMoneyMap=new HashMap<String, Float>();
		String sql="select userName,money from usermoney";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				String userName=res.getString("userName");
				float money=res.getFloat("money");
				userMoneyMap.put(userName, money);
			}
			
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userMoneyMap;
	}

}
