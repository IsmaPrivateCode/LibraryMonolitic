package com.library.springboot.springboot_library.entities.dto;

import java.io.Serializable;

import com.library.springboot.springboot_library.entities.Author;

import lombok.Data;

@Data
public class BookDTO implements Serializable{

    private static final long serialVersionUID=1L;

    private long id;
    private String title;
    private Author authors;
    private String description;
    private String category;
    private String publisher;
    private double price;

}
