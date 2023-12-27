package com.cms.content_management_system.controller;

import com.cms.content_management_system.entity.Post;
import com.cms.content_management_system.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;
    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }
    @GetMapping("/{pId}")
    public Post getPostById(@PathVariable Integer pId) {
        return postService.getPostById(pId);
    }
    @PostMapping
    public void savePost(@RequestBody Post post) {
        postService.savePost(post);
    }
    @DeleteMapping("/{pId}")
    public void deletePostById(@PathVariable Integer pId) {
        postService.deletePostById(pId);
    }
}
