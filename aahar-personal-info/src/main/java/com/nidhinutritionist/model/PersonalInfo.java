package com.nidhinutritionist.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Personal-Info")
public class PersonalInfo {
	
	@Transient
	public static final String SEQUENCE_NAME = "personalInfo_sequence";
	
	@Id
	private long id;
	private String name;
	private String phone;
	private String email;
	private String address;
	private Date createDate;
	private Date updateDate;
	
	public PersonalInfo(long id, String name, String phone, String email, String address, Date createDate,
			Date updateDate) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	public PersonalInfo() {
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
		return "PersonalInfo [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", address="
				+ address + ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}
	
	
	
	

}
