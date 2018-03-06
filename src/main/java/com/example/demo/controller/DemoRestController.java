package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Contact;
import com.example.demo.service.ContactService;


@RestController
public class DemoRestController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ResponseEntity<List<String>> listAllString(){
		List<String> listString= new ArrayList<>();
		listString.add("aaaaaaaaaaaaaaaaaaaaa");
		listString.add("aaaaaaaaaaaaaaaaaaaaa");
		listString.add("aaaaaaaaaaaaaaaaaaaaa");
		listString.add("aaaaaaaaaaaaaaaaaaaaa");
		listString.add("aaaaaaaaaaaaaaaaaaaaa");
		listString.add("aaaaaaaaaaaaaaaaaaaaa");
		listString.add("aaaaaaaaaaaaaaaaaaaaa");
		listString.add("aaaaaaaaaaaaaaaaaaaaa");
		if(listString.isEmpty()) {
			return new ResponseEntity<List<String>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<String>>(listString, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getallcontact", method = RequestMethod.GET)
	public ResponseEntity<List<Contact>> listAllContact(){
		List<Contact> listContact= contactService.findAll();
		if(listContact.isEmpty()) {
			return new ResponseEntity<List<Contact>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Contact>>(listContact, HttpStatus.OK);
	}
}
