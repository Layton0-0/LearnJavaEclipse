package edu;

public class Exercise03 {

	public static void main(String[] args) {
		int num = 10;
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i <= num; i++) {
			if(i % 2 == 0) {
				sum1 += i;
			}else {
				sum2 += i;
			}
		}
		
		if(num % 2 ==0) {
			System.out.println("결과 값: " + sum1);
		} else {
			System.out.println("결과 값: " + sum2);
		}

	}

}
