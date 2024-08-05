package com.library.springboot.springboot_library.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Author {
    @Id
    private Long id;
    private String name;

}
