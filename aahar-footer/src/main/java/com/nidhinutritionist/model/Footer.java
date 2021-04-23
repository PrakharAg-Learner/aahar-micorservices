package com.nidhinutritionist.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Footer")
public class Footer {
	

    @Transient
    public static final String SEQUENCE_NAME = "footer_sequence";
    
	@Id
    private long id;
	private String content;
	private Date createDate;
	private Date updateDate;

	
	public Footer() {
	}

	public Footer(String content, Date createDate, Date updateDate) {
		this.content = content;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	

}
