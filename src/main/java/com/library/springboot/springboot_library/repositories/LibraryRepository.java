package com.library.springboot.springboot_library.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.springboot.springboot_library.entities.Book;

@Repository
public interface LibraryRepository extends JpaRepository<Book,Long>{

    List<Book> findById(long id);

}
