package com.techm.blog.repo;

import com.techm.blog.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface blogPostRepo extends JpaRepository<BlogPost, Integer> {

}
