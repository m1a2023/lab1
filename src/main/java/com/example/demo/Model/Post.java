package com.example.demo.Model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(String text) {
        this.text = text;
        this.likes = 0;
        this.creationDate = new Date();
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
}
