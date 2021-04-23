package com.nidhinutritionist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nidhinutritionist.model.PersonalInfo;
import com.nidhinutritionist.service.PersonalInfoService;

@RestController
@RequestMapping("/api/personal-info")
public class PersonalInfoController {
	
	@Autowired
	private PersonalInfoService personalInfoService;
	
	@GetMapping("/all")
	public List<PersonalInfo> getAllDetails(){
		return personalInfoService.getAllDetails();
		
	}
	
	@GetMapping
	public PersonalInfo getLatest(){
		return personalInfoService.getLatest();
		
	}
	
	@PostMapping
	public PersonalInfo save(@RequestBody PersonalInfo data) {
		personalInfoService.save(data);
		return data;
	}
	
	@PutMapping
	public PersonalInfo update(@RequestBody PersonalInfo data) {
		PersonalInfo personalInfo = personalInfoService.update(data);
		return personalInfo;
	}

}
