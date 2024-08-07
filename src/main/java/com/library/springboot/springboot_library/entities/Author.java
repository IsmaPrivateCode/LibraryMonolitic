package com.library.springboot.springboot_library.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Author {
    @Id
    private Long id;

    @NotNull(message = "Name must not be null")
    private String name;

}
