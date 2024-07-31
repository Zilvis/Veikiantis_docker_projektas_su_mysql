package dev.zilvis.dockerapitest2.controllers;

import dev.zilvis.dockerapitest2.models.UserModel;
import dev.zilvis.dockerapitest2.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserModel createUser(@RequestBody UserModel userModel){
        return userService.createUser(userModel);
    }

    @GetMapping
    public UserModel getById(@RequestParam("id") long id){
        return userService.getUserById(id);
    }

    @PutMapping
    public UserModel updateUser(@RequestBody UserModel userModel){
        return userService.updateUser(userModel);
    }

    @DeleteMapping
    public void deleteUserById(@RequestParam("id") long id){
        userService.deleteUser(id);
    }

}
