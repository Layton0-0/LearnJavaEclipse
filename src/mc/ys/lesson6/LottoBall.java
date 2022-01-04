package mc.ys.lesson6;
import java.util.Random;

public class LottoBall {
	int[] ballNumber;
	boolean isSelected;
	Random rand = new Random();
	
	LottoBall(){
		for(int i = 0; i < 6; i++) {
			ballNumber[i] = rand.nextInt(45) + 1;
		}
	}
	
	
	

}

