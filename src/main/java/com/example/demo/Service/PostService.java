package com.example.demo.Service;

import com.example.demo.Model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>();

    @Autowired
    PostRepository postRepository;

    public List<Post> listAllPosts() {
        return StreamSupport.stream(postRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public void create(final String text) {
        Post post = new Post(text);
        posts.add(post);
        postRepository.save(post);
    }
}