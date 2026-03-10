package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(DemoAppApplication.class, args);

		Dev obj = context.getBean(Dev.class);

		obj.build();

	}

}
