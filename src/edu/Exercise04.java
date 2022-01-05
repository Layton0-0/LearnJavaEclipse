package edu;

public class Exercise04 {

	public static void main(String[] args) {
		int[] score = {90, 85, 78, 100, 98};
		
		int sum = 0;
		double avg = 0.0;
		int max = 0;
		int min = 999;
		
		// 총점, 평균, 최대값, 최소값을 구합니다.
		for(int eScore: score) {
			sum += eScore;
			if(max <= eScore)
				max = eScore;
			if(min >= eScore)
				min = eScore;
		}
		avg = (double)sum / score.length;
		
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);

	}

}
