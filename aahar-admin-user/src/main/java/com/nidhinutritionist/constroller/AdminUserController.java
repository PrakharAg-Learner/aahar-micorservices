package com.nidhinutritionist.constroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nidhinutritionist.model.AdminUser;
import com.nidhinutritionist.service.AdminUserService;

@RestController
@RequestMapping("/api/about-me")
public class AdminUserController {
	
	@Autowired
	private AdminUserService adminUserService;

	@GetMapping("/all")
	public List<AdminUser> getAllRecords(){
		return adminUserService.findAll();
	}
	
	@GetMapping
	public AdminUser findByEmail() {
		return adminUserService.findByEmail();
	}
	
	@PostMapping
	public AdminUser save(@RequestBody AdminUser data) {
		return adminUserService.save(data);
	}
	
	@PutMapping
	public AdminUser update(@RequestBody AdminUser data) {
		return adminUserService.update(data);
	}
}
