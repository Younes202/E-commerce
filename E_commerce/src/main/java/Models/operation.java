package Models;

import java.sql.*;
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

	public void adding(product p)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/E_commerce","root","missour.1422");
			PreparedStatement st = con.prepareStatement("insert into products values(NULL,?,?,?,?)");
			st.setString(1, p.getName());
			st.setString(2, p.getDesc());
			st.setFloat(3, p.getPrice());
			st.setInt(4, p.getEtat());
			st.executeUpdate();
			con.close();

			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//products.add(p);
	}
	
	public void Display(){
	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/E_commerce","root","missour.1422");
			Statement st = con.craeteStatement();
			ResultSet res = st.execute.Query("select *from products"); 
			
			st.execute();
			con.close();

			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//products.add(p);
	
	}
	
	public void remove(long id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/E_commerce","root","missour.1422");
			PreparedStatement st = con.prepareStatement("delete from products where id=?);
			st.setLong(1, id);
			st.executeUpdate();
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//products.add(p);
	}
								    
								    
	   public static void Update(product new_data,String name_up) {
        try {
     		Class.forName("com.mysql.cj.jdbc.Driver"); 
     		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Personne","root","");
     		PreparedStatement st = con.prepareStatement("updtae personne set Name =? , LastName =? , Phone=?,Age=?  where Name = name_up");
     		st.setString(1,new_data.Name);
     		st.setString(2,new_data.desc);
     		st.setFloat(3,new_data.price);
     		st.setInt(4,new_data.etat);
     		st.setString(1,name_up);
     		st.executeUpdate();
     		System.out.println("updating of  Of data Effected");
        }catch(Exception e){
     	   System.out.println(e);
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
