package JavaProject2;

public class BookTest {

	public static void main(String[] args) {
		Book javaPro = new Book("B001", "자바 프로그래밍", "홍길동", 25000, 2021, "멀티출판사");
		Book javaScript = new Book("B002", "자바스크립트", "이몽룡", 30000, 2020, "서울출판사");
		Book hc = new Book("B003", "HTML/CSS", "성춘향", 18000, 2021, "강남출판사");
		
		Magazine javaWorld = new Magazine("M001", "자바 월드", "홍길동", 25000, 2021, "멀티출판사", 5);
		Magazine webWorld = new Magazine("M002", "웹 월드", "이몽룡", 30000, 2020, "서울출판사", 7);
		Magazine gameWorld = new Magazine("M003", "게임 월드", "성춘향", 18000, 2021, "강남출판사", 9);
		
		System.out.println("도서번호\t 도서명\t\t 저자\t 가격\t 발행일\t 출판사");
		System.out.println("-----------------------------------------------------------");
		System.out.println(javaPro);
		System.out.println(javaScript);
		System.out.println(hc);
				
		System.out.println("\n잡지번호\t 잡지명\t 발행인\t 가격\t 발행연도\t 출판사\t 발행월");
		System.out.println("-----------------------------------------------------------");
		System.out.println(javaWorld);
		System.out.println(webWorld);
		System.out.println(gameWorld);
	}

}
