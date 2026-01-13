package com.example.librarysystem.service.impl;

import com.example.librarysystem.entity.Book;
import com.example.librarysystem.repository.BookRepository;
import com.example.librarysystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book saveBook (Book book){
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id){
        return bookRepository.findById(id).orElse(null);
    }

}
