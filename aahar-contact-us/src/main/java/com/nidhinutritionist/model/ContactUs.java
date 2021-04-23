package com.nidhinutritionist.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("ContactUs")
public class ContactUs {
	

    @Transient
    public static final String SEQUENCE_NAME = "contactUs_sequence";
    
	@Id
    private long id;
	private String name;
	private String subject;
	private String email;
	private String message;
	private String imgPath;
	private Date createDate;
	private Date contactedDate;
	private Date updateDate;

	
	public ContactUs() {
	}


	public ContactUs(long id, String name, String subject, String email, String message, String imgPath,
			Date createDate, Date contactedDate, Date updateDate) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.email = email;
		this.message = message;
		this.imgPath = imgPath;
		this.createDate = createDate;
		this.contactedDate = contactedDate;
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


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getImgPath() {
		return imgPath;
	}


	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public Date getContactedDate() {
		return contactedDate;
	}


	public void setContactedDate(Date contactedDate) {
		this.contactedDate = contactedDate;
	}


	public Date getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}


	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}


	@Override
	public String toString() {
		return "ContactUs [id=" + id + ", name=" + name + ", subject=" + subject + ", email=" + email + ", message="
				+ message + ", imgPath=" + imgPath + ", createDate=" + createDate + ", contactedDate=" + contactedDate
				+ ", updateDate=" + updateDate + "]";
	}
		

}
