package com.example.BookAuthorCRUD.repository;

import com.example.BookAuthorCRUD.entity.Book;
import com.example.BookAuthorCRUD.repository.custom.CustomBookRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>, CustomBookRepository {

}
