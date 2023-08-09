package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserEntity;

/**
 * ユーザー情報 Repository
 */
//1行追加
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
   
}