package com.example.BookAuthorCRUD.repository.custom;

import com.example.BookAuthorCRUD.entity.Book;

import java.util.List;

public interface CustomBookRepository {
    List<Book> findBooksByTitle(String title);
    List<Book> findBooksByAuthorName(String authorName);
}
