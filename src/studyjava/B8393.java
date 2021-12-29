package studyjava;
import java.util.*;

public class B8393 { //합

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		
		for(int i = 1; i <= n; i++) {
			result += i;
			System.out.println(result);
		}
		System.out.println(result);
	}

}
