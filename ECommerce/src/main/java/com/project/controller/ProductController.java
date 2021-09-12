package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Product;
import com.project.model.Product_Category;
import com.project.repo.ProductCategoryRepo;
import com.project.repo.ProductRepo;

@CrossOrigin("http://localhost:4200")

public class ProductController {
	@Autowired
	ProductRepo productRepo;
	@Autowired
	ProductCategoryRepo productCategoryRepo;
	
	
	 @PostMapping("/products") 
	 public void create(@RequestBody Product product) {
		 productRepo.save(product); 
	  }
	  
	 @PostMapping("/productCat") 
	 public void create(@RequestBody Product_Category productcategory) {
		 productCategoryRepo.save(productcategory); 
	 }
	 
	
	@GetMapping(path="/products", produces = {"application/json"})
	public Iterable<Product> getAllProduct(){
		return productRepo.findAll();
	}
	
	@GetMapping(path="/productCat", produces = {"application/json"})
	public Iterable<Product_Category> getAllProductCat(){
		return productCategoryRepo.findAll();
	}
	

}
