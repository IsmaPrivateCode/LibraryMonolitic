package com.library.springboot.springboot_library.services;

import java.util.List;
import java.util.Optional;

import com.library.springboot.springboot_library.entities.Book;

public interface LibraryService {

    public List<Book> findAll();

    public Optional<Book> findById(long id);

}
