package com.hajimatter.twitterpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(value = "com.hajimatter")
public class TwitterPracticeApp {

	public static void main(String[] args) {
		SpringApplication.run(TwitterPracticeApp.class, args);
	}
	
//	@Bean(name = "dataSource")
//	public DataSource dataSource(){
//		return DataSourceBuilder.create().build();
//	}
}
