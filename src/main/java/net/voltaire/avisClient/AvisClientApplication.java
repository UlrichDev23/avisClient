package net.voltaire.avisClient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AvisClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvisClientApplication.class, args);
	}

	@Bean
	CommandLineRunner start(){
		return args->{
			System.out.println("Bonjour");
		};
	}

}
