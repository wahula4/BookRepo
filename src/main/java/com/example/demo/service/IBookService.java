package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.example.demo.model.Book;

public interface IBookService {

	List<Book> findAll();

	Book save(@Valid Book book);

	void delete(Book book);

	Optional<Book> findById(Long bookId);
	
}
