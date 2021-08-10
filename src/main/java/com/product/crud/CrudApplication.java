package com.product.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CrudApplication {
       public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
        System.out.println("Welcome to crud demo");
    }
}
