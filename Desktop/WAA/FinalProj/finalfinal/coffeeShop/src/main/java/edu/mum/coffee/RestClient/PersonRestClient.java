package edu.mum.coffee.RestClient;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import edu.mum.coffee.domain.Address;
import edu.mum.coffee.domain.Person;
import edu.mum.coffee.domain.Product;
import edu.mum.coffee.domain.ProductType;
import edu.mum.coffee.repository.PersonRepository;
import edu.mum.coffee.service.PersonService;

public class PersonRestClient {
	
	
	private PersonService personService = new PersonService();
	
	public static void main(String[] args) {
		PersonRestClient client1 = new PersonRestClient();
		//client1.createPerson();
		client1.findAllPersons();
		//client1.updatePerson();
	}
	
	public void createPerson(){
		Address address = new Address("Ottowan", "FL", "USA", "12123");
		Person person = new Person("John", "Fol", "john@yahoo.com", address, "123-456-7890", true);
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://localhost:8080/createPerson").request().post(Entity.json(person));
		if(response.getStatus()!=200){
			System.out.println("error");
		}
		Person per = response.readEntity(Person.class);
		System.out.println(per.getFirstName());
	}
	
	public void findAllPersons(){
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://localhost:8080/findAllPersons").request().get();
		if(response.getStatus()!=200){
			System.out.println("error");
		}
		List<Person> person = response.readEntity(new GenericType<List<Person>>(){});
		for(Person per: person){
			System.out.println(per.getFirstName());
		}
	}
	
	public void updatePerson(){
		 
		
	
		Address address = new Address("Ottowan", "FL", "USA", "12123");
		Person person2 = new Person("Rob2", "Will2", "rob@yahoo.com", address, "123-456-7890", true);
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://localhost:8080/updatePerson/1").request().put(Entity.json(person2));
		if(response.getStatus()!=200){
			System.out.println("error");
		}
		Person per = response.readEntity(Person.class);
		System.out.println(per.getFirstName());
	}

}
