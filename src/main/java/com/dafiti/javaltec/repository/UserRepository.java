package com.dafiti.javaltec.repository;

import com.dafiti.javaltec.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User, String> {
}
