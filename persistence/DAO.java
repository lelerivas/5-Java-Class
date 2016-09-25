package persistence;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	Connection conn;
	
	public void OpenConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/RegisterStudents","root","123456");
	}
	
	public void CloseConnection() throws Exception{
		if(conn!= null){
			conn.close();
		}
	}
	
	public static void main(String[] args) {
		DAO dao = new DAO();
		try{
			dao.OpenConnection();
			dao.CloseConnection();
			System.out.println("Connection OK!");
		}catch(Exception e){
			System.out.println("Problem: "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	
}
