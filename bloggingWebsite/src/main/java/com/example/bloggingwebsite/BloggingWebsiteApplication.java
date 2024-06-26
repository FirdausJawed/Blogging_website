package com.example.bloggingwebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class BloggingWebsiteApplication {

	public static void main(String[] args) {
		System.out.println("started the project");
		SpringApplication.run(BloggingWebsiteApplication.class, args);
	}

}
