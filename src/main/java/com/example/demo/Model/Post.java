package com.example.demo.Model;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post() { }

    public Post(String text) {
        this.text = text;
        this.likes = 0;
        this.creationDate = new Date();
    }

    public Long getId() {
        return this.id;
    }

    public String getText() {
        return this.text;
    }

    public Integer getLikes() {
        return this.likes;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
