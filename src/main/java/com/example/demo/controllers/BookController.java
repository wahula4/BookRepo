package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.exception.BookNotFoundException;
import com.example.demo.model.Book;
import com.example.demo.service.IBookService;

import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;

@RestController
public class BookController {
	
	@Autowired 
	IBookService bookService;

// Get All Books
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.findAll();
    }

// Create a new Book
    @PostMapping("/book/{id}")
    public Book createBook(@Valid @RequestBody Book book) {
        return bookService.save(book);
    }

// Get a Single Book
    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable(value = "id") Long bookId) throws BookNotFoundException {
        return bookService.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException(bookId));
    }

// Update a Book
    @PutMapping("/book/{id}")
    public Book updateBook(@PathVariable(value = "id") Long bookId,
                           @Valid @RequestBody Book bookDetails) throws BookNotFoundException {

    	Book book = bookService.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException(bookId));

    	book.setBook_name(bookDetails.getBook_name());
        book.setAuthor_name(bookDetails.getAuthor_name());
        book.setIsbn(bookDetails.getIsbn());

        Book updatedBook = bookService.save(book);

        return updatedBook;
    }

// Delete a Book
    @DeleteMapping("/book/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable(value = "id") Long bookId) throws BookNotFoundException {
        Book book = bookService.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException(bookId));

bookService.delete(book);

return ResponseEntity.ok().build();
    }
}