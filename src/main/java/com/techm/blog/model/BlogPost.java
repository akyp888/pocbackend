package com.techm.blog.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "blogPost")
@JsonFormat
public class BlogPost {

    @Id @GeneratedValue
    private Integer id;
    private String title;
    @Lob
    private String description;

}
