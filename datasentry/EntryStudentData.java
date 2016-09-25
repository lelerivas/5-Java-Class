package datasentry;

import java.util.Scanner;
import DataValidation.StudentValidation;

public class EntryStudentData {
	
	StudentValidation sv;
	
	public EntryStudentData() {
		sv = new StudentValidation();
	}
	
	public Integer readEnrollment(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Entry with the enrollment: ");
		try{
			return scan.nextInt();
		}catch(Exception e){
			System.out.println("Problem! Entry with the enrollment: ");
			return readEnrollment();  // recursion
		}	
	}	
	
	public String readName(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Entry with the name: ");
		String name = scan.nextLine();
		if(sv.VerifyName(name)){
			return name;
		}else{
			return readName();
		}	
	}
	
	public String readGender(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Entry with the gender: ");
		String gender = scan.next();
		if(sv.VerifyGender(gender)){
			return gender;
		}else{
			System.out.println("Entry with the gender: ");
			return readGender();
		}
	}
	
	public Double readGrade(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Entry with the grade: ");
		try{
			double grade = scan.nextDouble();
			if(grade > 10. || grade < 0.){
				System.out.println("Problem. Grade needs to be between 0 and 10");
				return readGrade();
			}else{
				return grade;
			}
		}catch(Exception e){
			System.out.println("Problem. Entry with the grade: ");
			return readGrade();
		}
	
	}
}