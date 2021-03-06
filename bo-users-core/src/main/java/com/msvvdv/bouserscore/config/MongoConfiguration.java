package com.msvvdv.bouserscore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories(basePackages = {"com.msvvdv.bouserscore.repository"})
public class MongoConfiguration {}
