package mc.ys.lesson6;
import java.util.Random;

public class LottoBall {
	private int ballNumber;
	private boolean isSelected;
	Random rand = new Random();
	
	public LottoBall(int ballNumber){
		this.ballNumber = ballNumber;
	}
	
	public int getBallNumber() {
		return ballNumber;
	}
	
	public boolean getIsSelected() {
		return isSelected;
	}
	
	private void setBallNumber(int ballNumber) {
		this.ballNumber = ballNumber;
	}
	
	public void setIsSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	

}

