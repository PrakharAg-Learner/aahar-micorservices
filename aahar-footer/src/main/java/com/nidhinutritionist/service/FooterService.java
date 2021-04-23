package com.nidhinutritionist.service;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidhinutritionist.model.Footer;
import com.nidhinutritionist.repository.FooterRepository;

@Service
public class FooterService {

	@Autowired
	private FooterRepository footerRepo;
	
	
	public Footer getLatest() {
		List<Footer> footer = footerRepo.findByOrderByUpdateDateDesc();
		return footer.get(0);
	}
	
	public void save(Footer footer) {
		footer.setCreateDate(new Date());
		footer.setUpdateDate(new Date());
		footerRepo.insert(footer);
	}

	public void update(Footer footer) {
		if(footer.getId() == 0) {
			footer.setCreateDate(new Date());
		}
		footer.setUpdateDate(new Date());
		footerRepo.save(footer);
		
	}

	public List<Footer> getAllData() {
		return footerRepo.findAll();
	}

}
