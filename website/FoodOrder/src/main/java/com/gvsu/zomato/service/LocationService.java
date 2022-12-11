package com.gvsu.zomato.service;

import java.util.List;

import com.gvsu.zomato.entity.Location;

public interface LocationService {

	/**
	 * @return This method is used to get all the Locations.
	 */
	public List<Location> listAll();

}
