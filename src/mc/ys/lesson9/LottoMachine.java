package mc.ys.lesson9;

import java.util.*;

public class LottoMachine {
	ArrayList<LottoBall> balls;
	LottoMachine(ArrayList<LottoBall> balls){
		this.balls = balls;
	}

	void startMachine() {
		System.out.println("로또 번호를 뽑습니다.\n");
		Integer[] choiceBalls = new Integer[6];
		
		for(int count = 0; count < 6; count++) {
			LottoBall ball = this.getBall();

			choiceBalls[count] = ball.getBallNumber();
			System.out.println(ball.getBallNumber() + "번이 선택되었습니다.\n");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Arrays.sort(choiceBalls);
		System.out.println("제 224회차 추첨 번호는 " + Arrays.toString(choiceBalls));
		
	}
	
	void shuffle() {
		Random r = new Random();
		ArrayList<LottoBall> newBalls = balls;
		for(int i = 0; i < 45; i++) {
			int idx = r.nextInt(balls.size());
			newBalls.add(balls.remove(idx));
		}
		balls = newBalls;
	}
	
	
	LottoBall getBall() {
		LottoBall ball = null;
		Random r = new Random();
		int idx = r.nextInt(balls.size());
		ball = balls.remove(idx);
		System.out.println("로또 볼을 하나 선택했습니다.");
		return ball;
	}
	
	
	

}
