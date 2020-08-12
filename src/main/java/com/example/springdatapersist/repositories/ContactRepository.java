package com.example.springdatapersist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdatapersist.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
