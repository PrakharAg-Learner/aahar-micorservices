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

import com.nidhinutritionist.model.Blog;
import com.nidhinutritionist.service.BlogService;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
	
	@Autowired
	private BlogService blogService;
	
	
	@GetMapping
	public Blog getBlogContent() {
		Blog blog = blogService.getLatest();
		return blog;
	}
	
	@GetMapping("/{id}")
	public Optional<Blog> getById(@PathVariable Long id) {
		Optional<Blog> blog = blogService.getById(id);
		return blog;
	}
	
	@GetMapping("/active")
	public List<Blog> getActiveBlogs() {
		List<Blog> blog = blogService.getActiveBlogs();
		return blog;
	}
	
	@GetMapping("/all")
	public List<Blog> getAllRecords() {
		List<Blog> blog = blogService.getAllData();
		return blog;
	}
	
	
	@PostMapping
	public void setBlogContent(@RequestBody Blog content) {
		blogService.save(content);
	}
	
	@PutMapping
	public void updateBlogContent(@RequestBody Blog blog) {
		blogService.update(blog);
	}
	
	@PutMapping("/{id}/{status}")
	public void updateStatus(@PathVariable("id") Long id, @PathVariable("status") String status) {
		Optional<Blog> blog = getById(id);
		Blog invidualBlog = blog.get();
		invidualBlog.setStatus(status);
		updateBlogContent(invidualBlog);
		
	}
	
	@DeleteMapping
	public void deleteBlog(@RequestBody Blog blog) {
		blogService.delete(blog);
	}
	
	@GetMapping("/get/{limit}")
	public List<Blog> getLimitedBlogs(@PathVariable int limit) {
		return blogService.getLimitedBlogs(limit);
	}

}
