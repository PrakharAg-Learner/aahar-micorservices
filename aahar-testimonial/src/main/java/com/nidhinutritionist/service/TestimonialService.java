package com.nidhinutritionist.service;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidhinutritionist.model.Testimonial;
import com.nidhinutritionist.repository.TestimonialRepository;

@Service
public class TestimonialService {

	@Autowired
	private TestimonialRepository testimonialRepo;
	
	
	public Testimonial getLatest() {
		List<Testimonial> Testimonial = testimonialRepo.findByOrderByUpdateDateDesc();
		return Testimonial.get(0);
	}
	
	public void save(Testimonial testimonial) {
		testimonial.setCreateDate(new Date());
		testimonial.setUpdateDate(new Date());
		testimonial.setStatus("ACTIVE");
		testimonialRepo.insert(testimonial);
	}

	public void update(Testimonial testimonial) {
		if(testimonial.getId() == 0) {
			testimonial.setCreateDate(new Date());
		}
		testimonial.setUpdateDate(new Date());
		testimonialRepo.save(testimonial);
		
	}

	public List<Testimonial> getAllData() {
		return testimonialRepo.findAll();
	}

	public List<Testimonial> getActiveTestimonials() {
		return testimonialRepo.findAllByStatusOrderByIdDesc("ACTIVE");
		
	}
	
	public Optional<Testimonial> getById(Long id) {
		return testimonialRepo.findById(id);
	}

	public void delete(Testimonial testimonial) {
		testimonialRepo.delete(testimonial);
		
	}

}
