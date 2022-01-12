package mc.ys.lesson11;

import java.util.*;
import java.io.*;

public class GisaTest {

	public static void main(String[] args) {
		GisaTest gt = new GisaTest();
		gt.testStart();
	}

	public void testStart() {
		// 데이터준비
		// file의 데이터를 ArrayList로 만들어서 준비
		ArrayList<GisaDataVO> list;
		try {
			list = this.readyData();
			String answer1 = this.solveOne(list);
			this.writeAnswer(answer1, 1);
			String answer2 = this.solveTwo(list);
			this.writeAnswer(answer2, 2);
			String answer3 = this.solveThree(list);
			this.writeAnswer(answer3, 3);
			String answer4 = this.solveFour(list);
			this.writeAnswer(answer4, 4);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 해당 문제풀이

	}

	private void writeAnswer(String answer, int order) throws IOException {
		// 해당하는 정답을 파일에 작성한다.
		String filePath = "./data/Ans" + order + ".txt";
		File ansFile = new File(filePath);
		FileWriter fw = new FileWriter(ansFile);
		PrintWriter pw = new PrintWriter(fw);

		pw.write(answer);

		pw.close();
		fw.close();

	}

	private String solveOne(ArrayList<GisaDataVO> list) {
		ArrayList<GisaDataVO> data = new ArrayList<>();
		int idx = 0;
		// 지역코드가 B인 데이터 찾기.
		for (int i = 0; i < list.size(); i++) {
			GisaDataVO temp = list.get(i);
			if (temp.getLocCode().equals("B")) {
				data.add(temp);
				idx++;
			}
		}
		// 국어+영어 내림차순 정렬 + 동일 학번에 대한 오름차순 정렬
		Collections.sort(data, new Comparator<GisaDataVO>() {

			@Override
			public int compare(GisaDataVO o1, GisaDataVO o2) {
				int plus1 = o1.getKor() + o1.getEng();
				int plus2 = o2.getKor() + o2.getEng();
				int stdNo1 = o1.getStdNo();
				int stdNo2 = o2.getStdNo();
				return plus1 > plus2 ? -1 : (plus1 == plus2 ? (stdNo1 < stdNo2 ? -1 : 1) : 1);
			}

		});

		System.out.println("5번째 학번은 " + Integer.toString(data.get(4).getStdNo()));
		String answer1 = Integer.toString(data.get(4).getStdNo());

		return "5번째 학번은 " + answer1;
	}

	private String solveTwo(ArrayList<GisaDataVO> list) {
		// 해당하는 문제를 해결하는 로직 작성
		ArrayList<GisaDataVO> data = new ArrayList<>();
		int idx = 0;
		// 지역코드가 B인 데이터 찾기.
		for (int i = 0; i < list.size(); i++) {
			GisaDataVO temp = list.get(i);
			if (temp.getLocCode().equals("B")) {
				data.add(temp);
				idx++;
			}
		}
		// 국어+영어 내림차순 정렬 + 동일 학번에 대한 오름차순 정렬
		Collections.sort(data, new Comparator<GisaDataVO>() {

			@Override
			public int compare(GisaDataVO o1, GisaDataVO o2) {
				int plus1 = o1.getKor() + o1.getEng();
				int plus2 = o2.getKor() + o2.getEng();
				int stdNo1 = o1.getStdNo();
				int stdNo2 = o2.getStdNo();
				return plus1 > plus2 ? -1 : (plus1 == plus2 ? (stdNo1 < stdNo2 ? -1 : 1) : 1);
			}

		});

		System.out.println("가장 큰값은 " + Integer.toString(data.get(1).getKor() + data.get(1).getEng()));
		String answer2 = Integer.toString(data.get(1).getKor() + data.get(1).getEng());

		return "가장 큰값은 " + answer2;
	}

	private String solveThree(ArrayList<GisaDataVO> list) {
		// 해당하는 문제를 해결하는 로직 작성
		ArrayList<GisaDataVO> data = new ArrayList<>();
		int result = 0;
		// 지역코드가 B인 데이터 찾기.
		for (int i = 0; i < list.size(); i++) {
			GisaDataVO temp = list.get(i);
			if ((temp.getEng() + temp.getMath()) >= 120) {
				data.add(temp);
			}
		}

		for (int i = 0; i < data.size(); i++) {
			GisaDataVO temp = data.get(i);
			switch (temp.getMgrCode()) {
			case "A": 
				result += (temp.getTotal() + 5);
				break;
				
			case "B": 
				result += (temp.getTotal() + 15);
				break;
			
			case "C": 
				result += (temp.getTotal() + 20);
				break;
			
			}
		}

		System.out.println("합계는 " + Integer.toString(result));
		String answer3 = Integer.toString(result);

		return "합계는 " + answer3;
	}

	private String solveFour(ArrayList<GisaDataVO> list) {
		// 해당하는 문제를 해결하는 로직 작성
		ArrayList<GisaDataVO> data = new ArrayList<>();
		int result = 0;
		// 성취도가 A 또는 B인 데이터 찾기.
		for (int i = 0; i < list.size(); i++) {
			GisaDataVO temp = list.get(i);
			if ((temp.getAccCode().equals("A") || temp.getAccCode().equals("B"))) {
				data.add(temp);
			}
		}
		// 지역코드에 따라 점수포인트를 더하기 + 50 이상인 건수 세기
		for (int i = 0; i < data.size(); i++) {
			GisaDataVO temp = data.get(i);
			int point = 0;
			switch (temp.getLocCode()) {
			case "A":
				point = temp.getKor() + 5;
				break;
			case "B":
				point = temp.getKor() + 10;
				break;
			case "C":
				point = temp.getKor() + 15;
				break;	
			}
			
			if(point >= 50)
				result++;
		}
			

		System.out.println(Integer.toString(result) + "건");
		String answer4 = Integer.toString(result) + "건";

		return answer4;
	}
	
	private ArrayList<GisaDataVO> readyData() throws NumberFormatException, IOException {
		// 파일의 1000라인의 정보를 GisaDataVO를 이용하여 인스턴스로 만들고 ArrayList에 저장
		String line = null;
		ArrayList<GisaDataVO> allData = new ArrayList<>();
		File file = new File("./data/Abc1115.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		while ((line = br.readLine()) != null) {
			int stdNo = Integer.parseInt(line.substring(0, 6));
			String email = line.substring(6, 10);
			int kor = Integer.parseInt(line.substring(10, 13).trim());
			int eng = Integer.parseInt(line.substring(13, 16).trim());
			int math = Integer.parseInt(line.substring(16, 19).trim());
			int sci = Integer.parseInt(line.substring(19, 22).trim());
			int hist = Integer.parseInt(line.substring(22, 25).trim());
			int total = Integer.parseInt(line.substring(25, 28).trim());
			String mgrCode = line.substring(28, 29);
			String accCode = line.substring(29, 30);
			String locCode = line.substring(30);
			allData.add(new GisaDataVO(stdNo, email, kor, eng, math, sci, hist, total, mgrCode, accCode, locCode));
		}

		br.close();
		fr.close();
		return allData;
	}

	public void testString() {
		String line = "990001addx 17 29 16 49 43154CAC";
		// 0123456789012345678901234567890
		// 6 4 3 3 3 3 3 3 1 1 1
		// 학번과 국어점수를 분리하여 지시문에서 선언된 타입으로 변수에 할당하시오.
		int stdNo = Integer.parseInt(line.substring(0, 6));
		int kor = Integer.parseInt(line.substring(10, 13).trim());
		System.out.printf("stdNo = %d kor = %d %n", stdNo, kor);
	}

}
