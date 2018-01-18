package com.palt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
public class PaltImApplication{

	public static void main(String[] args) {
		SpringApplication.run(PaltImApplication.class, args);
		System.out.println("success!");
	}

}
