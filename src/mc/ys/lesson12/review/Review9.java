package mc.ys.lesson12.review;

import java.util.Random;

public class Review9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Review9인스턴스 생성
		Review9 r9 = new Review9();
		//r9.sum(2, 3);
		//r9.shuffle();
		int[] a = {5,3,4,1,2};
		r9.sort(a);
	}
	
	public void sort(int[] numbers) {
		
		//선택 정렬
		for(int k=0;k<numbers.length-1;k++) {
			for(int i=k+1;i<numbers.length;i++) {
				if(numbers[k]>numbers[i]) {
					int temp = numbers[k];
					numbers[k] = numbers[i];
					numbers[i] = temp;
				}
			}
		}
		
//		for(int i=2;i<numbers.length;i++) {
//			if(numbers[1]>numbers[i]) {
//				int temp = numbers[1];
//				numbers[1] = numbers[i];
//				numbers[i] = temp;
//			}
//		}
		
		
		this.print(numbers);
	}
	
	public void shuffle() {
		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		//위의 numbers배열의 순서를 섞는 코드를 작성하시오
		for(int i=0;i<10;i++) {
			// 두개의 인덱스를 결정(Random으로 한다)
			Random r = new Random();
			int idx1 = r.nextInt(10); // 0~9
			int idx2 = r.nextInt(10);
			// 결정된 인덱스를 기준으로 교환로직 작성
			int temp = numbers[idx1];
			numbers[idx1] = numbers[idx2];
			numbers[idx2] = temp;
			this.print(numbers);
		}
	}
	
	public void print(int[] numbers) {
		for(int i=0;i<numbers.length;i++) {
			System.out.printf("%d ",numbers[i]);
		}
		System.out.println();
	}
	
	//두수 사이의 수(두수는 포함)에 대해 합계를 구하는 메소드 선언을 하시오
	public void sum(int n, int m) {
		int total = 0;
		if(n>m) {
			//교환로직
			int temp = n;
			n = m;
			m = temp;
		}
		for(int i=n;i<m+1;i++) { //0~9까지의 수
			total = total + i; //누적
		}
		System.out.println(total);
	}

}
