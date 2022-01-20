package studySql;

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
//		ArrayList<GisaDataVO> list;
		try {
//			list = this.readyData();
			
			this.solveOne();

//			String answer2 = this.solveTwo(list);
//			this.writeAnswer(answer2, 2);
//
//			String answer2_1 = this.solveTwoV2(list);
//			System.out.println("강사님 정답: " + answer2_1);
//
//			String answer3 = this.solveThree(list);
//			this.writeAnswer(answer3, 3);
//
//			String answer3_1 = this.solveThree_1(list);
//			System.out.println("강사님 정답: " + answer3_1);
//			
//			this.solveThree_2();
//
//			this.solveFour();
//			
//			this.solveFour_1();

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

	private void solveOne() throws NumberFormatException, IOException {
		ArrayList<GisaDataVO> list = this.readyData();
		ArrayList<GisaDataVO> data = new ArrayList<>();
		// 지역코드가 B인 데이터 찾기.
		for(GisaDataVO temp: list) {
			if (temp.getLocCode().equals("B")) 
				data.add(temp);
		}
		// 국어+영어 내림차순 정렬 + 동일 학번에 대한 오름차순 정렬
//		Collections.sort(data, new Comparator<GisaDataVO>() {
//
//			@Override
//			public int compare(GisaDataVO o1, GisaDataVO o2) {
//				int result = 0;
//				result = (o2.getKor() + o2.getEng()) - (o1.getKor() + o1.getEng());
//				if(result == 0) {
//					result = o2.getStdNo() - o1.getStdNo();
//				}
//				return result;
//			}
//
//		});
		
		Collections.sort(data, new MyComparator());
		this.print(data);

		System.out.println("5번째 학번은 " + Integer.toString(data.get(4).getStdNo()));
		String answer1 = Integer.toString(data.get(4).getStdNo());
		
		this.writeAnswer(answer1, 1);
	}

	private void print(ArrayList<GisaDataVO> temp) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			GisaDataVO vo = temp.get(i);
			System.out.println(vo);
		}
	}

	private String solveTwo(ArrayList<GisaDataVO> list) {
		// 해당하는 문제를 해결하는 로직 작성
		ArrayList<GisaDataVO> data = new ArrayList<>();
		// 지역코드가 B인 데이터 찾기.
		for (int i = 0; i < list.size(); i++) {
			GisaDataVO temp = list.get(i);
			if (temp.getLocCode().equals("B")) {
				data.add(temp);
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

		System.out.println("가장 큰값은 " + Integer.toString(data.get(0).getKor() + data.get(0).getEng()));
		String answer2 = Integer.toString(data.get(0).getKor() + data.get(0).getEng());

		return "가장 큰값은 " + answer2;
	}

	// 강사님 정답
	private String solveTwoV2(ArrayList<GisaDataVO> list) {
		// TODO Auto-generated method stub
		String answer = null;
		// 해당하는 문제를 해결하는 로직 작성(최대값 로직)
		int max = 0;
		for (GisaDataVO vo : list) {
			if (vo.getLocCode().equals("B")) {
				int temp = vo.getKor() + vo.getEng();
				max = max < temp ? temp : max;
			}
		}
		answer = String.valueOf(max);
		return answer;
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

	private String solveThree_1(ArrayList<GisaDataVO> list) {
		// TODO Auto-generated method stub
		String answer = null;
		int sum = 0; // 총점+point 누계
		for (GisaDataVO vo : list) {
			int point = 20; // 담임코드 C의 값으로 초기화
			if (vo.getEng() + vo.getMath() >= 120) {
				if (vo.getMgrCode().equals("A")) {
					point = 5;
				} else if (vo.getMgrCode().equals("B")) {
					point = 15;
				}
				int total = vo.getTotal() + point; // 총점+point
				sum = sum + total;
			}

		}
		answer = String.valueOf(sum);
		return answer;
	}
	
	private void solveThree_2() throws IOException {
		ArrayList<GisaDataVO> list = this.readyData();
		String answer = null;
		int sum = 0; // 총점+point 누계
		for (GisaDataVO vo : list) {
			int point = 20; // 담임코드 C의 값으로 초기화
			if (vo.getEng() + vo.getMath() >= 120) {
				if (vo.getMgrCode().equals("A")) {
					point = 5;
				} else if (vo.getMgrCode().equals("B")) {
					point = 15;
				}
				int total = vo.getTotal() + point; // 총점+point
				sum = sum + total;
			}

		}
		answer = String.valueOf(sum);
		this.writeAnswer(answer, 3);
	}

	private void solveFour() throws NumberFormatException, IOException {
		ArrayList<GisaDataVO> list = this.readyData();
		ArrayList<GisaDataVO> data = new ArrayList<>();
		int result = 0;
		// 성취도가 A 또는 B인 데이터 찾기.
		for (int i = 0; i < list.size(); i++) {
			GisaDataVO temp = list.get(i);
			if (temp.getAccCode().equals("A") || temp.getAccCode().equals("B")) {
				data.add(temp);
			}
		}
		// 지역코드에 따라 점수포인트를 더하기 + 50 이상인 건수 세기
		for (int i = 0; i < data.size(); i++) {
			GisaDataVO temp = data.get(i);
			int point = 15;
			switch (temp.getLocCode()) {
			case "A":
				point = 5;
				break;
			case "B":
				point = 10;
				break;
			}
			point += temp.getKor();

			if (point >= 50)
				result++;

		}

		System.out.println(String.valueOf(result) + "건");
		String answer4 = String.valueOf(result) + "건";
		this.writeAnswer(answer4, 4);
	}

	private void solveFour_1() throws IOException {
		ArrayList<GisaDataVO> list = this.readyData();
		String answer = null;
		int count = 0; // 누적을 저장하는 변수
		for (GisaDataVO vo : list) {
			int point = 15; // 지역코드 C의 값으로 초기화
			if (vo.getAccCode().equals("A") || vo.getAccCode().equals("B")) {
				if (vo.getLocCode().equals("A")) {
					point = 5;
				} else if (vo.getLocCode().equals("B")) {
					point = 10;
				}
				int total = vo.getKor() + point;
				if (total >= 50) {
					count++;// count += 1, count = count + 1
				}
			}
			
		}
		answer = String.valueOf(count);
		this.writeAnswer(answer, 4);
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
