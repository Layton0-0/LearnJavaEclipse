package mc.test;

import java.util.Scanner;
import java.util.Random;
/*
		 * 로또 프로그램
		 * 1. 로또번호는 총 6개를 추출한다.
		 * 2. 6개 당첨시 1등, 5개 2등, 4개 3등, 3개 4등, 이외 꽝
		 * 3. 랜덤객체를 사용해서 랜덤 정수값 6세트를 생성한다. (1 ~ 45 정수범위)
		 * 4. 랜덤번호와 당첨번호를 비교하여 맞은 갯수를 카운트한 후 등수를 매긴다.

*/
public class LottoProgram {
	// 번호를 뽑는 메소드
	static int[] pickNum() { 
		Random rand = new Random();
		int[] num = new int[6];
		for(int i = 0; i < 6; i++) {
			num[i] = rand.nextInt(45) + 1;
		}
		return num;
	}
	
	// 당첨번호 비교, 등수 매기는 메소드
	static int compNum(int[] comNum, int[] myNum) {
		int count = 0;
		// 일치하는 숫자 있는지 확인
		for(int e: comNum) {
			for(int f: myNum) {
				if(e == f)
					count++;
			}
		}
		// 등수를 리턴한다.
		return (7 - count);
		
	}
	// 등수를 출력
	static void printRank(int rank, int[] comNum) {
		if(rank < 5) {
			printNums(comNum);
			System.out.println(rank + "등 입니다.");
		}
		else {
			printNums(comNum);
			System.out.println("꽝! 다음 기회에!");
		}
			
	}
	// 로또 번호 출력
	static void printNums(int[] num) {
		for(int e: num)
			System.out.print(e + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] myNum = new int[6];
		int[] comNum = new int[6];
		int rank = 0;
		// 사용자의 로또 번호 입력받기
		System.out.println("로또 번호 여섯 숫자를 입력해주세요(1~45): ");
		for(int e: myNum) {
			e = sc.nextInt();
		}
		// 랜덤 로또 번호 저장
		comNum = pickNum();
		// 등수 정보 저장
		rank = compNum(comNum, myNum);
		// 등수 출력
		printRank(rank, comNum);
		
		sc.close();
		
		
	}

}
