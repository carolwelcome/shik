package com.shik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Springcloud1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springcloud1Application.class);
	}
}
