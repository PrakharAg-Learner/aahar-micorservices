package com.nidhinutritionist.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nidhinutritionist.model.PersonalInfo;

@Repository
public interface PersonalInfoRepository extends MongoRepository<PersonalInfo, Long>{

	List<PersonalInfo> findByOrderByUpdateDateDesc();

}
