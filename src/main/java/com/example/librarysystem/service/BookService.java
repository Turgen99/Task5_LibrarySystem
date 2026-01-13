package com.example.librarysystem.service;

import com.example.librarysystem.entity.Book;
import java.util.List;

public interface BookService {

    Book saveBook(Book book);

    List<Book> getAllBooks();

    Book getBookById(Long id);

}
