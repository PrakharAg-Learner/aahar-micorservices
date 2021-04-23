package com.nidhinutritionist.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("AboutMe")
public class AboutMe {
	
	@Transient
	public static final String SEQUENCE_NAME = "aboutMe_sequence";
	
	@Id
	private long id;
	private String content;
	private String imgPath;
	private Date createDate;
	private Date updateDate;
	
	public AboutMe(long id, String content, String imgPath, Date createDate, Date updateDate) {
		super();
		this.id = id;
		this.content = content;
		this.imgPath = imgPath;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	public AboutMe() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "AboutMe [id=" + id + ", content=" + content + ", imgPath=" + imgPath + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + "]";
	}
	
	

}
