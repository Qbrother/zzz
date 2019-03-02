package dao;

import java.util.List;

import entity.MovieCinema;

public interface MovieCinemaDao {
	
	List<MovieCinema> getCinema();
	
	void insertCinema(MovieCinema moviecinema);
}
