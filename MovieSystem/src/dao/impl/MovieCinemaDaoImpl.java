package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.MovieCinemaDao;
import entity.MovieCinema;

public class MovieCinemaDaoImpl implements MovieCinemaDao {

	@Override
	public List<MovieCinema> getCinema() {
		Connection conn=Conn.getConn();
		List<MovieCinema> movieCinemaList=new ArrayList<MovieCinema>();
		String sql="select * from cinema";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				int cinemaId=res.getInt("cinemaId");
				String cinemaName=res.getString("cinemaName");
				String cinemaAdress=res.getString("cinemaAdress");
				String cinemaRegion=res.getString("cinemaRegion");
				movieCinemaList.add(new MovieCinema(cinemaId,cinemaName,cinemaAdress,cinemaRegion));
			}
			conn.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movieCinemaList;
	}

	@Override
	public void insertCinema(MovieCinema moviecinema) {
		Connection conn=Conn.getConn();
		String sql="insert into cinema(cinemaName,cinemaAdress,cinemaRegion) "
				+ "values (?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, moviecinema.getCinemaName());
			ps.setString(2, moviecinema.getCinemaAdress());
			ps.setString(3, moviecinema.getCinemaRegion());
			
			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
