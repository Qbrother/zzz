package dao;

import java.util.List;

import entity.MovieComments;

public interface MovieCommentsDao {
	
	List<MovieComments> getALLComments();
	
	List<MovieComments> getSingleMovieComments();
	
	List<MovieComments> getSingleUserComments(String username);
	
	void insertComments(MovieComments moviecomments);
}
