package com.example.twixx.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.twixx.entity.post;
import com.example.twixx.repository.postRepo;



@RestController
public class postController {

    @Autowired
    postRepo postRepo;
   
    @GetMapping("/")
    public String postFeed(){
        return "welcome"; 

    }

    @PostMapping("/addPost")
    public void createPost(@RequestBody post data){
        System.out.println("Received Post: " + data.getPostContent());
        postRepo.save(data);


    }

}
