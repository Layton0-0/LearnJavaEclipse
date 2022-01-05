package edu.StudyClass;

public class Professor extends Person{
	private String subject;
	
	public String getDept() {
		return subject;
	}
	
	public void setDept(String subject) {
		this.subject = subject;
	}
}
