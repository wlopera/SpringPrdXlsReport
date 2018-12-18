package com.wlopera.spring.api;

import java.util.ArrayList;
import java.util.List;

import com.wlopera.spring.domain.Movie;

public class MovieServiceApiImpl implements MovieServiceApi {

	public List<Movie> getMovies() {
		
		List<Movie> movies = new ArrayList<Movie>();
		
		movies.add(new Movie("Tiburon", "Suspenso", 1975, 'C'));
		movies.add(new Movie("Calles de Fuego", "Acción", 1984, 'C'));
		movies.add(new Movie("Volver al Futuro", "Ciencia ficción", 1985, 'A'));
		movies.add(new Movie("La Vida es Bella", "Comedia dramática", 1997, 'C'));
		movies.add(new Movie("Sexto Sentido", "Terror", 1999, 'C'));
		movies.add(new Movie("El Señor de los Anillos", "Novela", 2001, 'A'));
		
		return movies;
	}

}
