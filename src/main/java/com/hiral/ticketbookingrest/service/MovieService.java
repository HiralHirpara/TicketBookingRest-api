package com.hiral.ticketbookingrest.service;

import java.util.List;

import com.hiral.ticketbookingrest.model.Movie;

public interface MovieService {
	
	List<Movie> fetchMovieList();
	
	Movie fetchMovie(Long id);
	
	Movie addMovie(Movie movie);
	
	Movie updateMovie(Long id, Movie movie);
	
	void deleteMovie(Long id);

}
