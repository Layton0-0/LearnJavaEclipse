package edu;

public class Exercise06 {

	public static void main(String[] args) {
		Armor suit1 = new Armor();
		Armor suit2 = new Armor("mark6", 180);
		
		// mark0:200 
		// mark6:180
		System.out.println(suit1.getName() + ":" + suit1.getHeight());
		System.out.println(suit2.getName() + ":" + suit2.getHeight());

	}

}

class Armor{
	private String name;
	private int height;
	
	//생성자 선언
	Armor(){
		setName("mark0");
		setHeight(200);
	}
	
	Armor(String name, int height){
		setName(name);
		setHeight(height);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
}
