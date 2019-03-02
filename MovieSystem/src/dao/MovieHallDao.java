package dao;

import java.util.List;

import entity.MovieHall;

public interface MovieHallDao {
	//获得相应的影厅
	List<MovieHall> getMovieHall(int cenimaNumber);

	void insertMovieHall(MovieHall moviehall);
	
	List<MovieHall> getMovieHallAll();
}
