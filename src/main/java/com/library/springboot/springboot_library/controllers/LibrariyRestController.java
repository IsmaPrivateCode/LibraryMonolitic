package com.library.springboot.springboot_library.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/app")
public class LibrariyRestController {


    @GetMapping("/books")
    public String getBooks() {
        return "This ar the books";
    }
    

}
