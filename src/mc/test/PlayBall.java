package mc.test;
import java.util.Random;
import java.util.Scanner;

public class PlayBall {

	public static void main(String[] args) {
		PlayBall playBall = new PlayBall();
		String comNum = playBall.makeNum();
		String userNum = playBall.getNum();
		System.out.println(comNum);

	}
	
	// 1.시스템은 중복이 없는 4자리 숫자를 생성한다.(첫 번째 숫자는 0이 아니어야 한다.)
	String makeNum() {
		String num = "";
		int[] temp = {0, 0, 0, 0};
		final int MAX_NUM = 4;
		Random rand = new Random();
		
		for(int i = 0; i < MAX_NUM; i++) {
			temp[i] = rand.nextInt(9) + 1;
			for(int j = 0; j < i; j++) {
				if(temp[i] == temp[j]) {
					i--;
				}
			}
		}
		
		for(int e: temp) 
			num += e;
		
		return num;
	}
	
	// 2. 게임 참가자는 임의의 4자리 숫자를 입력한다.
	String getNum() {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		
		sc.close();
		return num;
	}
	
	// 3. 시스템은 입력된 4자리 수를 자신이 가지고 있는 수와 비교하여 숫자가 같으면서 숫자 자리가 
	// 같으면 스트라이크, 숫자가 같으면서 숫자 자리가 틀리면 볼로 판정한다.
	void compareNum(String comNum, String myNum) {
		int result;
		
	}

}
