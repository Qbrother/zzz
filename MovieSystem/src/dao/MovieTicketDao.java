package dao;

import java.util.List;

import entity.MovieTicket;

public interface MovieTicketDao {
	List<MovieTicket> getMovieTicket(String user_Name);

	void insertMovieTicket(MovieTicket movieticket); 
}
