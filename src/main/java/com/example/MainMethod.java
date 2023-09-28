package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

	/* @SpringBootApplication: A convenience annotation that combines @Configuration, 
	 @EnableAutoConfiguration, and @ComponentScan. It enables auto-configuration and
	 component scanning within the package.
	  */
@SpringBootApplication

	public class MainMethod {

		public static void main(String[] args) {
			SpringApplication.run(MainMethod.class, args);
		}
	}
