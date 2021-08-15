package com.techm.blog.controller;

import com.techm.blog.model.BlogPost;
import com.techm.blog.repo.blogPostRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/")
@AllArgsConstructor
public class BlogpostController {

    private final blogPostRepo blogPostRepo;

    @GetMapping("/posts")
    List<BlogPost> all() {
        return blogPostRepo.findAll();
    }

}
