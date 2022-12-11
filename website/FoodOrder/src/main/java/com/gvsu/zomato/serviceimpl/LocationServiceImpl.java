package com.gvsu.zomato.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gvsu.zomato.entity.Location;
import com.gvsu.zomato.repository.LocationRepository;
import com.gvsu.zomato.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository repo;


	@Override
	public List<Location> listAll() {
		return repo.findAll();
	}

}
