package com.nidhinutritionist.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nidhinutritionist.model.Testimonial;

@Repository
public interface TestimonialRepository extends MongoRepository<Testimonial, Long>{

	public List<Testimonial> findByOrderByUpdateDateDesc();

	public List<Testimonial> findAllByStatusOrderByIdDesc(String string);

}
