package com.zxy.forward;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class Center1Application {

	public static void main(String[] args) {
		SpringApplication.run(Center1Application.class, args);
	}
}
