package com.nidhinutritionist.repository;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.nidhinutritionist.model.Recipe;

@Repository
public interface RecipeRepository extends MongoRepository<Recipe, Long>{

	public List<Recipe> findByOrderByUpdateDateDesc();

	public List<Recipe> findAllByStatusOrderByIdDesc(String status);
	
	@Query(value = " {'status':'ACTIVE'}", sort = "{'updateDate': -1}")
	Stream<Recipe> getLimitedRecipes();   

}
