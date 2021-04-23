package com.nidhinutritionist.repository;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.nidhinutritionist.model.Blog;

@Repository
public interface BlogRepository extends MongoRepository<Blog, Long>{

	public List<Blog> findByOrderByUpdateDateDesc();

	public List<Blog> findAllByStatusOrderByIdDesc(String status);
	
	@Query(value = " {'status':'ACTIVE'}", sort = "{'updateDate': -1}")
	Stream<Blog> getLimitedBlogs();   

}
