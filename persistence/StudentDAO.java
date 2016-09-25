package persistence;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Student;

public class StudentDAO extends DAO {
	
	public void Insert(Student s) throws Exception{
		
		OpenConnection();
		
		PreparedStatement stmt = conn.prepareStatement("INSERT INTO registerstudents.tbstudent (enrollment,name,gender,grade1,grade2)"
													 + " VALUES (? , ?, ?, ?, ?)");
		stmt.setInt(1, s.getEnrollment());
		stmt.setString(2, s.getName());
		stmt.setString(3, s.getGender());
		stmt.setDouble(4, s.getGrade1());
		stmt.setDouble(5, s.getGrade2());

		stmt.execute();
		stmt.close();
		
		CloseConnection();
	}	
	
	public List<Student> Search() throws Exception{
		OpenConnection();
		PreparedStatement stmt = conn.prepareStatement("SELECT enrollment,name,gender,grade1,grade2 FROM registerstudents.tbstudent");
		ResultSet rs = stmt.executeQuery();
		List<Student> Studentlist = new ArrayList<Student>();
		while(rs.next()){
			Student st = new Student(
					rs.getInt("enrollment"),
					rs.getString("name"),
					rs.getString("gender"),
					rs.getDouble("grade1"),
					rs.getDouble("grade2"));
					
					Studentlist.add(st);
		}
		
		rs.close();
		stmt.close();
		CloseConnection();
		return Studentlist;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
