package com.nidhinutritionist.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nidhinutritionist.model.AdminUser;

@Repository
public interface AdminUserRepository extends MongoRepository<AdminUser, Long> {

	AdminUser findByEmail();

}
