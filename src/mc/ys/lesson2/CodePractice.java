package mc.ys.lesson2;

public class CodePractice {

	public static void main(String[] args) {
		
		int number = 123456789;
		int num;
		
		while(true) {
			num = number%10;
			System.out.println(num);
			number /= 10;
			if(number == 0) 
				break;
		}
		
		

	}

}
