package Models;


import java.sql.*;

public class testmodel {
	
		public static  void main(String [] args) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/E_commerce","root","missour.1422");
				PreparedStatement st = con.prepareStatement("insert into products values("+null+",?,?,?,?)");
				st.setString(1, "za");
				st.setString(2, "ee");
				st.setFloat(3, 4);
				st.setInt(4, 45);
				st.executeUpdate();
				con.close();

				} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
}}
