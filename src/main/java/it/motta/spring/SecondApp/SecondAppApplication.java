package it.motta.spring.SecondApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "it.motta.spring")
public class SecondAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondAppApplication.class, args);
	}

}
