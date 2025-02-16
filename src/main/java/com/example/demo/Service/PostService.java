package com.example.demo.Service;

import com.example.demo.Model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private static List<Post> posts = new ArrayList<>();

    public List<Post> listAllPosts() {
        return PostService.posts;
    }

    public void create(String text) {
        posts.add(new Post(text));
    }
}
