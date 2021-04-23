package com.nidhinutritionist.service;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidhinutritionist.model.Appointment;
import com.nidhinutritionist.repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepo;
	
	
	public Appointment getLatest() {
		List<Appointment> appointment = appointmentRepo.findByOrderByUpdateDateDesc();
		return appointment.get(0);
	}
	
	public Appointment save(Appointment appointment) {
		appointment.setCreateDate(new Date());
		appointment.setUpdateDate(new Date());
		appointment.setStatus("ACTIVE");
		return appointmentRepo.insert(appointment);
	}

	public Appointment update(Appointment appointment) {
		if(appointment.getId() == 0) {
			appointment.setCreateDate(new Date());
		}
		appointment.setUpdateDate(new Date());
		return appointmentRepo.save(appointment);
		
	}

	public List<Appointment> getAllData() {
		return appointmentRepo.findAll();
	}

	public void delete(Appointment appointment) {
		appointmentRepo.delete(appointment);
	}
	
	
	

}
