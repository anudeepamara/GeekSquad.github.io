package com.gvsu.zomato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gvsu.zomato.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
