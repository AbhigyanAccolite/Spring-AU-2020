package Products;

import java.util.List;

public class Product {
	 public int id;
     public	 String name;
	 public int quantity;
	 public float rate;

	public Product(int id, String name, int quantity, float rate) {
		this.id = id;
		this.name  = name;
		this.quantity = quantity;
		this.rate = rate;	
	}	
	
	static 	public void displayAllProducts(List<Product> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).id + ", " + 
					list.get(i).name + ", " + 
						list.get(i).quantity+ ", " + 
							list.get(i).rate);
		}
	}
	
	
}
