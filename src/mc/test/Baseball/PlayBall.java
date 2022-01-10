/* 
 * 시스템은 중복이 없는 4자리 숫자를 생성한다.(첫 번째 숫자는 0이 아니어야 한다.)
 * 게임 참가자는 임의의 4자리 숫자를 입력한다.
 * 시스템은 입력된 4자리 수를 자신이 가지고 있는 수와 비교하여 
 * 숫자가 같으면서 숫자 자리가 같으면 스트라이크, 
 * 숫자가 같으면서 숫자 자리가 틀리면 볼로 판정한다.
 * 4스트라이크가 나오기까지 계속해서 게임을 진행한다.
 * 게임참가자가 기권 의사를 표시하거나 4스트라이크가 나오면 게임은 종료된다.
 * 예) 3296 -> 시스템 생성숫자
 * 	  2136 -> 사용자 입력 숫자
 * 결과는 1스트라이크 2볼(6은 숫자와 자리가 같으므로 스트라이크, 
 * 2와3은 숫자는 같지만 자리가 틀리므로 볼)
 * */

package mc.test.Baseball;

public class PlayBall {
	
	public static void main(String[] args) {
		NumberMakeMachine machine = new NumberMakeMachine();
		String comNum = machine.makeComNum();
		String userNum = machine.makeUserNum();
		
		CompareMachine cMachine = new CompareMachine(comNum, userNum);
		int[] result = cMachine.compareNums();
		int strike = result[0];
		int ball = result[1];
		
		showResult(comNum, userNum, strike, ball);
		
	}
	
	static void showResult(String comNum, String userNum, int strike, int ball){
		System.out.println("컴퓨터 숫자:\t" + comNum);
		System.out.println("유저 숫자:\t" + userNum);
		System.out.printf("스트라이크 %d번, 볼 %d번", strike, ball);
	}

}
