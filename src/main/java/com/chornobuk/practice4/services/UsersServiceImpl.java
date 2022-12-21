package com.chornobuk.practice4.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chornobuk.practice4.entities.User;
import com.chornobuk.practice4.repositories.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService{

    private UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public User authorizeUser(String email, String password) {
        User user = usersRepository.getByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public List<User> getAllUsers() {
        return usersRepository.getAll();
    }
}
