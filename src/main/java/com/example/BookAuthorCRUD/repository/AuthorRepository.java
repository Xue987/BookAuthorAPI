package com.example.BookAuthorCRUD.repository;

import com.example.BookAuthorCRUD.entity.Author;
import com.example.BookAuthorCRUD.repository.custom.CustomAuthorRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Optional, but can be added for consistency
public interface AuthorRepository extends JpaRepository<Author, Long>, CustomAuthorRepository {

}
