package mc.ys.lesson7;

public class TestString {

	public static void main(String[] args) {
		TestString ts = new TestString();
		
		ts.test1();

	}
	
	public void test1() {
		String num = "123456";
		char letter;
		int sum = 0;
		for(int j = 0; j < num.length(); j++) {
			letter = num.charAt(j);
			System.out.println(letter);
			sum += Integer.parseInt(String.valueOf(letter));
		}
		System.out.println(sum);
	}
	
	public void test2() {
		
	}

}
