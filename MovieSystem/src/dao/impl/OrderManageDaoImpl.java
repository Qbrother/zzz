package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.OrderManageDao;
import entity.OrderManage;

public class OrderManageDaoImpl implements OrderManageDao {

	@Override
	public void insertOrder(OrderManage order) {
		Connection conn=Conn.getConn();
		String sql="insert into ordermanage(userName,movieId,cinemaId,movieHallId,price,payStatus) "
				+ "values (?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, order.getUserName());
			ps.setInt(2, order.getMovieId());
			ps.setInt(3, order.getCinemaId());
			ps.setInt(4, order.getMovieHallId());
			ps.setFloat(5, order.getPrice());
			ps.setInt(6, order.getPayStatus());
			
			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<OrderManage> getOrder() {
		Connection conn=Conn.getConn();
		List<OrderManage> orderManageList=new ArrayList<OrderManage>();
		String sql="select * from ordermanage";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				int orderId=res.getInt("orderId");
				String userName=res.getString("userName");
				int movieId=res.getInt("movieId");
				int cinemaId=res.getInt("cinemaId");
				int movieHallId=res.getInt("movieHallId");
				float price=res.getFloat("price");
				int payStatus=res.getInt("payStatus");
				
				orderManageList.add(new OrderManage(orderId,userName,movieId,cinemaId,movieHallId,price,payStatus));
			}
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return orderManageList;
	}

	@Override
	public void insertBuyOrder(OrderManage order) {
		Connection conn=Conn.getConn();
		String sql="insert into ordermanage(userName,movieId,cinemaId,movieHallId,price,payStatus) "
				+ "values (?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, order.getUserName());
			ps.setInt(2, order.getMovieId());
			ps.setInt(3, order.getCinemaId());
			ps.setInt(4, order.getMovieHallId());
			ps.setFloat(5, order.getPrice());
			ps.setInt(6, order.getPayStatus());
			
			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
