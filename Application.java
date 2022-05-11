package com.splittter.jpa.domains;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner splitDemo(UsersRepository usersRepository) {
		return (args) -> {// create users
			usersRepository.save(new UserTable("user1", 0, 0));
			usersRepository.save(new UserTable("user2", 0, 0));
			usersRepository.save(new UserTable("user3", 0, 0));
			
			for (UserTable usertable : usersRepository.findAll()) {
				System.out.println(usertable.toString());
			}
		};
	}
}
