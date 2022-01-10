package mc.ys.lesson9;
import java.util.Random;

public class LottoBall {
	private int ballNumber;
	Random rand = new Random();
	
	public LottoBall(int ballNumber){
		this.ballNumber = ballNumber;
	}
	
	public int getBallNumber() {
		return ballNumber;
	}

	
//	void setBallNumber(int ballNumber) {
//		this.ballNumber = ballNumber;
//	}
	

}

