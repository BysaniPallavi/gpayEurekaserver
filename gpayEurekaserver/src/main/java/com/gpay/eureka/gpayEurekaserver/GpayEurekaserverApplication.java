package com.gpay.eureka.gpayEurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GpayEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GpayEurekaserverApplication.class, args);
	}

}
