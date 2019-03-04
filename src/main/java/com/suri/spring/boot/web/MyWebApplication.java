package com.suri.spring.boot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


/**
 * @Author: atekumar
 * @Current-Version: 1.0.0
 * @Creation-Date: 03/03/19
 * @Description: (Overwrite)
 * 1. Please describe the business usage of the class.
 * 2. Please describe the technical usage of the class.
 * @History:
 */
@SpringBootApplication
public class MyWebApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyWebApplication.class, args);
        System.out.println("Hello");
        System.out.println(" Application name"+ context.getApplicationName());




    }
}