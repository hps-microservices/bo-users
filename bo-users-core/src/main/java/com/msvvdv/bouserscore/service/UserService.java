package com.msvvdv.bouserscore.service;

import com.msvvdv.bouserscore.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> findAll();
}
