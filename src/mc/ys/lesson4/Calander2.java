package mc.ys.lesson4;

public class Calander2 {

	public static void main(String[] args) {
		int day = 1;
		int lastDay = 31;
		int space = 3;
		System.out.println("2021년 8월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i = 0; i < space; i++)
			System.out.print("\t");
		
		
		for(int i = 1; i <= 31; i++) {
			System.out.print(i + "\t");
			if((i+space) % 7 == 0)
				System.out.println();
			day += 1;
		}

	}

}
