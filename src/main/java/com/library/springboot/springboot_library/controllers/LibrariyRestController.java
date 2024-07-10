package com.library.springboot.springboot_library.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.springboot.springboot_library.entities.Book;
import com.library.springboot.springboot_library.services.LibraryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/app")
public class LibrariyRestController {

    @Autowired
    LibraryService libraryService;


    @GetMapping("/books")
    public List<Book> getBooks() {
        return libraryService.findAll();
    }
    

}
