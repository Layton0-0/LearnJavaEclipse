package mc.ys.lesson11;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		FileTest ft = new FileTest();
		try {
			ft.testFileYoon();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		}
		

	}
	
	public void test() {
		File file = new File("./data/Abc1115.txt");
		
		if(file.exists()) {
			System.out.println("Name of the file is " + file.getName());
			System.out.println("Size of the file is " + file.length() + " bytes");
		} else {
			System.out.println("File is not exist");
		}
	}
	
	public void testFileReader() {
		// Abc.1115.txt에 연결하는 File인스턴스를 생성하시오.
		File file = new File("./data/Abc1115.txt");
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("해당 파일을 찾을 수 없습니다.");
			e.printStackTrace();
		}
	}
	
	public void testFileReader2() throws FileNotFoundException, IOException {
		// Abc.1115.txt에 연결하는 File인스턴스를 생성하시오.
		File file = new File("./data/Abc1115.txt");
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while((line = br.readLine()) != null) {//마지막까지 읽어들이면 null을 리턴함.
			System.out.println(line);
		}
		br.close(); //필터 먼저 닫고
		fr.close(); //메인 닫기
		
	}
	
	public void testFileCopy() throws FileNotFoundException, IOException {
		// Abc.1115.txt에 연결하는 File인스턴스를 생성하시오.
		File file = new File("./data/Abc1115.txt");
		File destFile = new File("./data/CopyAbc1115.txt");
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(destFile);
		PrintWriter pw = new PrintWriter(fw);
		
		String line = null;
		while((line = br.readLine()) != null) {//마지막까지 읽어들이면 null을 리턴함.
			System.out.println(line);
			pw.println(line);
		}
		br.close(); //필터 먼저 닫고
		fr.close(); //메인 닫기
		pw.close();
		fw.close();
		
	}

	public void testFileYoon() throws IOException {
		File file = new File("./data/Abc1115.txt");
		File nFile = new File("./data/YoonAbc1115.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		
		FileWriter fw = new FileWriter(nFile);
		PrintWriter pw = new PrintWriter(fw);
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
			pw.println(line);
		}
		pw.close();
		fw.close();
		br.close();
		fr.close();
		
	}
}
