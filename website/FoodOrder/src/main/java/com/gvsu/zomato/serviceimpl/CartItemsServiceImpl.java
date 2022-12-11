package com.gvsu.zomato.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gvsu.zomato.repository.CartItemsRepository;
import com.gvsu.zomato.service.CartItemsService;

@Service
public class CartItemsServiceImpl implements CartItemsService {

	@Autowired
	private CartItemsRepository repo;

	
}
