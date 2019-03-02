package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import dao.UserDao;
import entity.User;
import view.UserView;

public class UserDaoImpl implements UserDao {
	

	@Override
	public void insert(User user) {
		Connection conn =Conn.getConn();
		String sql="insert into user(userName,psd,sex,phone) values (?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPsd());
			ps.setString(3, user.getSex());
			ps.setLong(4, user.getPhone());
			
			ps.executeUpdate();//Ë¢ÐÂ
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public HashMap<String,String> getUser() {
		Connection conn =Conn.getConn();
		
		HashMap<String,String> userMap=new HashMap<String,String>();
		String sql="select userName,psd from user";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			
			while(res.next()) {
				String userName=res.getString("userName");
				String psd=res.getString("psd");
				userMap.put(userName, psd);
			}
					
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userMap;
	}

	@Override
	public User getSingleUser() {
		Connection conn=Conn.getConn();
		User user=new User();
		String sql="select * from user where userName='"+UserView.userMoneyName+"'";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				int userId=res.getInt("userId");
				String userName=res.getString("userName");
				String psd=res.getString("psd");
				String sex=res.getString("sex");
				long phone=res.getLong("phone");
				user=new User(userId,userName,psd,sex,phone);
			}
			
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void updateUserPsd(String psd) {
		Connection conn=Conn.getConn();
		String sql="update user set psd='"+psd+"' where userName='"+UserView.userMoneyName+"'";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
