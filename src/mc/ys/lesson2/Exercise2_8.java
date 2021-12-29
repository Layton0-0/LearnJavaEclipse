package mc.ys.lesson2;

public class Exercise2_8 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;
		
		int i = x;
		x = y;
		y = z;
		z = i;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}

}
