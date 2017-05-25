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
import edu.mum.coffee.service.PersonService;

@Controller
public class UserController {
	
	@Autowired
	PersonService personService;

	@RequestMapping(value="/findAccountProfileByEmail" , method=RequestMethod.GET)
	public String findByEmail(Model model){
		model.addAttribute("person", new Person());
		return "/enterEmail";
	}
	@RequestMapping(value = "/updateUserPerson", method=RequestMethod.POST)
	public String updatePerson(@ModelAttribute("person") Person person, Model model){
		model.addAttribute("person", personService.findByEmail(person.getEmail()));
		return "listPersonForEdit";
		
		
}
//	@RequestMapping(value="/updateUserPerson1/{email}", method=RequestMethod.GET)
//	public String listPerson(@PathVariable("email") String email, Model model){
//		model.addAttribute("person", personService.findByEmail(email));
//		return "listPersonForEdit";
//	}
	@RequestMapping(value = "/updatePersonInfo/{id}", method=RequestMethod.GET)
	public String updateProduct(@PathVariable("id") int id, Model model){
		model.addAttribute("person", personService.findById(id));
		return "updatePerson";
	}
	
	@RequestMapping(value = "/updatePerson", method=RequestMethod.POST)
	public String updateProduct(@ModelAttribute("person") Person person){
		System.out.println("person "+person.getEmail()+" id ");
		
		personService.savePerson(person);
		
		return "user";
	}
}
