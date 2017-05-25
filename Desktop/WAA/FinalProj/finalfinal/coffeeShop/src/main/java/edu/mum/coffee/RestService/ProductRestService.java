package edu.mum.coffee.RestService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.coffee.domain.Product;
import edu.mum.coffee.service.ProductService;

@RestController
public class ProductRestService {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/createProduct",  method=RequestMethod.POST)
	public @ResponseBody Product createProduct(@RequestBody Product product){
		
		return productService.save(product);
	}
	
	
	@RequestMapping(value = "/findAllProducts",  method=RequestMethod.GET)
	public @ResponseBody List<Product> findAllProducts(){
		
		return productService.getAllProduct();
	}
	
	@RequestMapping(value = "/deleteProduct/{id}",  method=RequestMethod.DELETE)
	public @ResponseBody void deleteProducts(@PathVariable int id){
		
		productService.delete(productService.getProduct(id));
	}
	
	@RequestMapping(value = "/updateProduct/{id}",  method=RequestMethod.PUT)
	public @ResponseBody Product updateProduct(@PathVariable int id, @RequestBody Product product){
		product.setId(id);
		return productService.save(product);
	}
}
