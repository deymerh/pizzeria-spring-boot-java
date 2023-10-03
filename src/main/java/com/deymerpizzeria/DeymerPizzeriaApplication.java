package com.deymerpizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DeymerPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeymerPizzeriaApplication.class, args);
	}

}
