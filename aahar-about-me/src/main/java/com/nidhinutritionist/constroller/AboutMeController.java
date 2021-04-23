package com.nidhinutritionist.constroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nidhinutritionist.model.AboutMe;
import com.nidhinutritionist.service.AboutMeService;

@RestController
@RequestMapping("/api/about-me")
public class AboutMeController {
	
	@Autowired
	private AboutMeService aboutMeService;

	@GetMapping("/all")
	public List<AboutMe> getAllRecords(){
		return aboutMeService.findAll();
	}
	
	@GetMapping
	public AboutMe getLatest() {
		return aboutMeService.getLatest();
	}
	
	@PostMapping
	public AboutMe save(@RequestBody AboutMe data) {
		return aboutMeService.save(data);
	}
	
	@PutMapping
	public AboutMe update(@RequestBody AboutMe data) {
		return aboutMeService.update(data);
	}
}
