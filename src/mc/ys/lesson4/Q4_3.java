package mc.ys.lesson4;

public class Q4_3 {

	public static void main(String[] args) {
		int sum = 0;
		int result = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
			result += sum;
		}
		System.out.println(result);
	}

}
