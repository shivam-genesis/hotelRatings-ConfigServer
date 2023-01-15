package com.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HotelRatingsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelRatingsConfigServerApplication.class, args);
	}

}
