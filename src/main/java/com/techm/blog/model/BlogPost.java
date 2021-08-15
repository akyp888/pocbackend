package com.techm.blog.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "blogPost")
public class BlogPost {

    @Id @GeneratedValue
    private Integer id;
    private String title;
    private String description;

}
