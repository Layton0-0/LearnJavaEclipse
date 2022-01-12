package mc.ys.lesson10.Thread;

public class ThreadTest {

	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		tt.test2();

	}
	
	private void test2() {
		// TODO Auto-generated method stub
		Runnable r1 = new Thread1();
		Runnable r2 = new Thread2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

	private void test1() {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
//		t1.start();
//		t2.start();
	}

}
