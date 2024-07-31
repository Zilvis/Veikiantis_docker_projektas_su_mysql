package dev.zilvis.dockerapitest2.controllers;

import dev.zilvis.dockerapitest2.models.PostModel;
import dev.zilvis.dockerapitest2.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping
    public PostModel post(@RequestBody PostModel postModel) {
        return postService.createPost(postModel);
    }


    @PutMapping
    public PostModel update(@RequestBody PostModel postModel) {
        return postService.updatePost(postModel);
    }

    @GetMapping
    public PostModel getPostById(@RequestParam Long id) {
        return postService.getPostById(id);
    }

    @DeleteMapping
    public void deletePostById(@RequestParam Long id) {
        postService.deletePostById(id);
    }
}
