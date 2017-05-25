package edu.mum.coffee.RestService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.coffee.domain.Order;
import edu.mum.coffee.service.OrderService;

@RestController
public class OrderRestService {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/createOrder", method=RequestMethod.POST)
	public @ResponseBody Order createOrder(@RequestBody Order order){
		return orderService.save(order);
	}
	
	@RequestMapping(value="/findAllOrders", method=RequestMethod.GET)
	public @ResponseBody List<Order> findAllOrders(){
		return orderService.findAll();
	}
	
}
