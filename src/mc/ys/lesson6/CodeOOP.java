package mc.ys.lesson6;

import java.util.Random;

public class CodeOOP {

	public static void main(String[] args) {
		CodeOOP co = new CodeOOP();
		co.test();
		
		

	}
	
	public void test() {
		Random rand = new Random();
		int[] ranNum = new int[6];
		for(int i = 0; i < 6; i++) {
			ranNum[i] = rand.nextInt(45) + 1;
			System.out.println(ranNum[i]);
		}  //0 <= rnd < 45
	}

}
