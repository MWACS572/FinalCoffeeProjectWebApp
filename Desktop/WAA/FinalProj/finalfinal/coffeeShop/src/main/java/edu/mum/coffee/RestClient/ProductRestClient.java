package edu.mum.coffee.RestClient;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

//import javax.ws.rs.client.Client;
//import javax.ws.rs.client.ClientBuilder;
//import javax.ws.rs.core.Response;

//import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.ClientResponse;
//import com.sun.jersey.api.client.WebResource;

import edu.mum.coffee.domain.Product;
import edu.mum.coffee.domain.ProductType;

public class ProductRestClient {

	public static void main(String[] args) {

		ProductRestClient client1 = new ProductRestClient();
		client1.findAllProducts();
		//client1.createProduct();
		//client1.deleteProduct();
		//client1.updateProduct();

	}
	public void findAllProducts(){
		
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://localhost:8080/findAllProducts").request().get();
		if(response.getStatus()!=200){
			System.out.println("error");
		}
		List<Product> product = response.readEntity(new GenericType<List<Product>>(){});
		for(Product pro: product){
			System.out.println(pro.getDescription());
		}
	}
	
	public void createProduct(){
		Product product = new Product("book", "The Original", 34, ProductType.LUNCH);
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://localhost:8080/createProduct").request().post(Entity.json(product));
		if(response.getStatus()!=200){
			System.out.println("error");
		}
		Product prod = response.readEntity(Product.class);
		System.out.println(prod.getProductName());
	}
	public void deleteProduct(){
		Product product = new Product("book", "The Original", 34, ProductType.LUNCH);
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://localhost:8080/deleteProduct/1").request().delete();
		if(response.getStatus()!=200){
			System.out.println("error");
		}
		//Product prod = response.readEntity(Product.class);
		
	}
	
	public void updateProduct(){
		Product product = new Product("coffee3", "Africa21", 1212, ProductType.LUNCH);
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://localhost:8080/updateProduct/2").request().put(Entity.json(product));
		if(response.getStatus()!=200){
			System.out.println("error");
		}
		Product prod = response.readEntity(Product.class);
		System.out.println(prod.getProductName());
	}
}
