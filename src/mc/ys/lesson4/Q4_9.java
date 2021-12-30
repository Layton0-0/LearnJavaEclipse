package mc.ys.lesson4;

public class Q4_9 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while(true) {
			sum += num % 10;
			num /= 10;
			if(num == 0)
				break;
		}
		
		System.out.println("sum = " + sum);

	}

}
