package mc.ys.lesson3;
import java.util.Scanner;

public class ReviewCalander {

	public static void main(String[] args) {
		int year = 2021;
		int month = 0;
		int yn = 0;
		
		ReviewCalander rc = new ReviewCalander();
		Scanner sc = new Scanner(System.in);
		
		while(true) {		
			System.out.print("월을 입력하세요: ");
			month = sc.nextInt();
			
			rc.viewMonth(month);
			
			System.out.println("다시 하고 싶으면 1, 하고싶지 않다면 0을 입력해주세요.");
			yn = sc.nextInt();
			if(yn != 1)
				break;		
		}
		sc.close();
		
		

	}
	
	void viewMonth(int month){
		//입력받은 month를 이용해 2021년 month월 이라는 문장을 출력하세요
		System.out.printf("2021년 %d월 \n", month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i = 1; i <= 31; i++) {
			System.out.print(i + "\t");
			if(i % 7 == 0)
				System.out.println();
		}
	}

}
