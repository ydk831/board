package com.mypjt.board.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypjt.board.model.entity.User;

public interface SignUpRepository extends JpaRepository<User, String>{
    // Optional<User> findById(String id);
}
