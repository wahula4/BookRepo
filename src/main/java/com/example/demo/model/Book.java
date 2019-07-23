package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String book_name;
	@NotBlank
    private String author_name;
	@NotBlank
    private String isbn;
	
public Book(){
        super();
    }

public Long getId() {
        return id;
    }
public void setId(Long id) {
        this.id = id;
    }
public String getBook_name() {
        return book_name;
    }
public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
public String getAuthor_name() {
        return author_name;
    }
public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }
public String getIsbn() {
        return isbn;
    }
public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

//package com.example.demo.model;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotBlank;
//
//import com.example.demo.model.Book.BookBuilder;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//
//@Builder
//@AllArgsConstructor
//@Entity
//@Table(name = "books")
//public class Book {
//
//    private Long id;
//    private String book_name;
//    private String author_name;
//    private String isbn;
//	
//public Book(){
//        super();
//    }
//
//@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
//    public long getId() {
//    return id;
//}
//public void setId(Long id) {
//        this.id = id;
//    }
//@Column(name = "book_name", nullable = false)
//public String getBook_name() {
//    return book_name;
//}
//public void setBook_name(String book_name) {
//        this.book_name = book_name;
//    }
//@Column(name = "author_name", nullable = false)
//public String getAuthor_name() {
//    return author_name;
//}
//public void setAuthor_name(String author_name) {
//        this.author_name = author_name;
//    }
//@Column(name = "isbn", nullable = false)
//public String getIsbn() {
//    return isbn;
//}
//public void setIsbn(String isbn) {
//        this.isbn = isbn;
//    }
//}
