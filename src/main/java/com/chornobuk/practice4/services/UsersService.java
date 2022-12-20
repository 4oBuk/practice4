package com.chornobuk.practice4.services;

import java.util.List;

import com.chornobuk.practice4.entities.User;

public interface UsersService {
    User authorizeUser(String email, String password);
    List<User> getAllUsers();
}
