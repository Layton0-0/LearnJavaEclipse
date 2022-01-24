package mc.ys.lesson9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class SortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortMain sm = new SortMain();
		try {
			//sm.makeData();
			ScoreCard[] cards = sm.getCards();
			sm.sort(cards);
			sm.print(cards);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void print(ScoreCard[] cards) {
		// TODO Auto-generated method stub
		for(ScoreCard card : cards) {
			System.out.println(card);
		}
	}
	private void sort(ScoreCard[] cards) {
		// TODO Auto-generated method stub
		for(int i=0;i<cards.length-1;i++) {
			for(int j=i+1;j<cards.length;j++) {
				if(cards[j].getKor()-cards[i].getKor()<0) {
					ScoreCard temp = cards[i];
					cards[i] = cards[j];
					cards[j] = temp;
				} else if(cards[i].getKor()==cards[j].getKor()) {
					if(cards[i].getMath() - cards[j].getMath() <0) {
						ScoreCard temp = cards[i];
						cards[i] = cards[j];
						cards[j] = temp;
					}
				}
			}
		}
	}
	public ScoreCard[] getCards() throws IOException {
		ScoreCard[] cards = new ScoreCard[10];
		FileReader fr = new FileReader(new File("data.txt"));
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		int count = 0;
		while((line=br.readLine())!=null) {
			String[] temp = line.split(",");
			cards[count++] = new ScoreCard(temp[0],Integer.parseInt(temp[1]),Integer.parseInt(temp[2]),Integer.parseInt(temp[3]));
		}
		return cards;
	}
	public void makeData() throws IOException {
		Random r = new Random();
		FileWriter fw = new FileWriter(new File("data.txt"));
		PrintWriter pw = new PrintWriter(fw);
		String[] names = {"Kim","Lee","Park","Choi","Ryu","Ko","Il","Koo","Baek","Hong"};
		for(int i=0;i<10;i++) {
			int idx1 = r.nextInt(101);
			int idx2 = r.nextInt(101);
			int idx3 = r.nextInt(101);
			String data = String.format("%s,%d,%d,%d", names[i],idx1,idx2,idx3);
			pw.println(data);
		}
		pw.close();
		fw.close();
	}

}
