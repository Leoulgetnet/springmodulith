package com.leoulgetnet.springmodulith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class SpringmodulithApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmodulithApplication.class, args);
	}

}
