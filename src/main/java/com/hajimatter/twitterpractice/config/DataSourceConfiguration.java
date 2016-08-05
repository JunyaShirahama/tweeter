package com.hajimatter.twitterpractice.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfiguration {

	@Bean(name = "dataSource")
	@ConfigurationProperties(prefix = "spring.datasource.mysql")
	public DataSource dataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl("jdbc:mysql://localhost:3306/hajimatterdb?characterEncoding=UTF-8");
		datasource.setUsername("root");
		datasource.setPassword("");
		return  datasource;
	}
}
