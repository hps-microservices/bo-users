package com.msvvdv.bouserscore.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Document(collection = "user")
public class User {
    @Id
    private String id;
    @Getter
    private String name;
    @Getter
    private int age;
}
