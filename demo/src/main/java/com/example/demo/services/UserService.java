package com.example.demo.services;

import com.RFDSpring.entities.User;
import com.RFDSpring.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(String accountID) {
        return userRepository.findByUsername(accountID);
    }

    public User addUser(User newUser) {
        return userRepository.save(newUser);

    }

    public User login(String username, String password) {
        User user =  userRepository.findByUsername(username);
        System.out.println(user.username + "   +  " + user.password);
        if (password.equals(user.getPassword())) {
            return user;
        } else {
            throw new RuntimeException("Username or Password does not match records");
        }
    }

    public User updateUser(User newUser) {
        return userRepository.save(newUser);
    }
}
