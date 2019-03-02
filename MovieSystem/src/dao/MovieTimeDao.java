package dao;

import java.util.List;

import entity.MovieTime;

public interface MovieTimeDao {
	
	void insertMovieTime(MovieTime movietime);
	
	List<MovieTime> getSingleTime(int movieNumber,int cinemaNumber,int hallNumber);
	
	List<MovieTime> getSingleAll(int cinemaId,int movieHallId);
}
