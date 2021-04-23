package com.nidhinutritionist.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Blog")
public class Blog {
	

    @Transient
    public static final String SEQUENCE_NAME = "blog_sequence";
    
	@Id
    private long id;
	private String heading;
	private String content;
	private String imgPath;
	private String status;
	private Date blogDate;
	private Date createDate;
	private Date updateDate;

	
	public Blog() {
	}


	public Blog(long id, String heading, String content, String imgPath, String status, Date blogDate, Date createDate,
			Date updateDate) {
		super();
		this.id = id;
		this.heading = heading;
		this.content = content;
		this.imgPath = imgPath;
		this.status = status;
		this.blogDate = blogDate;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getHeading() {
		return heading;
	}


	public void setHeading(String heading) {
		this.heading = heading;
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


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Date getBlogDate() {
		return blogDate;
	}


	public void setBlogDate(Date blogDate) {
		this.blogDate = blogDate;
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
		return "Blog [id=" + id + ", heading=" + heading + ", content=" + content + ", imgPath=" + imgPath + ", status="
				+ status + ", blogDate=" + blogDate + ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}

	
	
	
	
	

}
