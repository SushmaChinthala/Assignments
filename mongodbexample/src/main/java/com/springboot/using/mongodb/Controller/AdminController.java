package com.springboot.using.mongodb.Controller;
import com.springboot.using.mongodb.service.ProductService;
import com.springboot.using.mongodb.bean.Product;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController

 public class AdminController 
{
	

	    @Autowired
	    private ProductService productService;


	    @GetMapping("/products")
	    public List<Product> getAllProducts() {
	        return productService.getAllProducts();
	    }

	    @GetMapping( "/products/{id}")
	    public Product getProduct(@PathVariable int id) {
	        return productService.getProduct(id);
	    }

	    @PostMapping("/products")
	    public Product addProduct(@RequestBody Product product) {
	        return productService.addProduct(product);
	    }

	    @DeleteMapping("/products/{id}")
	    public boolean deleteProduct(@PathVariable int id) {
	        return productService.deleteProduct(id);
	    }

	    @PutMapping("/products/{id}")
	    public boolean deleteProduct(@RequestBody Product product,@PathVariable int id) {
	        return productService.updateProduct(product,id);
	    }
	}

