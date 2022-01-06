package mc.test;
import java.util.Random;
import java.util.Scanner;

public class PlayBall {

	public static void main(String[] args) {
		PlayBall playBall = new PlayBall();
		playBall.playGame();
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
		String num;
		//4자리를 받을 때까지 반복
		while(true) {
			System.out.print("4자리 숫자를 입력하세요: ");
			num = sc.next();
			
			if(num.length() == 4)
				break;
			System.out.println("정확한 값을 입력해주세요.");
		}
		
		return num;
	}
	
	// 3. 시스템은 입력된 4자리 수를 자신이 가지고 있는 수와 비교하여 숫자가 같으면서 숫자 자리가 
	// 같으면 스트라이크, 숫자가 같으면서 숫자 자리가 틀리면 볼로 판정한다.
	// 1을 스트라이크, 2를 볼로 지정.
	int[] compareNum(String comNum, String userNum) {
		int[] result = new int[2]; // 스트라이크, 볼 순서
		for(int i = 0; i < comNum.length(); i++) {
			for(int j = 0; j < userNum.length(); j++) {
				if(comNum.charAt(i) == userNum.charAt(j)) {
					result[1]++;
				}
				
			}
			if(comNum.charAt(i) == userNum.charAt(i)) {
				result[1]--;
				result[0]++;
			}
		}
		return result;
		
		
	}
	// 4. 4스트라이크가 나올 때까지 계속해서 게임을 진행한다. 게임 참가자가 기권 의사를 표시하거나
	// 4스트라이크가 나오면 게임은 종료된다.
	
	// 3296 + 2136 => 1스트라이크 2볼
	void playGame() {
		Scanner sc = new Scanner(System.in);
		int[] result = new int[2];
		String comNum;
		String userNum;
		
		while(true) {
			comNum = makeNum();
			userNum = getNum();
			result = compareNum(comNum, userNum);
			System.out.printf("컴퓨터: %s \t사람: %s\n", comNum, userNum);
			System.out.printf("%d 스트라이크 %d 볼\n\n", result[0], result[1]);
			System.out.print("기권하시려면 1, 계속하시려면 아무 숫자나 눌러주세요: ");
			int doOrNot = sc.nextInt();
			if(doOrNot == 1) {
				System.out.println("아쉽습니다ㅠㅠ");
				break;
			}
			if(result[0] == 4) {
				System.out.println("축하합니다! 4스트라이크 입니다!");
				break;
			}
		}
		
		
		sc.close();
	}

}
