package mc.ys.lesson11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileCopy fc = new FileCopy();
		try {
			fc.moveFile();
		} catch(IOException e) {
			System.out.println("복사중 문제 발생");
		}
		
	}
	
	public void moveFile() throws IOException{
		File srcFile = new File("./data/nvm-setupCopy.zip");
		File destFile = new File("./data/nvm-setup.zip");
		//ctrl+shift+O --> 자동 import
		FileInputStream fis = new FileInputStream(srcFile);
		
		FileOutputStream fos = new FileOutputStream(destFile);
		
		byte[] data = new byte[256];
		System.out.println("이동을 시작합니다.");
		long start = System.currentTimeMillis();
		while((fis.read(data))!=-1) { //-1은 파일의 끝이다라는 의미
			//복사하는 코드
			fos.write(data);
		}
		long end = System.currentTimeMillis();
		fis.close();
		fos.close();
		System.out.println("이동이 끝났습니다.");
		srcFile.delete();
		System.out.println((end - start)/1000 + "초가 소요되었습니다.");
	}
	
	public void copyFileVer2() throws IOException {
		//singleton.PNG 를 복사한다.
		File srcFile = new File("./data/singleton.PNG");
		File destFile = new File("./data/singletonCopy2.PNG");
		//ctrl+shift+O --> 자동 import
		FileInputStream fis = new FileInputStream(srcFile);
		
		FileOutputStream fos = new FileOutputStream(destFile);
		
		byte[] data = new byte[256];
		System.out.println("복사를 시작합니다.");
		while((fis.read(data))!=-1) { //-1은 파일의 끝이다라는 의미
			//복사하는 코드
			fos.write(data);
		}
		
		fis.close();
		fos.close();
		System.out.println("복사가 끝났습니다.");
	
	}
	
	public void copyFile() throws IOException {
		//singleton.PNG 를 복사한다.
		File srcFile = new File("./data/singleton.PNG");
		File destFile = new File("./data/singletonCopy.PNG");
		//ctrl+shift+O --> 자동 import
		FileInputStream fis = new FileInputStream(srcFile);
		
		FileOutputStream fos = new FileOutputStream(destFile);
		
		int data = 0;
		System.out.println("복사를 시작합니다.");
		while((data=fis.read())!=-1) { //-1은 파일의 끝이다라는 의미
			//복사하는 코드
			fos.write(data);
		}
		
		fis.close();
		fos.close();
		System.out.println("복사가 끝났습니다.");
	
	}

}
