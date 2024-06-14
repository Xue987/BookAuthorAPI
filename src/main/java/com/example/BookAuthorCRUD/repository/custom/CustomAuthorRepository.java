package com.example.BookAuthorCRUD.repository.custom;

import com.example.BookAuthorCRUD.entity.Author;

import java.util.List;
import java.util.Optional;

public interface CustomAuthorRepository {
    Optional<Author> findAuthorByName(String name);
}
