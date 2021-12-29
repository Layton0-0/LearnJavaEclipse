package mc.lesson.lesson3;

public class YunNeon { // 2020년이 윤년인지 확인하는 코드

	public static void main(String[] args) {
		// 년도를 400으로 나누면 떨어진다.
		// 년도를 4로 나누어덜어지는 동시에 100으로는 나누어 떨어지면 안된다.
		int year = 2020;
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
		
	}

}
