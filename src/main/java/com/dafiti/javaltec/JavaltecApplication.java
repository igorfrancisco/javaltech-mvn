package com.dafiti.javaltec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class JavaltecApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaltecApplication.class, args);
    }

}

