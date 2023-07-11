package com.jobportal.Joblisting.repository;

import com.jobportal.Joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {

}
