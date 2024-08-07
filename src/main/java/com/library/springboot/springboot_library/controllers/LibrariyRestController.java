package com.library.springboot.springboot_library.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.library.springboot.springboot_library.entities.Book;
import com.library.springboot.springboot_library.entities.dto.BookAdapter;
import com.library.springboot.springboot_library.entities.dto.BookDTO;
import com.library.springboot.springboot_library.services.LibraryService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/library")
@Tag(name="Library",description="CRUD for the Library")
public class LibrariyRestController {

    @Autowired
    LibraryService libraryService;

    @Autowired
    BookAdapter adapter;

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

    @GetMapping("/book/{id}")
    public BookDTO findBookByName(@PathVariable Long id){
        logger.info("====================");
        logger.info("Endpoint: /app/book/"+id);
        logger.info("Showing book by ID with a Response Entity (GET) request");
        logger.info("====================");
        Book book = libraryService.findById(id).orElse(null);

        if(book==null){
            logger.info("====================");
            logger.warn("The book serch by ID: " + id + " cannot be found");
            logger.info("====================");
            return null;
        }

        logger.info("===================");
        logger.info("Book " + id +" is showed succesfully");
        logger.info("===================");
        return adapter.toDTO(book);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEntity(@PathVariable Long id){
        logger.info("====================");
        logger.info("Endpoint: /app/delete/"+id);
        logger.info("Deleting book by ID with a Response Entity (DELETE) request");
        logger.info("====================");

        if(libraryService.findById(id)==null){
            logger.info("====================");
            logger.warn("The book serch by ID: " + id + " cannot be found");
            logger.info("====================");
            return null;
        }

        return ResponseEntity.ok(libraryService.deleteById(id));
    }

    @PostMapping
    public ResponseEntity<BookDTO> saveBook(@Valid @RequestBody Book book){
        logger.info("====================");
        logger.info("Endpoint: /app");
        logger.info("Save book a Response Entity (POST) request");
        logger.info("====================");

        if(book == null){
            logger.info("==================");
            logger.warn("There is not book ton save");
            return null;
        }

        logger.info("Book that is going to be save: " +book.toString());
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(book.getId()).toUri();
        return ResponseEntity.created(location).body(adapter.toDTO(book));
    }
    
    @PutMapping
    public ResponseEntity<?> updateBook(@Valid @RequestBody Book book){
        logger.info("====================");
        logger.info("Endpoint: /app");
        logger.info("Save book a Response Entity (PUT) request");
        logger.info("====================");

        Book updated = libraryService.update(book);

        if(updated==null){
            logger.info("==================");
            logger.warn("Cannot be update the book " + book.toString());
            return null;
        }

        logger.info("Book that is going to be update: " +book.toString());
        return ResponseEntity.ok(adapter.toDTO(book));

    }
    

}
