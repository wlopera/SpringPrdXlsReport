package com.wlopera.spring.api;

import java.util.ArrayList;
import java.util.List;

import com.wlopera.spring.domain.Movie;

public class MovieServiceApiImpl implements MovieServiceApi {

	public List<Movie> getMovies() {
		
		List<Movie> movies = new ArrayList<Movie>();
		
		movies.add(new Movie("Tiburon", "Suspenso", 1975, 'C'));
		movies.add(new Movie("Calles de Fuego", "Acci�n", 1984, 'C'));
		movies.add(new Movie("Volver al Futuro", "Ciencia ficci�n", 1985, 'A'));
		movies.add(new Movie("La Vida es Bella", "Comedia dram�tica", 1997, 'C'));
		movies.add(new Movie("Sexto Sentido", "Terror", 1999, 'C'));
		movies.add(new Movie("El Se�or de los Anillos", "Novela", 2001, 'A'));
		
		return movies;
	}

}
