package edu.StudyClass;

public class Exercise08 {

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Manager m = new Manager();
		Consultant c = new Consultant();
		
		print(s);
		print(m);
		print(c);

	}
	
	static void print(Employee e) {
		if(e instanceof Salesman) {
			System.out.println("Salesman입니다.");
		} else if(e instanceof Manager) {
			System.out.println("Manager입니다.");
		} else if(e instanceof Consultant) {
			System.out.println("Consultant입니다.");
		}
	}

}
