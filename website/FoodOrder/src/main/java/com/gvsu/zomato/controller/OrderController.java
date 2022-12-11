package com.gvsu.zomato.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//import javax.xml.ws.soap.Addressing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gvsu.zomato.dto.searchDto;
import com.gvsu.zomato.entity.Food;
import com.gvsu.zomato.entity.OrderItems;
import com.gvsu.zomato.entity.User;
import com.gvsu.zomato.serviceimpl.OrderItemServiceImpl;

@Controller
public class OrderController {

	@Autowired
	private OrderItemServiceImpl orderservice;

	@Autowired
	private OrderItemServiceImpl service;

	@RequestMapping("/history")
	public String gethistory(Model model) {
		Map<searchDto, List<Food>> map = new HashMap<searchDto, List<Food>>();

		List<OrderItems> itemList = service.getAllItems();

		for (OrderItems i : itemList) {
			List<Food> foods1 = i.getFood();
			List<Food> foods = new LinkedList<Food>();
			foods.addAll(foods1);
			searchDto s = new searchDto();
			s.setOrderItemId(i.getOrderItemId());
			s.setDate(i.getDate());
			s.setTime(i.getTime());

			double sum = foods.stream().map(e -> e.getPrice()).reduce(0.0, (a, b) -> a + b);
			s.setTotalPrice(sum);

			map.put(s, foods);
		}

		model.addAttribute("map", map);
		return "history";
	}

	@RequestMapping("/paysuccess")
	public String paySucess(Model model, @ModelAttribute("OrderItems") OrderItems orderitems) {

		service.additem(orderitems);
		model.addAttribute("orderitems", orderitems);

		return "paymentsucess";

	}
	
	@RequestMapping("/redirect")
	public String nextpage(Model model, @ModelAttribute(name = "order") OrderItems order) {
		return "homepage";
	}


}
