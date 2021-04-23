package com.nidhinutritionist.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModelProperty;

@Document("Recipe")
public class Recipe {
	

    @Transient
    public static final String SEQUENCE_NAME = "recipe_sequence";
    
	@Id
	@ApiModelProperty(notes = "The database generated recipe ID")
    private long id;
	private String name;
	private String recipe;
	private String imgPath;
	private String status;
	private Date recipeDate;
	private Date createDate;
	private Date updateDate;

	
	public Recipe() {
	}


	public Recipe(long id, String name, String recipe, String imgPath, String status, Date recipeDate, Date createDate,
			Date updateDate) {
		super();
		this.id = id;
		this.name = name;
		this.recipe = recipe;
		this.imgPath = imgPath;
		this.status = status;
		this.recipeDate = recipeDate;
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


	public String getRecipe() {
		return recipe;
	}


	public void setRecipe(String recipe) {
		this.recipe = recipe;
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


	public Date getRecipeDate() {
		return recipeDate;
	}


	public void setRecipeDate(Date recipeDate) {
		this.recipeDate = recipeDate;
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
		return "Recipe [id=" + id + ", name=" + name + ", recipe=" + recipe + ", imgPath=" + imgPath + ", status="
				+ status + ", recipeDate=" + recipeDate + ", createDate=" + createDate + ", updateDate=" + updateDate
				+ "]";
	}

}
