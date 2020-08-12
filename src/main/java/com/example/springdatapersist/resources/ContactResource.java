package com.example.springdatapersist.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdatapersist.entities.Contact;
import com.example.springdatapersist.service.ContactService;

@RestController
@RequestMapping(value = "/contacts")
public class ContactResource {
	
	@Autowired
	ContactService service;
	
	@GetMapping
	public ResponseEntity<List<Contact>> findAll(){
		List<Contact> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	
}
