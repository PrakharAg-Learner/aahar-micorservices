package com.nidhinutritionist.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nidhinutritionist.model.ContactUs;

@Repository
public interface ContactUsRepository extends MongoRepository<ContactUs, Long>{

	public List<ContactUs> findByOrderByUpdateDateDesc();

}
