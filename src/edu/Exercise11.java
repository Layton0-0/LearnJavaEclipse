package edu;

public class Exercise11 {

	public static void main(String[] args) {
		try {
			String s = new String("java");
			int len1 = s.length();
			s = null;
			int len2 = s.length();
			
		} catch(NullPointerException e) {
			System.out.println("오류 발생");
		}
		
		System.out.println("OK");

	}

}
