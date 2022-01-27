package mc.ys.lesson10;

import java.util.Scanner;

public class Data {
	public static final int NO   = 1;	// 번호를 읽어 들일까요?
	public static final int NAME = 2;	// 이름을 읽어 들일까요?

	private Integer no;					// 회원번호 (키 값)
	private String  name;				// 이름
	private Scanner stdIn;

	public Data(Scanner stdIn) {
		this.stdIn = stdIn;
	}
	// 키 값
	Integer keyCode() {
		return no;
	}

	// 문자열을 반환합니다.
	public String toString() {
		return name;
	}

	// 데이터를 입력합니다.
	void scanData(String guide, int sw) {
		System.out.println(guide + "할 데이터를 입력하세요.");

		if ((sw & NO) == NO) {
			System.out.print("번호：");
			no = stdIn.nextInt();
		}
		if ((sw & NAME) == NAME) {
			System.out.print("이름：");
			name = stdIn.next();
		}
	}
}
