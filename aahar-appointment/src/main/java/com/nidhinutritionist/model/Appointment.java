package com.nidhinutritionist.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Appointment")
public class Appointment {
	

    @Transient
    public static final String SEQUENCE_NAME = "appointment_sequence";
    
	@Id
    private long id;
	private String name;
	private String email;
	private String status;
	private String appointmentDateTime;
	private Date appointmentDate;
	private Date createDate;
	private Date updateDate;

	
	public Appointment() {
	}

	public Appointment(long id, String name, String email, String status, String appointmentDateTime,
			Date appointmentDate, Date createDate, Date updateDate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.status = status;
		this.appointmentDateTime = appointmentDateTime;
		this.appointmentDate = appointmentDate;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getAppointmentDateTime() {
		return appointmentDateTime;
	}


	public void setAppointmentDateTime(String appointmentDateTime) {
		this.appointmentDateTime = appointmentDateTime;
	}


	public Date getAppointmentDate() {
		return appointmentDate;
	}


	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public Date getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", name=" + name + ", email=" + email + ", status=" + status
				+ ", appointmentDateTime=" + appointmentDateTime + ", appointmentDate=" + appointmentDate
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}
		

}
