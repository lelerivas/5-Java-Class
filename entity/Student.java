package entity;

public class Student {
	private Integer enrollment;
	private String name;
	private String gender;
	private Double grade1;
	private Double grade2;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer enrollment, String name, String gender, Double grade1, Double grade2) {
		super();
		this.enrollment = enrollment;
		this.name = name;
		this.gender = gender;
		this.grade1 = grade1;
		this.grade2 = grade2;
	}

	@Override
	public String toString() {
		return "Student [enrollment=" + enrollment + ", name=" + name + ", gender=" + gender + ", grade1=" + grade1
				+ ", grade2=" + grade2 + "]";
	}

	public Integer getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(Integer enrollment) {
		this.enrollment = enrollment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getGrade1() {
		return grade1;
	}

	public void setGrade1(Double grade1) {
		this.grade1 = grade1;
	}

	public Double getGrade2() {
		return grade2;
	}

	public void setGrade2(Double grade2) {
		this.grade2 = grade2;
	}
	
}
