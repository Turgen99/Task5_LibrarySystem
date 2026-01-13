package com.example.librarysystem.service;

import com.example.librarysystem.entity.Borrowing;
import java.util.List;

public interface BorrowingService {

    Borrowing createBorrowing(Borrowing borrowing);

    List<Borrowing> getAllBorrowings();

    Borrowing getBorrowingById(Long id);

}
