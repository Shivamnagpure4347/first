package com.Symbibsis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.Symbibsis","com.dao","com.model","com.controller","com.service"})
@EntityScan("com.model")
@EnableJpaRepositories(basePackages="com.dao")

public class ProjectAuthorManagement1Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjectAuthorManagement1Application.class, args);
	}

}
