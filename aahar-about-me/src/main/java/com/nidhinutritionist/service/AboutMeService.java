package com.nidhinutritionist.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidhinutritionist.model.AboutMe;
import com.nidhinutritionist.repository.AboutMeRepository;

@Service
public class AboutMeService {

	@Autowired
	private AboutMeRepository aboutMeRepository;

	public List<AboutMe> findAll() {
		return aboutMeRepository.findAll();
	}

	public AboutMe save(AboutMe data) {
		data.setCreateDate(new Date());
		data.setUpdateDate(new Date());
		return aboutMeRepository.insert(data);
	}

	public AboutMe update(AboutMe data) {
		if(data.getId() == 0) {
			data.setCreateDate(new Date());
		}
		data.setUpdateDate(new Date());
		return aboutMeRepository.save(data);
		
	}

	public AboutMe getLatest() {
		return aboutMeRepository.findByOrderByUpdateDateDesc().get(0);
	}
}
