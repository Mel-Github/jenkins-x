package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsXApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsXApplication.class, args);
	}

	@RequestMapping("/ping")
	public String ping(){
		return "pong";
	}
}
