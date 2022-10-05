package Models;

import java.util.ArrayList;
import java.util.List;

public class operation {
	
	ArrayList<product> products = new ArrayList<product>();
	
	
	public ArrayList<product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<product> products) {
		this.products = products;
	}

	public void add(product p)
	{
		products.add(p);
	}
	
	public void remove(long id) {
		for(product p:products)
		{
			if(p.getId()==id)
			{
				products.remove(p);
				break;
			}	
		}
	}
	public 	ArrayList<product> getAll() {
		
		return products;
	}
	
	
	

}
