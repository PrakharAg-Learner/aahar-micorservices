package com.nidhinutritionist.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidhinutritionist.model.AdminUser;
import com.nidhinutritionist.repository.AdminUserRepository;

@Service
public class AdminUserService {

	@Autowired
	private AdminUserRepository AdminUserRepository;

	public List<AdminUser> findAll() {
		return AdminUserRepository.findAll();
	}

	public AdminUser save(AdminUser data) {
		data.setCreateDate(new Date());
		data.setUpdateDate(new Date());
		return AdminUserRepository.insert(data);
	}

	public AdminUser update(AdminUser data) {
		if(data.getId() == 0) {
			data.setCreateDate(new Date());
		}
		data.setUpdateDate(new Date());
		return AdminUserRepository.save(data);
		
	}

	public AdminUser findByEmail() {
		return AdminUserRepository.findByEmail();
	}
}
