package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.MovieTicketDao;
import entity.MovieTicket;

public class MovieTicketDaoImpl implements MovieTicketDao {
	

	@Override
	public List<MovieTicket> getMovieTicket(String user_Name) {
		Connection conn=Conn.getConn();
		List<MovieTicket> movieTicketList=new ArrayList<MovieTicket>();
		String sql="select movieName,movieId,cinemaName,movieHallName,time,price from movieticket "
				+ "where userName='"+user_Name+"'";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				int movieId=res.getInt("movieId");
				String movieName=res.getString("movieName");
				String cinemaName=res.getString("cinemaName");
				String movieHallName=res.getString("movieHallName");
				String time=res.getString("time");
				float price=res.getFloat("price");
				movieTicketList.add(new MovieTicket(movieId,movieName,cinemaName,movieHallName,time,price));
			}
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movieTicketList;
	}


	@Override
	public void insertMovieTicket(MovieTicket movieticket) {
		Connection conn=Conn.getConn();
		String sql="insert into movieticket(movieId,userName,cinemaId,hallId,movieName," + 
				"cinemaName,movieHallName,time,price) values (?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1,movieticket.getMovieId());
			ps.setString(2,movieticket.getUserName());
			ps.setInt(3,movieticket.getCinemaId());
			ps.setInt(4,movieticket.getHallId());
			ps.setString(5,movieticket.getMovieName());
			ps.setString(6,movieticket.getCinemaName());
			ps.setString(7,movieticket.getMovieHallName());
			ps.setString(8,movieticket.getTime());
			ps.setFloat(9,movieticket.getPrice());
			
			ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
}
