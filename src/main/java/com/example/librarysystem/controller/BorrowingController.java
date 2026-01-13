package com.example.librarysystem.controller;

import com.example.librarysystem.entity.Borrowing;
import com.example.librarysystem.service.BorrowingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/borrowings")
public class BorrowingController {

    @Autowired
    private BorrowingService borrowingService;

    @PostMapping
    public Borrowing createBorrowing(@RequestBody Borrowing borrowing){
        return borrowingService.createBorrowing(borrowing);
    }

    @GetMapping
    public List<Borrowing> getAllBorrowings(){
        return borrowingService.getAllBorrowings();
    }
}
