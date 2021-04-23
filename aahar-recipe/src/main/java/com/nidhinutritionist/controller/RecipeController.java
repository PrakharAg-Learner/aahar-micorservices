package com.nidhinutritionist.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nidhinutritionist.model.Recipe;
import com.nidhinutritionist.model.Recipe;
import com.nidhinutritionist.service.RecipeService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/recipe")
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;
	
	@ApiOperation(value = "View the last/latest added recipes", response = Recipe.class)
	@GetMapping
	public Recipe getRecipeContent() {
		Recipe recipe = recipeService.getLatest();
		return recipe;
	}
	
	@ApiOperation(value = "View a recipe by id", response = Recipe.class)
	@GetMapping("/{id}")
	public Optional<Recipe> getById(@PathVariable Long id) {
		Optional<Recipe> recipe = recipeService.getById(id);
		return recipe;
	}
	
	@ApiOperation(value = "View all active recipes", response = Recipe.class)
	@GetMapping("/active")
	public List<Recipe> getActiveRecipes() {
		List<Recipe> recipe = recipeService.getActiveRecipes();
		return recipe;
	}
	
	@ApiOperation(value = "view all recipes", response = Recipe.class)
	@GetMapping("/all")
	public List<Recipe> getAllRecords() {
		List<Recipe> recipe = recipeService.getAllData();
		return recipe;
	}
	
	
	@ApiOperation(value = "add recipe", response = Recipe.class)
	@PostMapping
	public void setRecipeContent(@RequestBody Recipe content) {
		recipeService.save(content);
	}
	
	@ApiOperation(value = "update recipe", response = Recipe.class)
	@PutMapping
	public void updateRecipeContent(@RequestBody Recipe recipe) {
		recipeService.update(recipe);
	}
	
	@ApiOperation(value = "delete recipe", response = Recipe.class)
	@DeleteMapping
	public void deleteRecipe(@RequestBody Recipe recipe) {
		recipeService.delete(recipe);
	}
	
	@ApiOperation(value = "Get list of recipes withni given limit", response = Recipe.class)
	@GetMapping("/get/{limit}")
	public List<Recipe> getLimitedRecipes(@PathVariable int limit) {
		return recipeService.getLimitedRecipes(limit);
	}
	
	@ApiOperation(value = "Update status of recipe", response = Recipe.class)
	@PutMapping("/{id}/{status}")
	public void updateRecipeContent(@PathVariable("id") Long id, @PathVariable("status") String status) {
		Optional<Recipe> blog = getById(id);
		Recipe invidualRecipe = blog.get();
		invidualRecipe.setStatus(status);
		updateRecipeContent(invidualRecipe);
		
	}

}
