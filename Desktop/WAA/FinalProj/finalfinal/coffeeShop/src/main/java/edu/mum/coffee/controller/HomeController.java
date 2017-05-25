package edu.mum.coffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.mum.coffee.service.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping({"/", "/index", "/home"})
	public String homePage(Model model) {
		model.addAttribute("productList", productService.getAllProduct());
		return "listProduct";
	}
	
	@GetMapping({"/admin"})
	public String adminPage(){
		return "admin";
	}
	
	@GetMapping({"/user"})
	public String userPage(){
		return "user";
	}
	@GetMapping({"/personDetail"})
	public String startPage(){
		return "personDetails";
	}
	@GetMapping({"/secure"})
	public String securePage() {
		return "secure";
	}
}
