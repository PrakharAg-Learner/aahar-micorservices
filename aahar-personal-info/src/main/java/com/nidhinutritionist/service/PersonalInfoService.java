package com.nidhinutritionist.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nidhinutritionist.model.PersonalInfo;
import com.nidhinutritionist.repository.PersonalInfoRepository;

@Service
public class PersonalInfoService {
	
	@Autowired
	private PersonalInfoRepository personalInfoRepository;

	public List<PersonalInfo> getAllDetails() {
		return personalInfoRepository.findAll();
	}

	public PersonalInfo save(PersonalInfo data) {
		data.setCreateDate(new Date());
		data.setUpdateDate(new Date());
		PersonalInfo personalInfo = personalInfoRepository.insert(data);
		return personalInfo;
		
	}

	public PersonalInfo update(PersonalInfo data) {
		if(data.getId() == 0) {
			data.setCreateDate(new Date());
		}
		data.setUpdateDate(new Date());
		PersonalInfo personalInfo = personalInfoRepository.save(data);
		return personalInfo;
	}

	public PersonalInfo getLatest() {
		PersonalInfo personalInfo = personalInfoRepository.findByOrderByUpdateDateDesc().get(0);
		return personalInfo;
	}

}
