package com.hiral.ticketbookingrest.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiral.ticketbookingrest.model.Movie;
import com.hiral.ticketbookingrest.repository.MovieRepository;
import com.hiral.ticketbookingrest.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public List<Movie> fetchMovieList() {
		return movieRepository.findAll();
	}

	@Override
	public Movie fetchMovie(Long id) {
		Optional<Movie> movie = movieRepository.findById(id);
		if(movie.isPresent()) {
			return movie.get();
		}
		return null;
	}

	@Override
	public Movie addMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public Movie updateMovie(Long id, Movie movie) {
		if(movie.getId() != id) {
			return null;
		}
		Optional<Movie> oldMovie = movieRepository.findById(id);
		
		if(oldMovie.isPresent()) {
			return movieRepository.save(movie);
		}
		return null;
	}

	@Override
	public void deleteMovie(Long id) {
		movieRepository.deleteById(id);
		
	}

}
