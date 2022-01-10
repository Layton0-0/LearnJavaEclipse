package mc.ys.lesson9;

import java.util.*;

public class LottoMachine {
	ArrayList<LottoBall> balls;
	LottoMachine(ArrayList<LottoBall> balls){
		this.balls = balls;
	}
	

	void startMachine() {
		System.out.println("추첨을 시작하겠습니다.\n");
		Integer[] choiceBalls = new Integer[6];
		
		for(int count = 0; count < 6; count++) {
			LottoBall ball = this.getBall();

			choiceBalls[count] = ball.getBallNumber();
			System.out.println(ball.getBallNumber() + "踰덉씠 �꽑�깮�릺�뿀�뒿�땲�떎.\n");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Arrays.sort(choiceBalls);
		System.out.println("�젣 224�쉶李� 異붿꺼 踰덊샇�뒗 " + Arrays.toString(choiceBalls));
		
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
		System.out.println("濡쒕삉 蹂쇱쓣 �븯�굹 �꽑�깮�뻽�뒿�땲�떎.");
		return ball;
	}
	
	
	

}
