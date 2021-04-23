package com.nidhinutritionist.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nidhinutritionist.model.Testimonial;
import com.nidhinutritionist.service.TestimonialService;

@RestController
@RequestMapping("/api/testimonial")
public class TestimonialController {
	
	@Autowired
	private TestimonialService testimonialService;
	
	
	@GetMapping
	public Testimonial getTestimonialContent() {
		Testimonial testimonial = testimonialService.getLatest();
		return testimonial;
	}
	
	@GetMapping("/{id}")
	public Optional<Testimonial> getById(@PathVariable Long id) {
		Optional<Testimonial> blog = testimonialService.getById(id);
		return blog;
	}
	
	@GetMapping("/active")
	public List<Testimonial> getActiveTestimonials() {
		List<Testimonial> testimonial = testimonialService.getActiveTestimonials();
		return testimonial;
	}
	
	@GetMapping("/all")
	public List<Testimonial> getAllRecords() {
		List<Testimonial> testimonial = testimonialService.getAllData();
		return testimonial;
	}
	
	
	@PostMapping
	public void setTestimonialContent(@RequestBody Testimonial content) {
		testimonialService.save(content);
	}
	
	@PutMapping
	public void updateTestimonialContent(@RequestBody Testimonial testimonial) {
		testimonialService.update(testimonial);
	}
	
	@DeleteMapping
	public void deleteTestimonial(@RequestBody Testimonial testimonial) {
		testimonialService.delete(testimonial);
	}
	
	@PutMapping("/{id}/{status}")
	public void updateStatus(@PathVariable("id") Long id, @PathVariable("status") String status) {
		Optional<Testimonial> testimonial = getById(id);
		Testimonial invidualTestimonial = testimonial.get();
		invidualTestimonial.setStatus(status);
		updateTestimonialContent(invidualTestimonial);
		
	}

}
