package com.estore.service;

import java.util.ArrayList;
import java.util.List;

import com.estore.exceptions.ProductNotFoundException;
import com.estore.pojo.Cart;
import com.estore.pojo.Product;

public class CartServiceImp implements ICartService {

	static List<Product> productList = new ArrayList<Product>();

	public static Cart cart;

	static {

		cart = new Cart(101, "javeed", productList, "Hyderabad India");

	}

	@Override
	public boolean addProduct(Product product) {

		return productList.add(product);
	}

	@Override
	public Product removeProduct(int index) throws ProductNotFoundException {

		if (!productList.isEmpty()) { // list not empty

			Product product = productList.remove(index);
			return product;
		}

		else {

			throw new ProductNotFoundException();

		}

	}

	@Override
	public List<Product> displayAllProduct() {

		return productList;
	}

}
