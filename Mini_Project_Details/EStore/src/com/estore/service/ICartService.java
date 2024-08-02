package com.estore.service;

import java.util.List;

import com.estore.exceptions.ProductNotFoundException;
import com.estore.pojo.Product;

public interface ICartService {
	
	
			public  boolean    addProduct(Product product);
	
			public  Product    removeProduct(int index) throws ProductNotFoundException;
			
			public List<Product>   displayAllProduct();

}
