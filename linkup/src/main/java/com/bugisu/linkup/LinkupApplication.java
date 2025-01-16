package com.bugisu.linkup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing //BasicEntity를 사용하기 위함.
@EnableJpaRepositories(basePackages = "com.bugisu.linkup.repository")
public class LinkupApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkupApplication.class, args);
		System.out.println("API server started...");
	}

}
