package dao;

import java.util.List;

import entity.MovieHall;

public interface MovieHallDao {
	//�����Ӧ��Ӱ��
	List<MovieHall> getMovieHall(int cenimaNumber);

	void insertMovieHall(MovieHall moviehall);
	
	List<MovieHall> getMovieHallAll();
}
