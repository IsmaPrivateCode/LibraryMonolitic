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
        return libraryRepository.findAll();
    }

    @Override
    public Optional<Book> findById(long id) {
        Optional<Book> book=libraryRepository.findById(id);
        return book;
    }

    @Override
    public Book save(Book book) {
        if(book==null) return null;
        
        return libraryRepository.save(book);
    }

    @Override
    public Book update(Book book) {
        if(book == null) return null;
        if(findById(book.getId()).isEmpty()) return null;
        return libraryRepository.save(book);
    }

    @Override
    public boolean deleteById(long id) {
        Optional<Book> book = findById(id);
        if(book.isPresent()){
            deleteById(id);
            return true;
        }

        return false;
    }



}
