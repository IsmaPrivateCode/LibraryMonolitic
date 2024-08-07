package com.library.springboot.springboot_library.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Category {

    @Id
    private Long id;

    @NotNull
    private String name;

    private Long category_id;

}
