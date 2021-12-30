package mc.ys.lesson4;

public class SummaryTest {

	public static void main(String[] args) {
		// byte short int long double float boolean
		//1. int x = 10;
		//2. x = 20;
		//3. for문 작성 
		// for(int i = 0; i < 10; i++) {}
		
		//4. 1에서 1씩 증가하는 숫자가 있는데 합이 1000이 되는 숫자를 구하시오.
		int n = 1;
		int sum = 0;
		while(true) {
			sum += n;
			n++;
			if(sum >= 1000)
				break;
		} System.out.println(n);
		
		//5. 연산자를 아는대로 쓰시오.
		// +, -, *, /, %, &&, ||, !, ==, !=, ++, --
		
		//6. 작성한 연산자를 활용한 코드를 각각 작성하시오.
		
		System.out.println(1 + 2);
		System.out.println(1 - 2);
		System.out.println(1 * 2);
		System.out.println(1 / 2);
		System.out.println(1 % 2);
		
		//7. 배열을 선언하고 크기를 결정하고 초기화하는 코드 2가지를 쓰시오.
		int [] arr = new int[5];
		int[] arr2 = {1, 2, 3, 4, 5};
		
		//8. 위에서 사용한 코드를 이용해서 12개월의 마지막 날 데이터를 입력하고 출력하는 코드를 작성하시오.
		int[] lastDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int e : lastDay) {
			System.out.println(e);
		}
		//9. 변수의 활용을 보여주는 코드를 작성하시오.
		int a = 1;
		a += a;
		//10. 중복제거의 예를 보여주는 코드를 작성하시오.
		int b = 1 + 1;
		b = a + a;
		//11. for의 문법형식을 확인하시오.(이용한 코드 작성)
		//0
		//12. if, if-else, if-else-if 문법을 이용해 코드 작성
		//0
		//13. while의 문법을 이용한 코드를 작성하시오.
		//0

	}

}
