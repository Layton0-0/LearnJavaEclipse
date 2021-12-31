package mc.test;

import java.util.Scanner;

public class Calander {

	public static void main(String[] args) {
		int year = 0, month = 0;
		int re = 0;
		int[] space = new int[12];
		int [] monthLastDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// 입력받기
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
			//윤년 계산
			if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
				monthLastDay[1] = 29;
			// 입력받은 해의 공백 전부 저장
			space = calCal(year, monthLastDay);
			
			// 월을 입력받았는지 여부 확인
			if(month >= 1 && month <= 12) {
				printAMonth(year, month, space, monthLastDay);
			} else {
				printAll(year, space, monthLastDay);
			}
			
			// 재시작 조건 넣기
			System.out.println("다시 시작하시겠습니까? 맞으면 1, 아니면 아무 숫자를 입력하세요: ");
			re = sc.nextInt();
			if(re != 1)
				break;
			
		}
		sc.close();
				
	}
	
	// 연도별 월별 공백 데이터를 미리 계산해서 배열로 저장
	static int[] calCal(int year, int[] lastDay) { 
		int month = 1;
		int[] yearSpace = {3, 5, 6, 0, 1};
		int[] space = new int[12];
		space[0] = yearSpace[year - 2020];
		for(int i = 1; i < 12; i++) {	
			space[i] = (lastDay[month - 1] + space[i-1]) % 7;
			month++;
		}
		return space;
	}
	
	// 전 월 모두 출력
	static void printAll(int year, int[] space, int[] lastDay) {
		int month = 1;
		while(month <= 12) {
			printAMonth(year, month, space, lastDay);	
			month++;
		}
	}
	// 한 월만 출력
	static void printAMonth(int year, int month, int[] space, int[] lastDay) {
		int tab = space[month - 1];
		System.out.println(year + "년 " + month + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i = 0; i < tab; i++)
			System.out.print("\t");
		
		for(int i = 1; i <= lastDay[month - 1]; i++) {
			System.out.print(i + "\t");
			tab += 1;
			if(tab % 7 == 0)
				System.out.println();
		} System.out.println("\n");
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