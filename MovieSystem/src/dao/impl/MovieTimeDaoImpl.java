package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.MovieTimeDao;
import entity.MovieTime;

public class MovieTimeDaoImpl implements MovieTimeDao {

	@Override
	public void insertMovieTime(MovieTime movietime) {
		Connection conn=Conn.getConn();
		String sql="insert into movietime(movieId,time,price,cinemaId,hallId) "
				+ "values (?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, movietime.getMovieId());
			ps.setString(2, movietime.getTime());
			ps.setFloat(3, movietime.getPrice());
			ps.setInt(4, movietime.getCinemaId());
			ps.setInt(5, movietime.getHallId());
			
			ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<MovieTime> getSingleTime(int movieNumber,int cinemaNumber,int hallNumber) {
		Connection conn=Conn.getConn();
		List<MovieTime> movieTimeList=new ArrayList<MovieTime>();
		String sql="select * from movietime where movieId='"+movieNumber+
				"' and cinemaId='"+cinemaNumber+"' and hallId='"+hallNumber+"'";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				int movieTimeId=res.getInt("movieTimeId");
				int movieId=res.getInt("movieId");
				String time=res.getString("time");
				float price=res.getFloat("price");
				int cinemaId=res.getInt("cinemaId");
				int hallId=res.getInt("hallId");
				movieTimeList.add(new MovieTime(movieTimeId,movieId,time,price,cinemaId,hallId));
			}
			conn.close();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movieTimeList;
	}

	@Override
	public List<MovieTime> getSingleAll(int cId, int mhId) {
		Connection conn=Conn.getConn();
		List<MovieTime> movieTimeAllList=new ArrayList<MovieTime>();
		String sql="select * from movietime where cinemaId='"+cId+"' and hallId='"+mhId+"'";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				String time=res.getString("time");
				int cinemaId=res.getInt("cinemaId");
				int hallId=res.getInt("hallId");
				movieTimeAllList.add(new MovieTime(time,cinemaId,hallId));
			}
			conn.close();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movieTimeAllList;
	}


}
