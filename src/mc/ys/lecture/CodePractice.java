package mc.ys.lecture;

public class CodePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2021년 8월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int day = 1;
		for(int i=0;i<31;i++) { //i = i + 1;
			System.out.print(day+"\t");
			if(day%7==0) {//day==7||day==14||day==21||day==28
				System.out.println();
			}
			day = day + 1;
		}
		
		
		
	}

}
