package com.rizvi.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.rizvi.spring")
public class SpringbootExampleProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootExampleProject1Application.class, args);
	}

}
