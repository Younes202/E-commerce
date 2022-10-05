package Models;

import java.util.Iterator;
public class testmodel {
	
		public static  void main(String [] args) {
			
			operation list = new operation();
			product pr = new product();
			list.add(new product(1,"tide1","desc1",171,1));
			list.add(new product(2,"tide2","desc2",172,2));
			list.add(new product(3,"tide3","desc3",173,3));
			list.add(new product(4,"tide4","desc4",174,4));
			list.add(new product(5,"tide5","desc5",175,5));
			
			
			
			Iterator<product> prds = list.getAll().iterator(); // iterator is a list that remove the latest iteration when we loop in the list is the best of the memory
			while(prds.hasNext())
			{
				product prd = prds.next();
				prd.show();
			}
			
		}
}
