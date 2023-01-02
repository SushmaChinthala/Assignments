package com.springboot.using.mongodb.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import  com.springboot.using.mongodb.bean.Product;
import com.springboot.using.mongodb.repository.ProductRepository;
@Service
public class ProductService 
{
	 @Autowired
	    private ProductRepository productRepo;

	    public List<Product> getAllProducts() {
	        return  productRepo.findAll();
	    }

	    public Product getProduct(int id) {
	        return productRepo.findById(id).get();
	    }

	    public Product addProduct(Product product) {
	        return productRepo.insert(product);
	    }

	    public boolean deleteProduct(int id) {
	        productRepo.deleteById(id);
	        return true;

	    }

	    public boolean updateProduct(Product product, int id) {

	        if(productRepo.existsById(id)){
	            productRepo.save(product);
	            return true;
	        }
	        else
	            return false;
	    }
	}

	





