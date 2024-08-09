package com.global.hr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @Qualifier("qualifier name") is used when interface has more than one implementations
//and you need to inject them somewhere so you call the qualifier by name 
// 
public class JdbcHrProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcHrProjectApplication.class, args);
	}

}
