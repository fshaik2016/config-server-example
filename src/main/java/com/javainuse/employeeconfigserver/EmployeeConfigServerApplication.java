package com.javainuse.employeeconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


@SpringBootApplication
@EnableConfigServer
@EnableAutoConfiguration
public class EmployeeConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeConfigServerApplication.class, args);
	}
}
