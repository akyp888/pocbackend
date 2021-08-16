package com.techm.blog.controller;

import com.techm.blog.model.BlogPost;
import com.techm.blog.repo.blogPostRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://52.206.79.151:5000/")
@RestController
@RequestMapping("api/")
@AllArgsConstructor
public class BlogpostController {

    private final blogPostRepo blogPostRepo;

    @GetMapping("posts")
    List<BlogPost> all() {
        return blogPostRepo.findAll();
    }


    @PutMapping("posts")
    BlogPost replaceBlogpost(@RequestBody BlogPost newBlogPost) {

        return blogPostRepo.findById(newBlogPost.getId())
                .map(post -> {
                    post.setTitle(newBlogPost.getTitle().isEmpty()?post.getTitle():newBlogPost.getTitle());
                    post.setDescription(newBlogPost.getDescription().isEmpty()?post.getDescription():newBlogPost.getDescription());
                    return blogPostRepo.save(post);
                })
                .orElseGet(() -> blogPostRepo.save(newBlogPost));
    }

    @PostMapping("posts")
    BlogPost newBlogPost(@RequestBody BlogPost newBlogPoat) {
        return blogPostRepo.save(newBlogPoat);
    }
    @DeleteMapping("posts/{id}")
    void deleteBlogPost(@PathVariable Integer id){
         blogPostRepo.deleteById(id);
    }
}
