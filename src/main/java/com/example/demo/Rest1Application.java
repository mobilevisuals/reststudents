package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Rest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Rest1Application.class, args);
	}

@Bean
	CommandLineRunner init(StudentRepository repository) {
		return args -> {
			repository.save(new Student("Jane", "Doe", "Junior"));
			repository.save(new Student("Martin", "Fowler", "Senior"));
			repository.save(new Student("Roy", "Fielding", "Freshman"));
		};
	}
}
