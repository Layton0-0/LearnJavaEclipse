package mc.ys.lesson4;

public class Q4_6 {

	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i + j == 6) {
					System.out.printf("%d %d", i, j);
					System.out.println();
				}
			}
		}

	}

}
