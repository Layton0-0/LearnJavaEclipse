package mc.ys.lesson12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class IOTest {

	public static void main(String[] args) {
		IOTest test = new IOTest();
		String[] allData = new String[10];
		String[] name = {"Kim", "Lee", "Park", "Choi", "Ryu", "Ko", "Il", "Koo", "Baek", "Hong"};
//		String data = "";
//		data = test.makeData("Kim");
//		System.out.println(data);
		allData = test.makeData2(name);
		try {
//			test.writeData(allData);
			test.writeData2(allData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showData(String[] data) {
		for(String d: data)
			System.out.printf("%s ", d);
	}
	
	public String makeData(String name) {
		String[] data = new String[4];
		data[0] = name;
		Random rand = new Random();
		for(int i = 1; i < data.length; i++) {
			data[i] = String.valueOf(rand.nextInt(100) + 1);
		}		
		String resultData = String.join(",", data);
		return resultData;
	}
	
	public String[] makeData2(String[] allData) {
		for(int i = 0; i < 10; i++) {
			String[] data = new String[4];
			data[0] = allData[i];
			Random rand = new Random();
			for(int j = 1; j < data.length; j++) {
				data[j] = String.valueOf(rand.nextInt(100) + 1);
			}		
			allData[i] = String.join(",", data);			
		}
		return allData;
	}
	
	public void writeData(String data) throws IOException {
		File file = new File("./data/student.csv");
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(data);
		
		pw.close();
		fw.close();
	}
	
	public void writeData2(String[] allData) throws IOException {
		File file = new File("./data/student.csv");
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		for(String data: allData)
			pw.println(data);
		
		pw.close();
		fw.close();
	}

}
