package mc.ys.lesson6;

public class LottoMachine {
	LottoBall balls;
	LottoMachine(LottoBall balls){
		this.balls = balls;
	}

	void startMachine() {
		System.out.println("로또 번호를 뽑습니다.");
		LottoBall ball = this.getBall();
		
	}
	
	LottoBall getBall() {
		LottoBall ball = this.balls;
		
		for(int i = 0; i < 6; i++) {
			System.out.println("로또 볼을 하나 선택했습니다.");
		}
		for(int e: ball.ballNumber) {
			System.out.print(e + "\t");
		}
		System.out.println();
		return ball;
	}
	

}
