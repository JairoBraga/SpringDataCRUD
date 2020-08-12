package com.example.springdatapersist.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.springdatapersist.entities.Contact;
import com.example.springdatapersist.repositories.ContactRepository;

@Configuration
@Profile("test")
public class TesteConfig  implements CommandLineRunner{
	
	@Autowired
	private ContactRepository service;
	

	@Override
	public void run(String... args) throws Exception {
		
		Contact c1 = new Contact(null,"Carlos","Carlos@gmail.com","119999999");
		Contact c2 = new Contact(null,"João","João@gmail.com","119999999");
		
		service.saveAll(Arrays.asList(c1,c2));
	}
}