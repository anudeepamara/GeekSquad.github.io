package com.gvsu.zomato.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gvsu.zomato.entity.Admin;
import com.gvsu.zomato.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository repo;

	public List<Admin> getAdmins() {
		
		return repo.findAll();
	}

}
