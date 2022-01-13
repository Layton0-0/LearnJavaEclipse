package mc.ys.lesson11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GisaTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GisaTest01 gt = new GisaTest01();
		//gt.testString();
		gt.testStart();
		
	}
	
	public void testStart() {
		//데이터준비
		try {
			//file의 데이터를 ArrayList로 만들어서 준비
			ArrayList<GisaDataVO> list = this.readyData();
			String answer2 = this.solveTwo(list);
			//해당 문제풀이
			this.writeAnswer(answer2,2);
			
			String answer4 = this.solveFour(list);
			//해당 문제풀이
			this.writeAnswer(answer4,4);
			
		} catch(FileNotFoundException ie) {
			System.out.println("정답작성중 FNF에러");
		} catch(IOException e) {
			System.out.println("정답작성중 IO에러");
		}
	}
	
	
	private String solveFour(ArrayList<GisaDataVO> list) {
		// TODO Auto-generated method stub
		String answer = null;
		int count = 0; //누적을 저장하는 변수
		for(GisaDataVO vo : list) {
			int point = 15; //지역코드 C의 값으로 초기화
			if(vo.getAccCode().equals("A")||vo.getAccCode().equals("B")) {
				if(vo.getLocCode().equals("A")) {
					point = 5;
				} else if(vo.getLocCode().equals("B")) {
					point = 10;
				}
			}
			int total = vo.getKor()+point;
			if(total>=50) {
				count++;//count += 1, count = count + 1
			}
		}
		answer = String.valueOf(count);
		return answer;
	}

	private void writeAnswer(String answer,int order) throws IOException { //1~4번까지 모두 사용
		// TODO Auto-generated method stub
		// 해당하는 정답을 파일에 작성한다.
		String filePath = "./data/Ans"+order+".txt";
		File file = new File(filePath);
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(answer);
		pw.close();
		fw.close();
	}

	private String solveTwo(ArrayList<GisaDataVO> list) {
		// TODO Auto-generated method stub
		String answer = null;
		// 해당하는 문제를 해결하는 로직 작성(최대값 로직)
		int max = 0;
		GisaDataVO vo = null;
		for(int i=0;i<list.size();i++) {
			vo = list.get(i);
			if(vo.getLocCode().equals("B")) {
				if(max<(vo.getKor()+vo.getEng())) {
					max = vo.getKor()+vo.getEng();
				}
			}
		}
		answer = String.valueOf(max);
		return answer;
	}
	private String solveTwoV2(ArrayList<GisaDataVO> list) {
		// TODO Auto-generated method stub
		String answer = null;
		// 해당하는 문제를 해결하는 로직 작성(최대값 로직)
		int max = 0;
		for(GisaDataVO vo : list) {
			if(vo.getLocCode().equals("B")) {
				int temp = vo.getKor()+vo.getEng();
				max = max<temp?temp:max;
			}
		}
		answer = String.valueOf(max);
		return answer;
	}

	private ArrayList<GisaDataVO> readyData() throws FileNotFoundException, IOException  {
		// TODO Auto-generated method stub
		ArrayList<GisaDataVO> list = new ArrayList<GisaDataVO>();
		// 파일의 1000라인의 정보를 GisaDataVO를 이용하여 인스턴스로 만들고 ArrayList에 저장
		// 파일에 접속해서 스트림에 연결
		File file = new File("./data/Abc1115.txt");
		FileReader fr = new FileReader(file);
		// 한줄씩 읽기
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		GisaDataVO vo = null;
		while((line=br.readLine())!=null) {
			//한줄을 분석해서
			int stdNo = Integer.parseInt(line.substring(0,6));
			String email = line.substring(6,10);
			int kor = Integer.parseInt(line.substring(10,13).trim());
			int eng = Integer.parseInt(line.substring(13,16).trim());
			int math = Integer.parseInt(line.substring(16,19).trim());
			int sci = Integer.parseInt(line.substring(19,22).trim());
			int hist = Integer.parseInt(line.substring(22,25).trim());
			int total = Integer.parseInt(line.substring(25,28).trim());
			String mgrCode = line.substring(28,29);
			String accCode = line.substring(29,30);
			String locCode = line.substring(30,31);
			// VO객체에 할당하고 
//			vo = new GisaDataVO();
//			vo.setStdNo(stdNo);
//			vo.setEmail(email);
//			vo.setKor(kor);
//			vo.setEng(eng);
//			vo.setMath(math);
//			vo.setSci(sci);
//			vo.setHist(hist);
//			vo.setTotal(total);
//			vo.setMgrCode(mgrCode);
//			vo.setAccCode(accCode);
//			vo.setLocCode(locCode);
			//리스트에 저장(리스트는 이미 존재해야 함)
			list.add(vo);
		}
		br.close();
		fr.close();
		return list;
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


