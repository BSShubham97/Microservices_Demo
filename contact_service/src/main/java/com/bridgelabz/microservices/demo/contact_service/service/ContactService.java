package com.bridgelabz.microservices.demo.contact_service.service;

import java.util.List;

import com.bridgelabz.microservices.demo.contact_service.entity.Contact;

public interface ContactService {

	public List<Contact> getContactOfUser(Long userId);
}
