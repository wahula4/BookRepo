package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.demo.model.Book;
import com.example.demo.service.IBookService;

@SpringBootApplication
public class DemoJpa2Application {
	
//	@Autowired
//	private IBookService bookService;
//	
//	@Component
//	class DataSetup implements ApplicationRunner {
//		@Override
//		public void run(ApplicationArguments args) throws Exception {
//			bookService.save(Book.builder().book_name("Ender's Game").author_name("Orson Scott Card").isbn("d3k5kd").build());
//			bookService.save(Book.builder().book_name("The Name of the Wind").author_name("Pat Rothfuss").isbn("eou67n").build());
//		}
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemoJpa2Application.class, args);
	}

}
