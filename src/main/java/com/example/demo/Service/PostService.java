package com.example.demo.Service;

import com.example.demo.Model.Post;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Arrays;

@Service
public class PostService {
    private final List<Post> POSTS = Arrays.asList(
            new Post("post1"), new Post("post2"), new Post("post3")
    );

    public List<Post> listAllPosts() {
        return this.POSTS;
    }
}
