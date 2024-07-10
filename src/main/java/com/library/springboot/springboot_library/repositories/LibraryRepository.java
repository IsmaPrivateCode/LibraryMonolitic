package com.library.springboot.springboot_library.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.library.springboot.springboot_library.entities.Book;

@Repository
public interface LibraryRepository extends CrudRepository<Book,Long>{

}
