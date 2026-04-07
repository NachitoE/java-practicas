package ejercicio6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class Database {

	private static String CONNECTION_STRING = "jdbc:mysql://localhost/javaMarket?user=root&password=1234";
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("loaded driver");
		}catch(ClassNotFoundException e) {
			System.out.println("err loading driver");
			e.printStackTrace();
		}
	}

	public static LinkedList<Product> getAll(){
		LinkedList<Product> products = new LinkedList<Product>();
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(CONNECTION_STRING);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from product");
			
			while(rs.next()) {
				Product p = new Product();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setDescription(rs.getString("description"));
				p.setPrice(rs.getDouble("price"));
				p.setStock(rs.getInt("stock"));
				p.setShippingIncluded(rs.getBoolean("shippingIncluded"));
				products.add(p);
			}
			if(rs != null) {
				rs.close();
			}
			if(st != null) {
				st.close();
			}
			
			conn.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			
		}
		return products;
		
	}
	
	public static Product getById(int id){
		Product p = null;
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(CONNECTION_STRING);
			PreparedStatement pst = conn.prepareStatement("select * from product where id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				p = new Product();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setDescription(rs.getString("description"));
				p.setPrice(rs.getDouble("price"));
				p.setStock(rs.getInt("stock"));
				p.setShippingIncluded(rs.getBoolean("shippingIncluded"));
			}
		}
		catch(SQLException e) {
			
		}
		finally {
			
		}
		
		return p;
		
	}
	
	public static void createProduct(Product p) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(CONNECTION_STRING);
			
		}
		catch(SQLException e) {
			
		}
		finally {
			
		}
	}
}
