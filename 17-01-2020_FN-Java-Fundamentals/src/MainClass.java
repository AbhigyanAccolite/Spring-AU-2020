import Products.Product;
import Orders.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainClass {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		List<Order> orders  = new ArrayList<>();
		System.out.println("ID, NAME, QUANTITY, RATE");
		products.add(new Product(1, "book", 10, 5));
		products.add(new Product(2, "cup", 110, 1000));
		products.add(new Product(3, "coffee", 40, 453));
		products.add(new Product(4, "mug", 30, 200));
		
		Product.displayAllProducts(products);
		
		int userId = 0;
	
		while(true) {
			
			Scanner kb = new Scanner(System.in);
			System.out.println("Enter Username");
			String username = kb.nextLine();	
			Order order = new Order(userId++, username);
			System.out.println("1.  Add a product");
			System.out.println("2.  Remove a product from the cart");
			System.out.println("3.  View the items in the cart");
			System.out.println("4.  Place the order");
			System.out.println("5.  Cancel the order");
			System.out.println("\n input the above number: ");
			
			int number = kb.nextInt();
			
			
			switch(number) {
				case 1: {
					System.out.println("Input Product ID:");
					int id = kb.nextInt();
					for(int i = 0; i < products.size(); i++) {
						if(products.get(i).id == id) {							
							order.addProduct(products.get(i).id, products.get(i).name,
									products.get(i).quantity,products.get(i).rate);
						}
					}
					break;
				}
					
				case 2: {					
					System.out.println("Input Product ID:");
					int id = kb.nextInt();
					order.deleteProduct(id);
					break;
				}
				
				case 3: {
					order.viewProducts();
					break;
				}
				case 4: {
					orders.add(order);
					order.placeOrder();
					break;
				}
				case 5: {
					orders.remove(order);
					order.cancelOrder();
					break;
				}
				default:
					System.out.println("Wrong choice...try again");
					break;				
				
			}
			System.out.println("continue? [y/n]?");
			String input = kb.next();
			if(input.equals("y"))
				break;
		}
		
	}
}
