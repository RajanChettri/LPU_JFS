package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	// Now Let us Configure the Function to Return List of Movies
	
	@GetMapping("/movies")
	
	public List<Movie>  getAllMovies() {
		
		return Arrays.asList(
				
				new Movie("matrix" , "Matrix Ressurection", "Parellel World Movie"),
				new Movie("avengers" , "Avengers END GAME ", "watch heroes saving universe.."),
				new Movie("conjuring" , "Conjuring Revised", "Horror at its Best")
				
				);
		
		
	}
	
	
}

