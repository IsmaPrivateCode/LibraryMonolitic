package com.library.springboot.springboot_library.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.springboot.springboot_library.entities.Book;

@Repository
public interface LibraryRepository extends JpaRepository<Book,Long>{

    Optional <Book> findById(long id);

}
