package com.library.springboot.springboot_library.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.springboot.springboot_library.entities.Book;
import com.library.springboot.springboot_library.services.LibraryService;

import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/library")
@Tag(name="Library",description="CRUD for the Library")
public class LibrariyRestController {

    @Autowired
    LibraryService libraryService;

    private static final Logger logger = LoggerFactory.getLogger(LibrariyRestController.class);


    @GetMapping("/books")
    public ResponseEntity<List<Book>> findAll(){
        logger.info("====================");
        logger.info("Endpoint: /app/books");
        logger.info("Showing All the books with a response entity (GET) request");
        logger.info("====================");
        List<Book> books = libraryService.findAll();
        if(books.isEmpty()){
            logger.info("==================");
            logger.warn("The list of boooks is empty");
            logger.info("==================");
            return ResponseEntity.noContent().build();
        }

        logger.info("===================");
        logger.info("The list of books is showed succesfully");
        logger.info("===================");
        return ResponseEntity.ok(books);
    }
    

}
