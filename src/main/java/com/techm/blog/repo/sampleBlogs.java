package com.techm.blog.repo;

import com.techm.blog.model.BlogPost;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@AllArgsConstructor
public class sampleBlogs {

    private static final Logger log = LoggerFactory.getLogger(sampleBlogs.class);


    @Bean
    CommandLineRunner initDatabase(blogPostRepo repo) {

        return args -> {
            log.info("Preloading " + repo.save(BlogPost.builder().id(1).title("ass").description("hole").build()));
            log.info("Preloading " + repo.save(BlogPost.builder().id(2).title("ass").description("hole").build()));
            log.info("Preloading " + repo.save(BlogPost.builder().id(3).title("ass").description("hole").build()));
            log.info("Preloading " + repo.save(BlogPost.builder().id(4).title("ass").description("hole").build()));
        };
    }
}