package com.nidhinutritionist.service;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidhinutritionist.model.ContactUs;
import com.nidhinutritionist.repository.ContactUsRepository;

@Service
public class ContactUsService {

	@Autowired
	private ContactUsRepository contactUsRepo;
	
	
	public ContactUs getLatest() {
		List<ContactUs> ContactUs = contactUsRepo.findByOrderByUpdateDateDesc();
		return ContactUs.get(0);
	}
	
	public void save(ContactUs contactUs) {
		contactUs.setCreateDate(new Date());
		contactUs.setUpdateDate(new Date());
		contactUsRepo.insert(contactUs);
	}

	public void update(ContactUs contactUs) {
		if(contactUs.getId() == 0) {
			contactUs.setCreateDate(new Date());
		}
		contactUs.setUpdateDate(new Date());
		contactUsRepo.save(contactUs);
		
	}

	public List<ContactUs> getAllData() {
		return contactUsRepo.findAll();
	}

}
