package com.library.springboot.springboot_library.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {

    @Id
    private long id;
    private String title;
    private String authors;
    private String description;
    private String category;
    private String publisher;
    private double price;

}
