// 중복이 없는 4자리 숫자를 생성한다. 첫 자리는 0이면 안됨.
package mc.test.Baseball;
import java.util.Scanner;

public class NumberMakeMachine {
	private static final int NUM_LEN = 4;
	private String comNum = "";
	private int[] num = new int[4];
	
	
	
	String makeComNum() {
		for(int i = 0; i < NUM_LEN; i++) {
			num[i] = (int)Math.random() * 10;
			for(int j = 0; j < i; j++) {
				if(num[i] == num[j]) {
					i--;
					continue;					
				}
			}
			comNum += num;
		}
		return comNum;
	}
	
	String makeUserNum() {
		Scanner sc = new Scanner(System.in);
		String userNum = sc.next();
		System.out.println("유저 숫자를 입력해주세요: ");
		
		sc.close();
		return userNum;
	}
}
