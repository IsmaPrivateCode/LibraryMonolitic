package com.library.springboot.springboot_library.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Book {

    private long id;
    private String title;
    private String authors;
    private String description;
    private String category;
    private String publisher;
    private double price;


    

}
