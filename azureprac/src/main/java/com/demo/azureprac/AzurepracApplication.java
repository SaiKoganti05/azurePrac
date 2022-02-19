package com.demo.azureprac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzurepracApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzurepracApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String printMessage() {
		return "Check Passed";
	}

}
