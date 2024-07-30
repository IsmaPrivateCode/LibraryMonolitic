package com.library.springboot.springboot_library.entities.dto;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.library.springboot.springboot_library.entities.Book;

@Component
public class BookAdapter {

    private static final ModelMapper modelMapper = new ModelMapper();

    public BookDTO toDTO(Book book){
        BookDTO dto = modelMapper.map(book, BookDTO.class);
        dto.setTitle(book.getTitle());
        dto.setAuthors(book.getAuthors());
        dto.setDescription(book.getDescription());
        dto.setCategory(book.getCategory());
        dto.setPublisher(book.getPublisher());
        dto.setPrice(book.getPrice());
        return dto;
    }

    public Book toBook(BookDTO dto){
        Book book = modelMapper.map(dto, Book.class);
        book.setTitle(dto.getTitle());
        book.setAuthors(dto.getAuthors());
        book.setDescription(dto.getDescription());
        book.setCategory(dto.getCategory());
        book.setPublisher(dto.getPublisher());
        book.setPrice(dto.getPrice());
        return book;
    }

}
