package com.msvvdv.bouserscore.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@NoArgsConstructor
@Document(collection = "user")
public class User {
    @Id
    @Field("_id")
    private String idMongo;
    @Getter @Setter
    private Long id;
    @Getter
    private String name;
    @Getter
    private int age;
}
