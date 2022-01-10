package mc.ys.lesson9;

import java.util.ArrayList;

//오토 박싱, 오토 언박싱
public class ArrayListTest3 {

	public static void main(String[] args) {
		ArrayListTest3 alt = new ArrayListTest3();
		alt.test1();
		
	}
	
	public void test1() {
		System.out.println("ArrayList test!");
		ArrayList<Integer> list = new ArrayList<>();
		
		// Create
		list.add(10); // Auto Boxing
		list.add(2);
		list.add(3);
		//list.add(new String("four"));
		int size = list.size();
		System.out.println("size: " + size);
		
		//Read
		int number = list.get(0); // Auto Unboxing
		System.out.println(number);
		
		//Read All
		this.print(list);
		
		//Update
		list.set(0, 1);
		this.print(list);
		
		//Delete
		int delNumber = list.remove(2);
		System.out.println("deleted object's number is: " + delNumber);
		this.print(list);
	}
	
	public void print(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			int temp = list.get(i);
			System.out.println("the value is " + temp);
		}
		System.out.println();
	}

}
