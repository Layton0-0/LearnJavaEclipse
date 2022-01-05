package edu.StudyClass;

public class Student extends Person{
	private String major;
	
	public String getDept() {
		return major;
	}
	
	public void setDept(String major) {
		this.major = major;
	}
}
