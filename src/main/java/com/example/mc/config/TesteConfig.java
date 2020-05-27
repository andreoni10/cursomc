package com.example.mc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.mc.services.DBService;
import com.example.mc.services.EmailService;
import com.example.mc.services.MockEmailService;

@Configuration
@Profile("test")
public class TesteConfig {
	
	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean InstantiateDatabase() throws ParseException {
		dbService.InstantiateTestDatabase();
		return true;
	}
	
	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}

}
