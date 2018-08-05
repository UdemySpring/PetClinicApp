package com.petclinic.petclinicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetclinicappApplication {

    public static void main(String[] args) {
        System.out.println("inside main class");
        SpringApplication.run(PetclinicappApplication.class, args);
    }
}
