package com.Aditya.CRUDAPP;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class CrudappApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrudappApplication.class, args);
    }

}