package com.nidhinutritionist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nidhinutritionist.model.Footer;
import com.nidhinutritionist.service.FooterService;

@RestController
@RequestMapping("/api/footer")
public class FooterController {
	
	@Autowired
	private FooterService footerService;
	
	
	@GetMapping
	public Footer getFooterContent() {
		Footer footer = footerService.getLatest();
		return footer;
	}
	
	@GetMapping("/all")
	public List<Footer> getAllRecords() {
		List<Footer> footer = footerService.getAllData();
		return footer;
	}
	
	
	@PostMapping
	public void setFooterContent(@RequestBody Footer content) {
		footerService.save(content);
	}
	
	@PutMapping
	public void updateFooterContent(@RequestBody Footer footer) {
		footerService.update(footer);
	}

}
