package mc.ys.lesson10;

import java.util.Random;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayMain am = new ArrayMain();
		am.makeCardV2();
	}
	
	public void makeCardV1() {
		int[] spade = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int[] heart = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int[] diamond = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int[] clover = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		int[][] card = {spade,heart,diamond,clover};
		
		int size1 = card.length;
		int size2 = card[0].length;
		System.out.printf("size1 is %d, size2 is %d %n", size1,size2);
		
		int oneOfCard = card[0][11];
		System.out.println(oneOfCard);
		
	}
	
	public void makeCardV2() {
		String[][] deck = new String[4][13]; //Heart-1
		//deck[0][0] = "Heart-1";
		String[] suite = {"Spade","Heart","Diamond","Clover"};
		for(int i=0;i<deck.length;i++) {
			for(int j=0;j<deck[i].length;j++) {
				deck[i][j] = suite[i]+"-"+(j+1);
			}
		}
		this.shuffle(deck);
		this.printCard(deck);
	}
	public void shuffle(String[][] deck) {
		Random r = new Random();
		for(int i=0;i<100;i++){
			int r1 = r.nextInt(4);
			int c1 = r.nextInt(13);

			int r2 = r.nextInt(4);
			int c2 = r.nextInt(13);	

			String temp = deck[r1][c1];
			deck[r1][c1] = deck[r2][c2];
			deck[r2][c2] = temp;
		}
	}
	public void printCard(String[][] deck) {
		for(int i=0;i<deck.length;i++) {
			for(int j=0;j<deck[i].length;j++) {
				System.out.println(deck[i][j]);
			}
		}
	}
	

}
