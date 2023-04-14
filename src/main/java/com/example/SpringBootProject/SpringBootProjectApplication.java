package com.example.SpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EnableWebMvc
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

}
