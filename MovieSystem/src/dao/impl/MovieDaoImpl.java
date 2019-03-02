package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.MovieDao;
import entity.Movie;
import view.UserView;

public class MovieDaoImpl implements MovieDao {
	@Override
	public void updateFocus() {
		Connection conn=Conn.getConn();
		String sql="update movie set focus='"+ UserView.newFocus+"' where movieId = '"+UserView.movieNumber+"'";
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
	public void insert(Movie movie) {
		Connection conn=Conn.getConn();
		String sql="insert into movie(movieName,actor,timeLength,type,releaseTime,introduction) "
				+ "values (?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, movie.getMovieName());
			ps.setString(2, movie.getActor());
			ps.setString(3, movie.getTimeLength());
			ps.setString(4, movie.getType());
			ps.setString(5, movie.getReleaseTime());
			ps.setString(6, movie.getIntroduction());
			
			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Movie> getMovieInformation() {
		Connection conn=Conn.getConn();
		String sql="select * from movie";
		List<Movie> movieList=new ArrayList<Movie>();
		Movie movie=null;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				int movieId=res.getInt("movieId");
				String movieName=res.getString("movieName");
				String actor=res.getString("actor"); 
				String timeLength=res.getString("timeLength"); 
				String type=res.getString("type");
				String releaseTime=res.getString("releaseTime");
				float score=res.getFloat("score");
				String introduction=res.getString("introduction");
				int focus=res.getInt("focus");
				movie=new Movie(movieId,movieName,actor,timeLength,type,releaseTime,score,introduction,focus);
				movieList.add(movie);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movieList;
	}



}
