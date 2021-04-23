package com.nidhinutritionist.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Testimonial")
public class Testimonial {
	

    @Transient
    public static final String SEQUENCE_NAME = "testimonial_sequence";
    
	@Id
    private long id;
	private String name;
	private String story;
	private String imgPath;
	private String status;
	private Date createDate;
	private Date updateDate;

	
	public Testimonial() {
	}

	public Testimonial(String name, String story, String imgPath, String status, Date createDate, Date updateDate) {
		this.name = name;
		this.story = story;
		this.imgPath = imgPath;
		this.status = status;
		this.createDate = createDate;
		this.updateDate = updateDate;
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

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Testimonial [id=" + id + ", name=" + name + ", story=" + story + ", imgPath=" + imgPath + ", status="
				+ status + ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}
	
	
	
	

}
