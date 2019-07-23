package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Book;

@RepositoryRestResource(collectionResourceRel="books", path="books")
public interface BookRepository extends JpaRepository<Book, Long> {

}

//@Repository
//public interface BookRepository extends JpaRepository<Book, Long> {
//
//}