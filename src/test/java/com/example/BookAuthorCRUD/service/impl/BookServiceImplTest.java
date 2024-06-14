package com.example.BookAuthorCRUD.service.impl;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.BookAuthorCRUD.dto.BookDTO;
import com.example.BookAuthorCRUD.entity.Author;
import com.example.BookAuthorCRUD.entity.Book;
import com.example.BookAuthorCRUD.entity.BookAuthor;
import com.example.BookAuthorCRUD.repository.AuthorRepository;
import com.example.BookAuthorCRUD.repository.BookAuthorRepository;
import com.example.BookAuthorCRUD.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookServiceImplTest {

    @Mock
    private BookRepository bookRepository;

    @Mock
    private AuthorRepository authorRepository;

    @Mock
    private BookAuthorRepository bookAuthorRepository;

    @InjectMocks
    private BookServiceImpl bookServiceImpl;

    @Test
    void testGetBookById() {
        Long bookId = 1L;
        Book book = new Book();
        book.setId(bookId);
        book.setTitle("Test Book");

        BookAuthor bookAuthor = new BookAuthor();
        bookAuthor.setBookId(bookId);
        bookAuthor.setAuthorId(1L);

        Author author = new Author();
        author.setId(1L);
        author.setName("Test Author");

        when(bookRepository.findById(bookId)).thenReturn(Optional.of(book));
        when(bookAuthorRepository.findByBookId(bookId)).thenReturn(Arrays.asList(bookAuthor));
        when(authorRepository.findById(1L)).thenReturn(Optional.of(author));

        BookDTO result = bookServiceImpl.getBookById(bookId);

        assertEquals(bookId, result.getId());
        assertEquals("Test Book", result.getTitle());
        assertEquals(Arrays.asList("Test Author"), result.getAuthorNames());
    }


}
