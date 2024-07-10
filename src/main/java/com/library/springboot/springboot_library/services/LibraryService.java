package com.library.springboot.springboot_library.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.library.springboot.springboot_library.entities.Book;

@Service
public interface LibraryService {

    public List<Book> findAll();

    public Optional<Book> findById(long id);

    public Book save(Book book);

    public Book update(Book book);

    public boolean deleteById(long id);

}
