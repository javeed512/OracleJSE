package com.estore.presentation;

import java.util.List;
import java.util.Scanner;

import com.estore.exceptions.ProductNotFoundException;
import com.estore.pojo.Product;
import com.estore.service.CartServiceImp;
import com.estore.service.ICartService;

public class Client {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean flag = true;

		ICartService service = new CartServiceImp(); // Polymorphism using Interface

		while (flag) {

			System.out.println("******WELCOME TO E-Store*****");
			System.out.println("1. Add Product");
			System.out.println("2. Remove Product");
			System.out.println("3.  Show All Products");
			System.out.println("4.  Display Cart Details");
			System.out.println("0.  Exit");

			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				
				Product product =		getProductDetails();

				boolean isAdded = service.addProduct(product);

				if (isAdded) {

					System.out.println("Product Successfully Added to the Cart");
				} else {

					System.err.println("Product Add Failed");

				}

				break;
			case 2:

				System.out.println("Enter Product Index to Delete Product ");

						int index = scanner.nextInt();
				try {	
						
					Product deletedProduct =	service.removeProduct(index);
					
					
					if (deletedProduct != null) {

						System.err.println("Product Successfully Deleted from  the Cart");
					} 
					
				}
				catch(ProductNotFoundException pe) {
					
					System.err.println("Product Not Found , Product delete failed , List is Empty");
				}


				break;
			case 3:

				List<Product> list = service.displayAllProduct();

					int index1 = 0;
				
			  
					for (Product product2 : list) {
						
						
						System.out.println(index1 +"  "+product2);
						
						index1++;
						
					}
					
					
				break;
				
				
			case 4:
				
						System.out.println(CartServiceImp.cart);
					
				break;
				
			case 0:

				flag = false;

				System.out.println("Thank you for Shopping , visit again..");

				break;

			default:
				
				System.err.println("Invalid Option");

			}

		}

	}

	public static Product getProductDetails() {

		System.out.println("Enter ProductId");
		int productId = scanner.nextInt();
		System.out.println("Enter Product Name");
		String productName = scanner.next();
		System.out.println("Enter Product Price");
		double price = scanner.nextDouble();

		Product product = new Product(productId, productName, price); // Encapsulation

		return product;
	}

}
