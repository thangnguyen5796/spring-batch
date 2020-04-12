package com.example.thangnv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.thangnv.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
