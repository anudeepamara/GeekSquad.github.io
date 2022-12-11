package com.gvsu.zomato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gvsu.zomato.entity.Food;

@Repository
public interface FoodRepository  extends JpaRepository<Food, Integer>{

}
