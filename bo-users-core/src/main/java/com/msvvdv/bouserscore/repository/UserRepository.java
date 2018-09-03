package com.msvvdv.bouserscore.repository;

import com.msvvdv.bouserscore.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {}
