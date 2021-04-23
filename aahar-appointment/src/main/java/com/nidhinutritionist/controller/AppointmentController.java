package com.nidhinutritionist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nidhinutritionist.model.Appointment;
import com.nidhinutritionist.service.AppointmentService;

@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {
	
	@Autowired
	private AppointmentService appointmentService;
	
	
	@GetMapping
	public Appointment getAppointmentContent() {
		Appointment appointment = appointmentService.getLatest();
		return appointment;
	}
	
	@GetMapping("/all")
	public List<Appointment> getAllRecords() {
		List<Appointment> appointment = appointmentService.getAllData();
		return appointment;
	}
	
	
	@PostMapping
	public Appointment setAppointmentContent(@RequestBody Appointment content) {
		return appointmentService.save(content);
	}
	
	@PutMapping
	public Appointment updateAppointmentContent(@RequestBody Appointment appointment) {
		return appointmentService.update(appointment);
	}
	
	@DeleteMapping
	public void deleteAppointment(@RequestBody Appointment appointment) {
		appointmentService.delete(appointment);
	}

}
