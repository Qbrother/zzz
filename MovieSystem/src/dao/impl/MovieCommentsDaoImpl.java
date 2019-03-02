package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.MovieCommentsDao;
import entity.MovieComments;
import view.UserView;

public class MovieCommentsDaoImpl implements MovieCommentsDao {

	@Override
	public List<MovieComments> getALLComments() {
		Connection conn=Conn.getConn();
		List<MovieComments> MCALLlist=new ArrayList<MovieComments>();
		String sql="select * from comments";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				int CommentsId=res.getInt("CommentsId");
				String content=res.getString("content");
				int movieId=res.getInt("movieId");
				String time=res.getString("time");
				String userName=res.getString("userName");
				MCALLlist.add(new MovieComments(CommentsId,content,movieId,time,userName));
			}
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return MCALLlist;
	}

	@Override
	public List<MovieComments> getSingleMovieComments() {
		Connection conn=Conn.getConn();
		List<MovieComments> MCSinglelist=new ArrayList<MovieComments>();
		String sql="select * from comments where movieId='"+UserView.movieNumber+"'";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				int CommentsId=res.getInt("CommentsId");
				String content=res.getString("content");
				int movieId=res.getInt("movieId");
				String time=res.getString("time");
				String userName=res.getString("userName");
				MCSinglelist.add(new MovieComments(CommentsId,content,movieId,time,userName));
			}
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return MCSinglelist;
	}

	@Override
	public void insertComments(MovieComments moviecomments) {
		Connection conn=Conn.getConn();
		String sql="insert into comments(content,movieId,time,userName) values (?,?,?,?) ";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, moviecomments.getContent());
			ps.setInt(2, moviecomments.getMovieId());
			ps.setString(3, moviecomments.getTime());
			ps.setString(4, moviecomments.getUserName());
			
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<MovieComments> getSingleUserComments(String username) {
		Connection conn=Conn.getConn();
		List<MovieComments> SUCList=new ArrayList<MovieComments>();
		String sql="select * from comments where userName='"+username+"'";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				int CommentsId=res.getInt("CommentsId");
				String content=res.getString("content");
				int movieId=res.getInt("movieId");
				String time=res.getString("time");
				String userName=res.getString("userName");
				SUCList.add(new MovieComments(CommentsId,content,movieId,time,userName));
			}
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return SUCList;
	}
	
	

}
