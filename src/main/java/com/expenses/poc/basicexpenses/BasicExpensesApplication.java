package com.expenses.poc.basicexpenses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication()
@EnableAutoConfiguration()
@EnableMongoRepositories(basePackages = "com.expenses.poc.basicexpenses.repositories")
public class BasicExpensesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicExpensesApplication.class, args);
	}

}
