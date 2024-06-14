package com.example.BookAuthorCRUD.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookDTO {
    private Long id;
    private String title;
    private List<String> authorNames;
}
