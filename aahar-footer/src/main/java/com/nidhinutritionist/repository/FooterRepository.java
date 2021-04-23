package com.nidhinutritionist.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nidhinutritionist.model.Footer;

@Repository
public interface FooterRepository extends MongoRepository<Footer, Long>{

	public List<Footer> findByOrderByUpdateDateDesc();

}
