package mc.ys.lesson4;

public class TestCheck1 {

	public static void main(String[] args) {
		int number = 12345678;
		int splitNumber = 0;
		
		while(true) {
			splitNumber = number % 10;
			System.out.println(splitNumber);
			number /= 10;
			if(number == 0)
				break;
		}

	}

}
