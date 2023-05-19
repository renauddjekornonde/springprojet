package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.demo.*"})
public class Projet1Application {

	public static void main(String[] args) {
		SpringApplication.run(Projet1Application.class, args);
		System.out.println("Application started");
	}

}
