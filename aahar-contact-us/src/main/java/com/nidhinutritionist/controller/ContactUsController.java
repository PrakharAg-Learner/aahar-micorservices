package com.nidhinutritionist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nidhinutritionist.model.ContactUs;
import com.nidhinutritionist.service.ContactUsService;

@RestController
@RequestMapping("/api/contactUs")
public class ContactUsController {
	
	@Autowired
	private ContactUsService contactUsService;
	
	
	@GetMapping
	public ContactUs getFooterContent() {
		ContactUs contactUs = contactUsService.getLatest();
		return contactUs;
	}
	
	@GetMapping("/all")
	public List<ContactUs> getAllRecords() {
		List<ContactUs> contactUs = contactUsService.getAllData();
		return contactUs;
	}
	
	
	@PostMapping
	public void setFooterContent(@RequestBody ContactUs content) {
		contactUsService.save(content);
	}
	
	@PutMapping
	public void updateFooterContent(@RequestBody ContactUs contactUs) {
		contactUsService.update(contactUs);
	}

}
