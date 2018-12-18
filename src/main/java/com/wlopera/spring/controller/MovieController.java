package com.wlopera.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wlopera.spring.api.MovieServiceApi;
import com.wlopera.spring.domain.Movie;

@Controller
public class MovieController {

	@Autowired
	private MovieServiceApi movieApi;

	@ModelAttribute("movieList")
	public List<Movie> getMovieList() {
		return movieApi.getMovies();
	}

	// http://localhost:8080/SpringReport/movie
	@RequestMapping("/")
	public ModelAndView verInicio() {
		return new ModelAndView("movie");
	}

	@RequestMapping(value = "/pdf")
	public String generarPdf(Model model) {
		System.out.println("Peticion HTTP-GEt... [.../pdf]");
		return "pdfView";
	}
	
	@RequestMapping(value = "/xls")
	public String generarXls(Model model) {
		System.out.println("Peticion HTTP-GEt... [.../xls]");
		return "xlsView";
	}
}
