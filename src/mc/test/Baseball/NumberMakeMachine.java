package mc.test.Baseball;
import java.util.Scanner;

public class NumberMakeMachine {
	private static final int NUM_LEN = 4;
	private String comNum = "";
	private int[] num = new int[4];
	
	String makeComNum() {
		for(int i = 0; i < NUM_LEN; i++) {
			num[i] = (int)(Math.random() * 10);
			for(int j = 0; j < i; j++) {
				if(num[i] == num[j] || num[0] == 0) 
					i--;				
			}
		}
		
		for(int e: num) {
			comNum += e;
		}
		return comNum;
	}
	
	String makeUserNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		String userNum = sc.next();
		
		sc.close();
		return userNum;
	}
}
