package com.library.springboot.springboot_library.entities;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message ="Title must not be empty")
    @NotNull(message = "Title cannot be NULL")
    private String title;

    @NotNull(message = "Author's cannot be empty")
    @ManyToOne
    private Author authors;
    
    @JsonProperty("description")
    private String description;

    @NotNull(message="Category cannot be NULL")
    private String category;

    @NotNull(message="Publisher cannot be NULL")
    private String publisher;

    @NotNull(message="Price cannot be NULL")
    private double price;

    
}
