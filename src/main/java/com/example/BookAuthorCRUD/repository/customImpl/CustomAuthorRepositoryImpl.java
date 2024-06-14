package com.example.BookAuthorCRUD.repository.customImpl;

import com.example.BookAuthorCRUD.entity.Author;
import com.example.BookAuthorCRUD.repository.custom.CustomAuthorRepository;
import jakarta.persistence.*;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CustomAuthorRepositoryImpl implements CustomAuthorRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<Author> findAuthorByName(String name) {
        TypedQuery<Author> query = entityManager.createQuery(
                "SELECT a FROM Author a WHERE a.name = :name", Author.class);
        query.setParameter("name", name);
        List<Author> resultList = query.getResultList();
        if (resultList.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(resultList.get(0));
        }
    }
}


