package com.taran.cordy.services.impl;

import com.taran.cordy.entities.User;
import com.taran.cordy.services.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    @Override
    public User saveUser(User user) {
        return user;
    }

    @Override
    public Optional<User> getUserById(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> upadteUser(User user) {
        return Optional.empty();
    }

    @Override
    public void deleteUser(String id) {

    }

    @Override
    public boolean isUserExist(String userId) {
        return false;
    }

    @Override
    public boolean isUserExistByEmail(String email) {
        return false;
    }

    @Override
    public List<User> getAllUser() {
        return List.of();
    }
}
