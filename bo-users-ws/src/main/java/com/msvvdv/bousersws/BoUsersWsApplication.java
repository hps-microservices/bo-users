package com.msvvdv.bousersws;

import com.msvvdv.bouserscore.config.ModuleConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BoUsersWsApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(
                BoUsersWsApplication.class,
                ModuleConfiguration.class
        ).run(args);
    }
}
