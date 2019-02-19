package com.dafiti.javaltec.controller;

import com.dafiti.javaltec.entity.User;
import com.dafiti.javaltec.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/{id}")
    public Mono<User> findById(@PathVariable String id) {
        return userRepository.findById(id);
    }

    @GetMapping("/")
    public Flux<User> findAll() {
        return userRepository.findAll();
    }

    @PostMapping
    public Mono<User> create(@RequestBody User user) {
        log.info("Creating user: {}", user);
        return userRepository.save(user);
    }

    @PatchMapping("/{id}")
    public Mono<User> update(@PathVariable String id, @RequestBody User user) {
        user.setId(id);
        return userRepository.save(user);
    }

}
