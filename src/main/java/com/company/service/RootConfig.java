package com.company.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = RootConfig.class)
public class RootConfig {

//	@Bean
//	public BookRepository bookRepository() {
//		return new BookRepository();
//	}
//	
//	@Bean
//	public BookService bookService() {
//		return new BookService();
//	}
}
