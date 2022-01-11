package mc.ys.lesson10.Thread;

import java.util.Random;

public class Thread2 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 65; i < 65 + 26; i++) {
			try {
				Thread.sleep(new Random().nextInt(1000) + 1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println((char)i);
		}
	}
}
