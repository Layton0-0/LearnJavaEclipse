package mc.ys.lesson10.Thread;
import java.util.*;
public class Thread1 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100; i++) {
			try {
				Thread.sleep(new Random().nextInt(1000) + 1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
