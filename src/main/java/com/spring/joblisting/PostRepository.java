package com.spring.joblisting;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.joblisting.model.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
