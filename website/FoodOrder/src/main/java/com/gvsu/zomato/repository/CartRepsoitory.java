package com.gvsu.zomato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gvsu.zomato.entity.Cart;

@Repository
public interface CartRepsoitory  extends JpaRepository<Cart, Integer>{

}
