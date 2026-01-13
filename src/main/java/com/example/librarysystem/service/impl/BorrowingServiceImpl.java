package com.example.librarysystem.service.impl;

import com.example.librarysystem.entity.Borrowing;
import com.example.librarysystem.repository.BorrowingRepository;
import com.example.librarysystem.service.BorrowingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BorrowingServiceImpl implements BorrowingService {

    @Autowired
    private BorrowingRepository borrowingRepository;

    @Override
    public Borrowing createBorrowing(Borrowing borrowing){
        if (borrowing.getBorrowDate() == null){
            borrowing.setBorrowDate(java.time.LocalDate.now());
        }
        return borrowingRepository.save(borrowing);
    }

    @Override
    public List<Borrowing> getAllBorrowings(){
        return borrowingRepository.findAll();
    }
    @Override
    public Borrowing getBorrowingById(Long id){
        return borrowingRepository.findById(id).orElse(null);
    }

}
