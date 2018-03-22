package com.javainuse.employeeconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
@EnableConfigServer
@EnableAutoConfiguration
public class EmployeeConfigServerApplication {
	
	@GetMapping("/hi")
	String hi() {
		return "Hello " + "Fayaz Sir";
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeConfigServerApplication.class, args);
	}
}
