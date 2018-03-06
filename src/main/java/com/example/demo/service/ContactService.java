package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Contact;

@Service
public class ContactService {
	@Autowired 
	private ContactRepo contactRepo;

	public List<Contact> findAll() {
		List<Contact> list = contactRepo.findAll();
		return list;
	}

	public Contact getOne(long id) {
		return null;
	}

	public Contact save(Contact contact) {
		return null;
	}

	public void delete(Contact contact) {
		
	}
}