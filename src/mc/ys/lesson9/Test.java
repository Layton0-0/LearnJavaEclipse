// 데이터클래스와 toString()을 이용하여 화면과 같이 출력이 되도록 프로그래밍 하시오.
package mc.ys.lesson9;

public class Test {

	public static void main(String[] args) {
		String[] kim = {"kim", "39", "49", "59"};
		String[] lee = {"lee", "48", "89", "64"};
		String[] park = {"park", "90", "81", "100"};
		Data dkim = new Data(kim);
		Data dlee = new Data(lee);
		Data dpark = new Data(park);
		


	}
	
	

}

class Data{
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	Data(String[] data){
		name = data[0];
		kor = Integer.parseInt(data[1]);
		eng = Integer.parseInt(data[2]);
		math = Integer.parseInt(data[3]);
		total = kor + eng + math;
		avg = (double)total / 3;	
	}
	
	@Override
	public String toString() {
		String result = "";
		return name + kor + eng;

	}
}
