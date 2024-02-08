package com.hiral.ticketbookingrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hiral.ticketbookingrest.model.Movie;
import com.hiral.ticketbookingrest.model.Session;
import com.hiral.ticketbookingrest.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	private MovieService movieservice;
	
	@GetMapping()
	public ResponseEntity<List<Movie>> getMovies(){
		List<Movie> response = movieservice.fetchMovieList();
		if(response.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
		}
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/sessions/{id}")
	public List<Session> getMovieSessions(@PathVariable Long id){
		Movie movie = movieservice.fetchMovie(id);
		return movie.getSessions();
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public Movie addMovie(@RequestBody Movie movie) {
		return movieservice.addMovie(movie);
	}
}
