package edu.mum.coffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.coffee.domain.Person;
import edu.mum.coffee.domain.Product;
import edu.mum.coffee.service.OrderService;
import edu.mum.coffee.service.PersonService;
import edu.mum.coffee.service.ProductService;

@Controller
public class AdminController {
	
	@Autowired
	ProductService productService;
	@Autowired 
	PersonService personService;
	@Autowired
	OrderService orderService;
	
	@RequestMapping(value="/createProduct" , method=RequestMethod.GET)
	public String createProduct(Model model){
		model.addAttribute("product", new Product());
		return "/createProducts";
	}
	@RequestMapping(value = "/create", method=RequestMethod.POST)
	public String createProduct(@ModelAttribute("command") Product product){
		System.out.println("player "+product.getDescription());
		productService.save(product);
		
		return "admin";
	}
	
	@RequestMapping(value = "/listProduct", method=RequestMethod.GET)
	public String getAllProducts(Model model){
		model.addAttribute("productList", productService.getAllProduct());
		return "listProductsForAdmin";
	}
	
	@RequestMapping(value = "/updateProduct/{id}", method=RequestMethod.GET)
	public String updateProduct(@PathVariable("id") int id, Model model){
		model.addAttribute("command", productService.getProduct(id));
		return "updateProduct";
	}
	
	@RequestMapping(value = "/updateProduct", method=RequestMethod.POST)
	public String updateProduct(@ModelAttribute("command") Product product){
		System.out.println("player "+product.getDescription()+" id ");
		
		productService.save(product);
		
		return "admin";
	}
	
	@RequestMapping(value = "/deleteProduct/{id}", method=RequestMethod.GET)
	public String deleteProduct(@PathVariable("id") int id, Model model){
		//model.addAttribute("command", playerService.get(id));
		productService.delete(productService.getProduct(id));
		return "redirect:/admin";
	}
	@RequestMapping(value="/createPersons" , method=RequestMethod.GET)
	public String createPerson(Model model){
		model.addAttribute("person", new Person());
		return "/createPerson";
	}
	@RequestMapping(value = "/createPersons", method=RequestMethod.POST)
	public String createPerson(@ModelAttribute("person") Person person){
		System.out.println("person "+person.getFirstName());
		personService.savePerson(person);
		
		return "admin";
	}
	@RequestMapping(value = "/listAllPersons", method=RequestMethod.GET)
	public String getAllPersons(Model model){
		model.addAttribute("personList", personService.findAllPersons());
		return "listPersonsForAdmin";
	}
	
	@RequestMapping(value = "/listAllOrders", method=RequestMethod.GET)
	public String getAllOrders(Model model){
		model.addAttribute("orderList", orderService.findAll());
		return "listOrdersForAdmin";
	}
}
