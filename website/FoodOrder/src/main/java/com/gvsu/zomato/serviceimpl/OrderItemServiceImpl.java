package com.gvsu.zomato.serviceimpl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gvsu.zomato.controller.Usercontroller;
import com.gvsu.zomato.entity.Cart;
import com.gvsu.zomato.entity.Food;
import com.gvsu.zomato.entity.OrderItems;
import com.gvsu.zomato.entity.Restuarent;
import com.gvsu.zomato.entity.User;
import com.gvsu.zomato.repository.CartRepsoitory;
import com.gvsu.zomato.repository.OrderItemsRepository;
import com.gvsu.zomato.service.OrderItemsService;

@Service
public class OrderItemServiceImpl implements OrderItemsService {

	static int userId = 0;

	private User user = null;

	@Autowired
	private OrderItemsRepository repo;

	@Autowired
	private CartRepsoitory cartrepo;

	@Override
	public List<OrderItems> getAllItems() {
		return repo.findAll();
	}

	@Override
	public OrderItems additem(OrderItems orderitems) {

		List<Cart> carts = cartrepo.findAll();
		List<Cart> cart = new LinkedList<Cart>();

		userId = new Usercontroller().userId();
		for (Cart c : carts) {
			if (c.getUser().getUserId() == userId) {
				cart.add(c);
			}
		}
		List<Food> foods = new LinkedList<Food>();
		OrderItems item = new OrderItems();

		for (Cart c1 : cart) {
			foods.addAll(c1.getFood());
		}
		Restuarent re = null;
		for (Food food : foods) {
			re = food.getRestuarent();
		}
		item.setFood(foods);
		LocalDate date = LocalDate.now();
		item.setDate(date);
		LocalTime time = LocalTime.now();
		item.setTime(time);
		item.setRestuarent(re);
		item.setUser(user);

		return repo.save(item);

	}

	@Override
	public Map<OrderItems, List<Food>> gethistory() {

		List<OrderItems> list = repo.findAll();
		System.out.println("hi");
		System.out.println(list.toString());

		userId = new Usercontroller().userId();
		Map<OrderItems, List<Food>> map = new HashMap<OrderItems, List<Food>>();

		for (OrderItems i : list) {
			List<Food> foods1 = i.getFood();
			List<Food> foods = new ArrayList<Food>();

			if (i.getUser().getUserId() == userId) {
				System.out.println(i.getUser().getUserId() + "" + userId);
				foods.addAll(foods1);
				map.put(i, foods);
			}

		}

		return map;
	}
}
