package com.library.springboot.springboot_library.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.springboot.springboot_library.entities.Book;
import com.library.springboot.springboot_library.repositories.LibraryRepository;

@Service
public class LibraryServiceClass implements LibraryService{

    @Autowired
    LibraryRepository libraryRepository;

    @Override
    public List<Book> findAll() {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<Book> findById(long id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }



}
