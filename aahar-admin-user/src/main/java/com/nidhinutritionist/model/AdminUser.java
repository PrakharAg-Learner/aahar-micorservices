package com.nidhinutritionist.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("AdminUser")
public class AdminUser {
	
	@Transient
	public static final String SEQUENCE_NAME = "adminUser_sequence";
	
	@Id
	private long id;
	private String email;
	private String password;
	private Date createDate;
	private Date updateDate;
	
	public AdminUser(long id, String password, String email, Date createDate, Date updateDate) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	public AdminUser() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
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
		return "AboutMe [id=" + id + ", password=" + password + ", email=" + email + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + "]";
	}
	
	

}
