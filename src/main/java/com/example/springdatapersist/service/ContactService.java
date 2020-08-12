package com.example.springdatapersist.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatapersist.entities.Contact;
import com.example.springdatapersist.repositories.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository repository;
	
	public List<Contact> findAll(){
		return repository.findAll();
		
	}
	
	public Optional<Contact> findById(long id) {
		
		return repository.findById(id);
		
	}

}
