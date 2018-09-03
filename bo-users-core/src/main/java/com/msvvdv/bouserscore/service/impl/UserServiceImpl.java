package com.msvvdv.bouserscore.service.impl;

import com.msvvdv.bouserscore.entity.User;
import com.msvvdv.bouserscore.repository.UserRepository;
import com.msvvdv.bouserscore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
