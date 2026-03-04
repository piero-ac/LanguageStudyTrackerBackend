package com.oreip.LanguageStudyTracker;

import com.oreip.LanguageStudyTracker.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LanguageStudyTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LanguageStudyTrackerApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(UserRepository userRepository) {
//		return runner -> {
//			System.out.println("Testing DB connection...");
//			System.out.println(userRepository.findAll());
//		};
//	}
}
