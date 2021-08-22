package com.everis.reportsbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ReportsBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReportsBankApplication.class, args);
	}

}
