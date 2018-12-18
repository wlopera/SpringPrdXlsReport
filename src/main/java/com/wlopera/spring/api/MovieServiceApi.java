package com.wlopera.spring.api;

import java.util.List;

import com.wlopera.spring.domain.Movie;

public interface MovieServiceApi {

	/**
	 * Listado de peliculas
	 * @return
	 */
	List<Movie> getMovies();

}
