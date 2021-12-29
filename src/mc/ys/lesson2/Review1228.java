package mc.ys.lesson2;

public class Review1228 {

	public static void main(String[] args) {
		// 2021년 8월 달력을 출력하는 코드 작성
		System.out.println("2021년 8월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i = 1; i <= 31; i++) {
			System.out.print(i + "\t");
			if(i % 7 == 0)
				System.out.println();
		}

	}

}
