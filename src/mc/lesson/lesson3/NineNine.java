package mc.lesson.lesson3;

public class NineNine {

	public static void main(String[] args) {
		// 구구단 작성
		for(int i = 1; i <= 9; i++) { 
			for(int j = 1; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}System.out.println();
		}

	}

}
