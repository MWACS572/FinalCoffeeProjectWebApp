package edu.mum.coffee.RestService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.coffee.domain.Person;
import edu.mum.coffee.service.PersonService;

@RestController
public class PersonRestService {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value="/createPerson", method=RequestMethod.POST)
	public @ResponseBody Person createPerson(@RequestBody Person person){
		return personService.savePerson(person);
	}
	
	@RequestMapping(value="/findAllPersons", method=RequestMethod.GET)
	public @ResponseBody List<Person> findAllPersons(){
		return personService.findAllPersons();
	}
	
	@RequestMapping(value="/updatePerson/{id}", method=RequestMethod.PUT)
	public @ResponseBody Person updatePerson(@PathVariable("id") int id, @RequestBody Person person){
		System.out.println(person.getFirstName() + " first");
		person.setId(id);
		return personService.savePerson(person);
	}
	
}
