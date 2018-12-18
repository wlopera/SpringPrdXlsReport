package com.wlopera.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

import com.wlopera.spring.api.MovieServiceApi;
import com.wlopera.spring.api.MovieServiceApiImpl;

@Configuration
@ComponentScan(basePackages = {"com.wlopera.spring" })
public class WebAppConfig {

	@Bean
	public ViewResolver resourceBundleViewResolver() {
		ResourceBundleViewResolver viewResolver = new ResourceBundleViewResolver();
		viewResolver.setBasename("views");
		viewResolver.setOrder(1);
		return viewResolver;
	}

	@Bean
	public ViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setOrder(2);
		return resolver;
	}
	
	@Bean
	public MovieServiceApi getMovieApi() {
		return new MovieServiceApiImpl();
	}
	
}
