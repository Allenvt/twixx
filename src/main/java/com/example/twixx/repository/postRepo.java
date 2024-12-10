package com.example.twixx.repository;

import com.example.twixx.entity.post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface postRepo extends JpaRepository<post, Integer> {
}