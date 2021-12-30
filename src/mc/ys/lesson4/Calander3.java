package mc.ys.lesson4;

public class Calander3 {

	public static void main(String[] args) {
		int day = 1;
		int [] monthLastDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int space = 0;
		int year = 2021, month = 8;
		
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
			monthLastDay[1] = 29;
		
		while(month <= 12) {
			System.out.println(year + "년 " + month + "월");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			for(int i = 0; i < space; i++)
				System.out.print("\t");
			
			for(int i = 1; i <= monthLastDay[month-1]; i++) {
				System.out.print(i + "\t");
				
				if((i + space) % 7 == 0)
					System.out.println();
				
				day = i;
			} month++;
			System.out.println();
			space = (day + space) % 7;
		}
		

	}
	
	static int[] calCal(int year, int[] lastDay) { // 연도별 월별 공백 데이터를 미리 계산해서 배열로 저장
		int month = 1;
		int[] yearSpace = {3, 5, 4, 0, 1};
		int[] space = new int[12];
		space[0] = yearSpace[year - 2020];
		for(int i = 1; month <= 12; i++) {
			space[i] = (lastDay[month - i] + space[i-1]) % 7;
		}
		return space;
	}
	
	static void printAll(int year, int[] space, int[] lastDay) {
		int month = 1;
		while(month <= 12) {
			System.out.println(year + "년 " + month + "월");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			for(int i = 0; i < space[i]; i++)
				System.out.print("\t");
			
			for(int i = 1; i < lastDay[month - i]; i++) {
				System.out.print(i + "\t");
			}
			
			month++;
		}
	}

}
