package dev.zilvis.dockerapitest2.services;

import dev.zilvis.dockerapitest2.models.PostModel;
import dev.zilvis.dockerapitest2.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public PostModel createPost(PostModel postModel) {
        return postRepository.save(postModel);
    }

    public List<PostModel> getAllPosts() {
        return postRepository.findAll();
    }

    public PostModel getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public void deletePostById(Long id) {
        postRepository.deleteById(id);
    }

    public PostModel updatePost(PostModel postModel) {
        return postRepository.save(postModel);
    }
}
