package com.nidhinutritionist.service;


import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidhinutritionist.model.Recipe;
import com.nidhinutritionist.repository.RecipeRepository;

@Service
public class RecipeService {

	@Autowired
	private RecipeRepository recipeRepo;
	
	
	public Recipe getLatest() {
		return recipeRepo.findByOrderByUpdateDateDesc().stream().findFirst().get();
		 
	}
	
	public void save(Recipe recipe) {
		recipe.setCreateDate(new Date());
		recipe.setUpdateDate(new Date());
		recipe.setStatus("ACTIVE");
		recipeRepo.insert(recipe);
	}

	public void update(Recipe recipe) {
		if(recipe.getId() == 0) {
			recipe.setCreateDate(new Date());
		}
		recipe.setUpdateDate(new Date());
		recipeRepo.save(recipe);
		
	}

	public List<Recipe> getAllData() {
		return recipeRepo.findAll();
	}

	public List<Recipe> getActiveRecipes() {
		return recipeRepo.findAllByStatusOrderByIdDesc("ACTIVE");
		
	}

	public void delete(Recipe recipe) {
		recipeRepo.delete(recipe);
		
	}

	public Optional<Recipe> getById(Long id) {
		return recipeRepo.findById(id);
	}
	
	public List<Recipe> getLimitedRecipes(int limit) {
		 return recipeRepo.getLimitedRecipes().limit(limit).collect(Collectors.toList());
	}

}
