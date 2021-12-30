package mc.ys.lesson4;

public class Q4_4 {

	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		while(true) {
			sum += n;	
			if(sum >= 100) {
				System.out.println(n);
				System.out.println(sum);
				break;
			}
			if(n > 0) {
				n++;
			} else {
				n--;
			}
			n = -n;
		}

	}

}
