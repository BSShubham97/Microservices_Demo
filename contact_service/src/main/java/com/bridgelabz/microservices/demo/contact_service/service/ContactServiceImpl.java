package com.bridgelabz.microservices.demo.contact_service.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.bridgelabz.microservices.demo.contact_service.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	//fake list of Contacts
	List<Contact> list = List.of(
			new Contact(1L, "itsband97@gmail.com","Shiv",1311L),
	        new Contact(2L, "shitcrek87@gmail.com","Satya",1311L),
            new Contact(3L, "crackyr34@gmail.com","Sunder",1312L),
            new Contact(4L, "gillkill23@gmail.com","Happy",1313L)
            );

	@Override
	public List<Contact> getContactOfUser(Long userId) {
		
		return list.stream().filter(contact-> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
