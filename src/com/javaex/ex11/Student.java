package com.javaex.ex11;

public class Student extends Person{
	
	private String schoolName;
	
	
	public Student() {
		super("이효리",20	);
	}


	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
		
	}


	public String getSchoollName() {
		return schoolName;
	}


	public void setSchoollName(String schoolName) {
		this.schoolName = schoolName;
	}



	
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}

	
	
	

}
