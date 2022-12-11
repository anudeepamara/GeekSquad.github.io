package com.gvsu.zomato.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gvsu.zomato.repository.OrdersRepository;
import com.gvsu.zomato.service.OrderService;

@Service
public class OrdersServiceimpl implements OrderService{
	
	@Autowired
	private OrdersRepository repo;

}
