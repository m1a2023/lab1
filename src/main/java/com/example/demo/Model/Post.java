package com.example.demo.Model;

import java.util.Date;

public class Post {
    private final Long id;
    private final String text;
    private Integer likes;
    private final Date creationDate;

    private static Long idAutoincrement = 0L;

    public Post( String text) {
        this.id = idAutoincrement++;
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
