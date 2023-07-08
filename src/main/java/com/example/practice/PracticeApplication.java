package com.example.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import com.example.practice.repository.PracticeRepository;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		// private PracticeRepository practiceRepository=getBean(PracticeRepository.class);
		SpringApplication.run(PracticeApplication.class, args);
	}

	// private static PracticeRepository getBean(Class<PracticeRepository> class1) {
	// 	return null;
	// }
}
