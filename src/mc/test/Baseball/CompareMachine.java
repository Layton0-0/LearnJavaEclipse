package mc.test.Baseball;

public class CompareMachine {
	private static final int NUM_LEN = 4;
	String comNum;
	String userNum;
	
	public CompareMachine(String comNum, String userNum){
		this.comNum = comNum;
		this.userNum = userNum;
	}
	
	int[] compareNums(){
		int[] result = new int[2];
		for(int i = 0; i < NUM_LEN; i++) {
			for(int j = 0; j < NUM_LEN; j++) {
				if(comNum.charAt(i) == userNum.charAt(j)) {
					result[1]++;
				}
			}
			if(comNum.charAt(i) == userNum.charAt(i)) {
				result[1]--;
				result[0]++;
			}
		}
		return result;
	}
	
	int getResult(int result) {
		return result;
	}
}
