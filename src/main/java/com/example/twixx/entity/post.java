package com.example.twixx.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "twixx")
public class post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int postId; 
   
    private String username; 

    
    private String postContent;


    public String setusername() {
        return username;
    }

    public void setusername(String username) {
        this.username =username;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }


}
