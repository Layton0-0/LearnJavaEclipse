package mc.ys.lesson9;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayListTest alt = new ArrayListTest();
		alt.test1();
		
	}
	
	public void test1() {
		System.out.println("ArrayList test!");
		ArrayList list = new ArrayList();
		
		// Create
		list.add(new Integer(10)); // 다형성 1코드
		list.add(new Integer(2));
		list.add(new Integer(3));
		//list.add(new String("four"));
		int size = list.size();
		System.out.println("size: " + size);
		
		//Read
		Integer num = (Integer) list.get(0); // 다형성 2코드
		int number = num.intValue();
		System.out.println(number);
		
		//Read All
		this.print(list);
		
		//Update
		list.set(0, new Integer(1));
		this.print(list);
		
		//Delete
		Integer delNumber = (Integer)list.remove(2);
		System.out.println("deleted object's number is: " + delNumber);
		this.print(list);
	}
	
	public void print(ArrayList list) {
		for(int i = 0; i < list.size(); i++) {
			Integer temp = (Integer)list.get(i);
			System.out.println("the value is " + temp);
		}
		System.out.println();
	}

}
