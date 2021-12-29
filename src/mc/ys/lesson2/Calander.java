package mc.ys.lesson2;

import java.util.Scanner;

public class Calander {

	public static void main(String[] args) {
		int year = 0, month = 0;
		int re = 0, tab = 0;
		Scanner sc = new Scanner(System.in);
		while(true) { // 사용자가 원하는 만큼 반복
			while(true) { // 연도를 제대로 입력받을 때까지 반복
				System.out.print("연도를 입력하세요 (2020 ~ 2024): ");
				year = sc.nextInt();
				
				System.out.print("월을 입력하세요 (9999를 입력하면 공란으로 제출됩니다.): ");
				month = sc.nextInt();
				//연도가 2020과 2024 사이에 있는지 확인
				if(year >= 2020 && year <= 2024) 
					break;
				System.out.println("정확한 연도를 입력해주세요.");
			}
			printCal(year, month);
			// 재시작 조건 넣기
			System.out.println("다시 시작하시겠습니까? 맞으면 1, 아니면 아무 숫자를 입력하세요: ");
			re = sc.nextInt();
			if(re != 1)
				break;
		}
				
	}
	//월별로 분류
	static void printCal(int year, int month) {
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			printStart(year, month, 31);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			printStart(year, month, 30);
			break;
		case 2:
			printStart(year, month, 28);
			break;
		default: // 12개월 전부 출력
			for(int i = 1; i <= 12; i++) 
				printCal(year, i);
		}
		
	}
	
	//달력을 출력
	static void printStart(int year, int month, int date) {
		System.out.println(year + "년 " + month + "월 ");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i = 1; i <= date; i++) {
			System.out.print(i + "\t");
			if(i%7 == 0)
				System.out.println();
		}
		System.out.println();
	}

}

/*
	2020년부터 2024년까지의 달력을 생성하는 프로그램을 작성하시오
	년도와 월을 입력하는 해당 월 출력
	연도만 입력하면 1~12월 모두 출력
	사용자가 원하는 만큼 사용할 수 있습니다.
	프로그램을 다시 시작하지 않고 계속 사용할 수 있어야 합니다.
	해당 월과 년도는 콘솔에서 입력할 수 있어야 합니다.
	최대한 라인수를 줄여서 작성하세요
*/