package com.msvvdv.bouserscore.service.impl;

import com.msvvdv.bouserscore.entity.User;
import com.msvvdv.bouserscore.repository.UserRepository;
import com.msvvdv.bouserscore.service.SequenceService;
import com.msvvdv.bouserscore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SequenceService sequenceService;

    private final static String SEQUENCE_USER_KEY = "user";

    @Override
    public void save(User user) {
        user.setId(sequenceService.getNextSequenceId(SEQUENCE_USER_KEY));
        userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
