package com.gvsu.zomato.controller;

import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gvsu.zomato.entity.User;
import com.gvsu.zomato.serviceimpl.UserServiceImpl;

@Controller
public class RootController {

	static int userId = 0;

	@Autowired
	private SmtpMailSender smtpMailSender;

	@Autowired
	private UserServiceImpl service;

	@RequestMapping("/send-mail")
	public String sendMail() throws MessagingException {

		userId = new Usercontroller().userId();
		List<User> users = service.getAllUser();
		User us = null;
		int j = Usercontroller.k;
		System.out.println(j);
		for (User u1 : users) {
			if (u1.getUserId() == j) {
				us = u1;
			}
		}

		smtpMailSender.send(us.getEmail(), "ADMIN has Changed Ur password for Acess here is the new password",
				"New Password is :" + us.getPassword());
		return "adminhomepage";
	}

}
