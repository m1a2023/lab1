package com.example.demo.Service;

import com.example.demo.Model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikesService {
    @Autowired
    PostService postService;
    @Autowired
    PostRepository postRepository;

    public Integer like(Long postId) {
        Post post = postService.listAllPosts().get(postId.intValue());
        post.setLikes(post.getLikes() + 1);
        postRepository.save(post);
        return post.getLikes();
    }
}
