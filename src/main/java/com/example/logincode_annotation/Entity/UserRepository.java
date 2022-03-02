package com.example.logincode_annotation.Entity;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    Optional<UserEntity> findByname(String name);
    boolean existsByname(String name);

}
