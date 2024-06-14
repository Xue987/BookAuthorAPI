package com.example.BookAuthorCRUD.service;

import com.example.BookAuthorCRUD.dto.BookDTO;
import com.example.BookAuthorCRUD.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BookService {


    public BookDTO createBook(BookDTO bookDTO);
    public BookDTO updateBook(Long id, BookDTO bookDTO);
    public List<BookDTO> getAllBooks();
    public BookDTO getBookById(Long id);
    public List<BookDTO> getBooksByTitle(String title);
    public List<BookDTO> getBooksByAuthorName(String authorName);
    public void deleteBook(Long bookId);

}
