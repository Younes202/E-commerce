package Models;

import java.util.ArrayList;
import java.util.List;

public class operation {

	ArrayList<product> products = new ArrayList<product>();
	product foundproduct;

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
	
	public void Search(long id) {
			for(product p:products)
			{
				if(p.getId()==id)
				{
					foundproduct=p;
					break;
				}
			}
			if(foundproduct!=null)
			
				System.out.println("The product is found " +foundproduct.getName());
			
			else
				System.out.println("The product isn't find ");		
			
	}
	
	
	
}
