package dao;

import java.util.List;

import entity.Movie;

public interface MovieDao {
	void updateFocus();
	
	void insert(Movie movie);
	
	List<Movie> getMovieInformation();
}
