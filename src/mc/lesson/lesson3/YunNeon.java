package mc.lesson.lesson3;

public class YunNeon { // 2020년이 윤년인지 확인하는 코드

	public static void main(String[] args) {
		// 년도를 400으로 나누면 떨어진다.
		// 년도를 4로 나누어덜어지는 동시에 100으로는 나누어 떨어지면 안된다.
		//int year = 2020;
		// 4로 나누어 떨어지면서, 100으로는 나누어 떨어지지 않는 수
		// 또는 400으로 나누어 떨어지는 수
		for(int i = 2020; i <= 2024; i++) {
			if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				System.out.println(i + "년은 윤년입니다.");
			} else {
				System.out.println(i + "년은 윤년이 아닙니다.");
			}
		}
		
		
	}

}
