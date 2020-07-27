package com.example.mongodbbasicexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class MongodbbasicexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongodbbasicexampleApplication.class, args);
    }

}
