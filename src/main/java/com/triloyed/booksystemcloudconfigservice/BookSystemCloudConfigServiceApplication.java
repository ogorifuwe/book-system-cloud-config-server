package com.triloyed.booksystemcloudconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BookSystemCloudConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookSystemCloudConfigServiceApplication.class, args);
	}

}
