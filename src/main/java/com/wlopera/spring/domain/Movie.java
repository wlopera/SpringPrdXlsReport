package com.wlopera.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@lombok.ToString
public class Movie {
	
	private String name;
	private String gender;
	private int year;
	private char clase;
	
}
