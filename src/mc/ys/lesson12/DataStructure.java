package mc.ys.lesson12;

public class DataStructure {

	public static void main(String[] args) {
		DataStructure ds = new DataStructure();
		ds.test1();
	}
	
	public void test1() {
		// 최대값
		// 최소값
		// 합계
		// 배열
		int[] numbers = null;
		numbers = new int[5];
		int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//		print(numbers2);
		
		// 최댓값 구하는 로직 작성
		int max = numbers2[0];
		for(int num: numbers2) {
			if(num > max) {
				max = num;
			}
		}
		System.out.println("최댓값: " + max);
		
		// 최소값 구하는 로직 작성
		int min = numbers2[0];
		for(int num: numbers2) {
			if(num < min) {
				num = min;
			}
		}
		System.out.println("최솟값: " + min);
		
		sum(numbers2);
		sum(3, 5);
		sum(13, 7);
	}
	
	// 배열을 받아서 출력하는 메소드 print를 생성
	public void print(int[] arr) {
		for(int e: arr)
			System.out.print(e + "\t");
	}
	
	public void sum(int[] numbers) {
		// 합계를 구하는 로직을 작성하시오
		int sum = 0;
		for(int num: numbers)
			sum += num;
		System.out.println("총 합: " +sum);
	}
	
	public void sum(int a, int b) {
		int sum = 0;
		for(int i = a; i <= b; i++) {
			if(a > b) {
				break;
			}
			sum += i;
		}
		System.out.println("a부터 b사이의 모든 수의 합은(a가 더 클 경우 0): " + sum);
	}
	

}
