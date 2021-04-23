package com.nidhinutritionist.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nidhinutritionist.model.Appointment;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment, Long>{

	public List<Appointment> findByOrderByUpdateDateDesc();

}
