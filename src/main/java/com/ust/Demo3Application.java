package com.ust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ust"})
public class Demo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
		//System.err.println("============================================");
		//System.out.println("Hello World");
	}

}
