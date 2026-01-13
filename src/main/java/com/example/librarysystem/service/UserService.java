package com.example.librarysystem.service;

import com.example.librarysystem.entity.User;
import java.util.List;

public interface UserService {

    User createUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);
}
