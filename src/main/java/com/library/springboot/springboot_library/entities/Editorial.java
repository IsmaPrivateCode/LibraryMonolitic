package com.library.springboot.springboot_library.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Editorial {

    @Id
    private Long id;

    @NotNull(message=" Editorial must not be null")
    private String name;

}
