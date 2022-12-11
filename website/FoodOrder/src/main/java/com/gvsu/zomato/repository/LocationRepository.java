package com.gvsu.zomato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gvsu.zomato.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

public Location findBylocationState(String locationName);

}
