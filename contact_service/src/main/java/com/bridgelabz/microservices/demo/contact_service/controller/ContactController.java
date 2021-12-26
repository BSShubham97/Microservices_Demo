package com.bridgelabz.microservices.demo.contact_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.microservices.demo.contact_service.entity.Contact;
import com.bridgelabz.microservices.demo.contact_service.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	@Autowired
	ContactService contactService;

	@RequestMapping("/user/{userId}")
	public List<Contact> getContacts(@PathVariable("userId") Long userId) {
		return this.contactService.getContactOfUser(userId);
	}

}
