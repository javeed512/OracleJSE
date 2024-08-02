package com.estore.pojo;

import java.util.List;

public class Cart {
	
		private   int cartId;
		
		private   String  username;
		
		private  List<Product>  productList  ;
		
		private    String address;

		
		public Cart() {
			
			
		}
		
		public Cart(int cartId, String username, List<Product> productList, String address) {
			super();
			this.cartId = cartId;
			this.username = username;
			this.productList = productList;
			this.address = address;
		}

		public int getCartId() {
			return cartId;
		}

		public void setCartId(int cartId) {
			this.cartId = cartId;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public List<Product> getProductList() {
			return productList;
		}

		public void setProductList(List<Product> productList) {
			this.productList = productList;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			
			
			
		String data = "Cart [cartId=" + cartId + ", username=" + username + " address=" + address + "] \n";
		
			  productList.stream().forEach(System.out::println);
			  
			  return data;
		
		}
		
		
		
	
	

}
