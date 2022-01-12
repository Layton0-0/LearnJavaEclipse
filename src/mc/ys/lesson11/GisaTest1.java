package mc.ys.lesson7;

import java.util.ArrayList;

public class GisaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GisaTest gt = new GisaTest();
		gt.testString();
	}
	
	public void testStart() {
		//데이터준비
		//file의 데이터를 ArrayList로 만들어서 준비
		ArrayList<GisaDataVO> list = this.readyData();
		//해당 문제풀이
		String answer2 = this.solveTwo(list);
		this.writeAnswer(answer2,2);
	}
	
	
	private void writeAnswer(String answer1,int order) {
		// TODO Auto-generated method stub
		// 해당하는 정답을 파일에 작성한다.
		String filePath = "./data/Ans"+order+".txt";
		
	}

	private String solveTwo(ArrayList<GisaDataVO> list) {
		// TODO Auto-generated method stub
		// 해당하는 문제를 해결하는 로직 작성
		return null;
	}

	private ArrayList<GisaDataVO> readyData() {
		// TODO Auto-generated method stub
		// 파일의 1000라인의 정보를 GisaDataVO를 이용하여 인스턴스로 만들고 ArrayList에 저장
		return null;
	}

	public void testString() {
		String line = "990001addx 17 29 16 49 43154CAC";
		             //0123456789012345678901234567890
		//6 4 3 3 3 3 3 3 1 1 1
		//학번과 국어점수를 분리하여 지시문에서 선언된 타입으로 변수에 할당하시오.
		int stdNo = Integer.parseInt(line.substring(0,6));
		int kor = Integer.parseInt(line.substring(10,13).trim());
		System.out.printf("stdNo = %d kor = %d %n", stdNo,kor);
	}

}
