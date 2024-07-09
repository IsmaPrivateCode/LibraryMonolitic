package com.library.springboot.springboot_library.repositories;

import org.springframework.data.repository.CrudRepository;

import com.library.springboot.springboot_library.entities.Book;

public interface LibraryRepository extends CrudRepository<Book,Long>{

}
