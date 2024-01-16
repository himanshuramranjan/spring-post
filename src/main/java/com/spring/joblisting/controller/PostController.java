package com.spring.joblisting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.joblisting.PostRepository;
import com.spring.joblisting.model.Post;

@RestController
public class PostController {
	
	@Autowired
	PostRepository repo;
	
	@GetMapping("/posts")
	public List<Post> getAllPost() {
		return repo.findAll();
	}
	
	@PostMapping("/post")
	public Post addPost(@RequestBody Post post) {
		return repo.save(post);
	}
}
