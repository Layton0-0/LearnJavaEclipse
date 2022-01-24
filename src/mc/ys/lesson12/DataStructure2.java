package mc.ys.lesson9;

public class DataStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataStructure ds = new DataStructure();
		ds.test1();
	}
	
	public void test1() {
		//최대값
		//최소값
		//합계
		//배열 - 데이터를 모아서 하나의 변수로 처리하는 것
		/*
		 * int[] numbers = null; numbers = new int[5]; numbers[0] = 10; numbers[1] = 20;
		 * numbers[2] = 30; numbers[3] = 40; numbers[4] = 50;
		 */

		int[] numbers2 = {1,2,3,4,5,6,7,8,9,0};
		
		this.print(numbers2);
		int max = numbers2[0];
		for(int i=1;i<numbers2.length;i++) {
			if(max<numbers2[i]) {
				max = numbers2[i];
			}
		}
		System.out.println("max is "+max);
		// numbers2에 대해서 최소값 구하는 코드 작성하세요
		int min = numbers2[0];
		for(int i=1;i<numbers2.length;i++) {
			if(min>numbers2[i]) {
				min = numbers2[i];
			}
		}
		System.out.println("min is "+min);
		this.sum(numbers2);
		this.sum(1,5);
	}
	
	//배열을 받아서 출력하는 메소드 print를 생성하세요.(리턴없음)
	public void print(int[] numbers) {
		//향상된 반복문(for)을 사용해서 출력하세요
		for(int num : numbers) {
			System.out.println(num);
		}
	}
	
	public void sum(int[] numbers) {
		//합계를 구하는 로직을 작성하시오
		int sum = 0;
		for(int i=0;i<numbers.length;i++) {
			//sum = sum + numbers[i];
			sum += numbers[i];
		}
		System.out.println("sum is "+sum);
	}
	
	public void sum(int a, int b) {
		// a, b사이의 모든 숫자를 더해서 출력하는 코드 작성(a,b는 포함)
		int sum = 0;
		for(int i=a;i<=b;i++) {
			//sum = sum + i;
			sum += i;
		}
		System.out.println("a ~ b is "+sum);
	}
	
}
