package edu.mum.coffee.RestClient;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import edu.mum.coffee.domain.Address;
import edu.mum.coffee.domain.Order;
import edu.mum.coffee.domain.Orderline;
import edu.mum.coffee.domain.Person;
import edu.mum.coffee.domain.Product;
import edu.mum.coffee.domain.ProductType;
import edu.mum.coffee.service.OrderService;
import edu.mum.coffee.service.PersonService;
import edu.mum.coffee.service.ProductService;

public class OrderRestClient {
	
	@Autowired
	private OrderService orderService;
	@Autowired
	private ProductService productService;
	@Autowired
	private PersonService personService;
	
	
	public static void main(String[] args) {
		OrderRestClient client1 = new OrderRestClient();
		//client1.createOrder();
		client1.findAllOrders();

	}
	public void createOrder(){
		
//		Address address = new Address("Ottowan", "FL", "USA", "12123");
//		Person person2 = new Person("Rob2", "Will2", "rob@yahoo.com", address, "123-456-7890", true);
//		Product product = new Product("coffee3", "Africa21", 1212, ProductType.LUNCH);
//		Orderline orderLine = new Orderline(1, product, new Order("2017/08/07", person2));
//		ArrayList<Orderline> orderLineList = new ArrayList();
//		orderLineList.add(orderLine);
//		Order order1 = new Order("2017/08/07", person2 );
//		
//		//Orderline orderline = new Orderline(1,  );
//		
//		Client client = ClientBuilder.newClient();
//		Response response = client.target("http://localhost:8080/createOrder").request().post(Entity.json(order1));
//		if(response.getStatus()!=200){
//			System.out.println("error");
//		}
//		Order ord = response.readEntity(Order.class);
//		System.out.println(ord.getOrderDate());
//		
//		
		
	}
	
	public void findAllOrders(){
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://localhost:8080/findAllOrders").request().get();
		if(response.getStatus()!=200){
			System.out.println("error");
		}
		String or= response.readEntity(String.class);
		System.out.println(or);
		List<Order> order = response.readEntity(new GenericType<List<Order>>(){});
		for(Order per: order){
			System.out.println(per.getOrderDate());
		}
	}
}
