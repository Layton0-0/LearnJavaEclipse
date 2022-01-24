package mc.ys.lesson12.review;

import java.util.Random;
import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		Review review = new Review();
//		review.sumNum(10, 5);
//		review.shuffle();
		int[] a = {5, 3, 4, 1, 2};
		review.sort(a);
//		// 배열 선언의 또 다른 방법
//		review.sort(new int[] {5, 3, 4, 1, 2}); 
//		System.out.println(review.checkPrimeNum(6));
	}
	
	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public boolean checkPrimeNum(int num) {
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count++;
			}			
		}
		if(count == 2) {
			return true;
		}
		return false;
	}
	
	public int[] getNum() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사용할 배열의 크기를 입력하세요: ");
		int size = scan.nextInt();
		int[] abc = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.print("사용할 정수 데이터를 입력하세요: ");
			abc[i] = scan.nextInt();
		}
		System.out.println("입력이 완료되었습니다.");
		this.print(abc);
		
		scan.close();
		
		return abc;
	}
	
	public void sort(int[] numbers) {
		// 선택 정렬	
		// 첫 자리를 기준으로 검사
		for(int i = 0; i < numbers.length - 1; i++) {
			// 첫 자리와 바꿀 자리의 인덱스 저장용
			int idx = i;
			// 두번째 자리부터 끝까지 차례로 검사
			for(int j = i + 1; j < numbers.length; j++) {
				// 기준인 자리보다 작을 경우 인덱스 업데이트
				if(numbers[idx] > numbers[j]) {
					idx = j;
				}
			}
			// 자리 바꿔주기
			swap(numbers, i, idx);
		}
		
		
		this.print(numbers);
	}
	
	public void shuffle() {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		Random rand = new Random();
		// numbers 배열의 순서를 섞는 코드를 작성하시오.
		for(int i = 0; i < numbers.length; i++) {
			int temp = numbers[i];
			int ranNum = rand.nextInt(numbers.length);
			numbers[i] = numbers[ranNum];
			numbers[ranNum] = temp;
		}
		this.print(numbers);
	}
	
	public void print(int[] numbers) {
		for(int num: numbers)
			System.out.print(num + " ");
		System.out.println();
	}
	
	//두 수 사이의 수에 대해 합계를 구하는 메소드 선언을 하시오.
	public void sumNum(int a, int b) {
		int sum = 0;
		// 교환로직
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
