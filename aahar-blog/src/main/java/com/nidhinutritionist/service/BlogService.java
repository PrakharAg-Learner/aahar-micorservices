package com.nidhinutritionist.service;


import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidhinutritionist.model.Blog;
import com.nidhinutritionist.repository.BlogRepository;

@Service
public class BlogService {

	@Autowired
	private BlogRepository blogRepo;
	
	
	public Blog getLatest() {
		List<Blog> Blog = blogRepo.findByOrderByUpdateDateDesc();
		return Blog.get(0);
	}
	
	public void save(Blog blog) {
		blog.setCreateDate(new Date());
		blog.setUpdateDate(new Date());
		blog.setStatus("ACTIVE");
		blogRepo.insert(blog);
	}

	public void update(Blog blog) {
		if(blog.getId() == 0) {
			blog.setCreateDate(new Date());
		}
		blog.setUpdateDate(new Date());
		blogRepo.save(blog);
		
	}

	public List<Blog> getAllData() {
		return blogRepo.findAll();
	}

	public List<Blog> getActiveBlogs() {
		return blogRepo.findAllByStatusOrderByIdDesc("ACTIVE");
		
	}

	public void delete(Blog blog) {
		blogRepo.delete(blog);
		
	}

	public Optional<Blog> getById(Long id) {
		return blogRepo.findById(id);
	}

	public List<Blog> getLimitedBlogs(int limit) {
		 return blogRepo.getLimitedBlogs().limit(limit).collect(Collectors.toList());
	}

}
