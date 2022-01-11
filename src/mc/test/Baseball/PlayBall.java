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
		System.out.println("====== Result =======");
		System.out.printf("컴퓨터 숫자: %5s %n" ,comNum);
		System.out.printf(" 유저 숫자: %5s %n" ,userNum);
		System.out.printf("스트라이크 %d개, 볼 %d개 %n", strike, ball);
		System.out.println("=====================");
	}

}
