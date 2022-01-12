package mc.ys.test;

import java.util.ArrayList;
import java.util.Random;

public class NumberBaseballGame {
	private ArrayList<String> hiddenNumber;
	//요청된 네자리수에 대해 중복처리 여부 확인하여 결과 리턴
	
	public boolean isSameNumber(String number) {
		boolean flag = false;
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<number.length();i++) {
			String num = String.valueOf(number.charAt(i));
			if(list.contains(num)) {
				flag = true;
				list = null;
				break;
			} else {
				list.add(num);
			}
		}
		return flag;
	}
	
	public void setHiddenNumber(String number) { //1234
		for(int i=0;i<number.length();i++) {
			String num = String.valueOf(number.charAt(i));
			hiddenNumber.add(num);
		}
	}
	//중복되지 않은 4자리 숫자인 hiddenNumber 생성
	public void makeHiddenNumber(){
		ArrayList<String> tempNumber = new ArrayList<String>();
		while(true) {
			Random r = new Random();
			int number = r.nextInt(9000)+1000;
			System.out.printf("random number is %d %n", number);
			boolean flag = this.isSameNumber(String.valueOf(number));
			if(!flag) {
				hiddenNumber = new ArrayList<String>();
				this.setHiddenNumber(String.valueOf(number));
				break;
			}
		}
		
		//hiddenNumber = tempNumber;
	}
	
	public int[] judgeNumber(String tryNumber) {
		int[] result = {0,0}; //{strike, ball}
		ArrayList<String> compareNumber = this.transfer(tryNumber);
		for(int i=0;i<hiddenNumber.size();i++) {
			for(int j=0;j<compareNumber.size();j++) {
				if(hiddenNumber.get(i).equals(compareNumber.get(j))) {
					if(i==j) {
						result[0]++;
					} else {
						result[1]++;
					}
				}
			}
		}
		return result;
	}
	private ArrayList<String> transfer(String tryNumber) {
		// TODO Auto-generated method stub
		ArrayList<String> tempList = new ArrayList<String>();
		for(int i=0;i<tryNumber.length();i++) {
			String temp = String.valueOf(tryNumber.charAt(i));
			tempList.add(temp);
		}
		return null;
	}

	//hiddenNumber하고 사용자가 입력한 숫자 비교하여 결과 리턴 - 가장 중요한 기능
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s %s %s", hiddenNumber.get(0),hiddenNumber.get(1),hiddenNumber.get(2),hiddenNumber.get(3));
	}
}
