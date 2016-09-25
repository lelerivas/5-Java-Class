package execution;

import datasentry.EntryStudentData;
import entity.Student;
import persistence.StudentDAO;

public class ExecutionStudent {
	
	public static void main(String[] args) {
		EntryStudentData esd = new EntryStudentData();
		StudentDAO     stdao = new StudentDAO();
		Student        st    = new Student();
		
		st.setEnrollment(esd.readEnrollment());
		st.setName(esd.readName());
		st.setGender(esd.readGender());
		st.setGrade1(esd.readGrade());
		st.setGrade2(esd.readGrade());
		
		try{
			stdao.Insert(st);
			System.out.println("Student has inserted.");
			System.out.println(" ------- Registered Students -------- ");
			for(Student student : stdao.Search()){
				System.out.println(student.toString());
			}
		}catch(Exception e){
			System.out.println("Problem: "+e.getMessage());
			e.printStackTrace();
		}
	}
}
