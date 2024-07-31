package dev.zilvis.dockerapitest2.services;

import dev.zilvis.dockerapitest2.models.UserModel;
import dev.zilvis.dockerapitest2.repository.PostRepository;
import dev.zilvis.dockerapitest2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final PostRepository postRepository;

    public UserModel createUser(UserModel user) {
        userRepository.save(user);
        return user;
    }

    public UserModel getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public UserModel updateUser(UserModel user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
