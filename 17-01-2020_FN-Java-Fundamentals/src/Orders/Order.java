package Orders;

import java.util.ArrayList;
import java.util.List;

import Products.Product;

public class Order {
	public int id;
	public  String username;
	public List<Product> listOfProduct;
	public boolean isCartEmpty ;
	
	public Order(int id, String username) {
		this.id = id;
		this.username = username;
		this.isCartEmpty = true;
		listOfProduct = new ArrayList<Product>();
	}
	
	public void deleteProduct(int id) {
		if(this.isCartEmpty == true)
			System.out.println("No Items in cart");
		else {
			for(int i = 0; i < this.listOfProduct.size(); i++) {
				if(this.listOfProduct.get(i).id == id) {
					this.listOfProduct.remove(i);			
				}
			}	
		}
		
	}
	
	public void addProduct(int id, String name, int quantity, float rate) {
		this.isCartEmpty = false;
		this.listOfProduct.add(new Product(id, name, quantity, rate));		
		System.out.println("Product added");
	}
	
	public void viewProducts() {		
			for(int i = 0; i < this.listOfProduct.size(); i++) {
				System.out.println(this.listOfProduct.get(i).id + ", " + 
						this.listOfProduct.get(i).name + ", " + 
							this.listOfProduct.get(i).quantity+ ", " + 
								this.listOfProduct.get(i).rate);
			}
	}
	

	public void placeOrder() {
		System.out.println("Order placed");
	}
	
	public void cancelOrder() {
		System.out.println("order canceled");
	}
	
}
