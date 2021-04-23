package com.nidhinutritionist.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nidhinutritionist.model.AboutMe;

@Repository
public interface AboutMeRepository extends MongoRepository<AboutMe, Long> {

	public List<AboutMe> findByOrderByUpdateDateDesc();


}
