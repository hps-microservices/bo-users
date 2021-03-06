package com.msvvdv.bousersws;

import com.msvvdv.bouserscore.config.ModuleConfiguration;
import com.msvvdv.bouserscore.config.MongoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(
                Application.class,
                ModuleConfiguration.class,
                MongoConfiguration.class
        ).run(args);
    }
}
