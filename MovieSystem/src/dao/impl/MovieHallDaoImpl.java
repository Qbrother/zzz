package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.MovieHallDao;
import entity.MovieHall;

public class MovieHallDaoImpl implements MovieHallDao {

	@Override
	public List<MovieHall> getMovieHall(int cenimaNumber) {
		Connection conn=Conn.getConn();
		List<MovieHall> movieHallList=new ArrayList<MovieHall>();
		String sql="select * from moviehall where cinemaId='"+cenimaNumber+"'";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				int movieHallId=res.getInt("movieHallId");
				int hallId=res.getInt("hallId");
				String movieHallName=res.getString("movieHallName");
				int cinemaId=res.getInt("cinemaId");
				movieHallList.add(new MovieHall(movieHallId,hallId,movieHallName,cinemaId));
			}
			conn.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movieHallList;
	}

	@Override
	public void insertMovieHall(MovieHall moviehall) {
		Connection conn=Conn.getConn();
		String sql="insert into moviehall(hallId,movieHallName,cinemaId) "
				+ "values (?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, moviehall.getHallId());
			ps.setString(2, moviehall.getMovieHallName());
			ps.setInt(3, moviehall.getCinemaId());
			
			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public List<MovieHall> getMovieHallAll() {
		Connection conn=Conn.getConn();
		List<MovieHall> movieHallList=new ArrayList<MovieHall>();
		String sql="select * from moviehall";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				int movieHallId=res.getInt("movieHallId");
				String movieHallName=res.getString("movieHallName");
				int cinemaId=res.getInt("cinemaId");
				movieHallList.add(new MovieHall(movieHallId,movieHallName,cinemaId));
			}
			conn.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movieHallList;
	}
}
