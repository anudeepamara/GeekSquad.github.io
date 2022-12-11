package com.gvsu.zomato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gvsu.zomato.entity.CartItems;

@Repository
public interface CartItemsRepository extends JpaRepository<CartItems, Integer> {

} 
