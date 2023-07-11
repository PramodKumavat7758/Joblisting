package com.jobportal.Joblisting.Controller;

import com.jobportal.Joblisting.repository.PostRepository;
import com.jobportal.Joblisting.model.Post;
import com.jobportal.Joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired  // Autowired used to create object in spring
    PostRepository repo;
    SearchRepository searchrepo;


    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return repo.findAll();
    }


    //posts/java
    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return searchrepo.findByText(text);
    }
    @PostMapping("/addPost")
    public Post addPost(@RequestBody Post addPost){
        return repo.save(addPost);
    }


}
