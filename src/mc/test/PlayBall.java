package mc.test;
import java.util.Random;
import java.util.Scanner;

public class PlayBall {

	public static void main(String[] args) {
		PlayBall playBall = new PlayBall();
		playBall.playGame();
	}
	
	// 1.�떆�뒪�뀥�� 以묐났�씠 �뾾�뒗 4�옄由� �닽�옄瑜� �깮�꽦�븳�떎.(泥� 踰덉㎏ �닽�옄�뒗 0�씠 �븘�땲�뼱�빞 �븳�떎.)
	String makeNum() {
		String num = "";
		int[] temp = {0, 0, 0, 0};
		final int MAX_NUM = 4;
		Random rand = new Random();
		
		for(int i = 0; i < MAX_NUM; i++) {
			temp[i] = rand.nextInt(9) + 1;
			for(int j = 0; j < i; j++) {
				if(temp[i] == temp[j]) {
					i--;
				}
			}
		}
		
		for(int e: temp) 
			num += e;
		
		return num;
	}
	
	// 2. 寃뚯엫 李멸��옄�뒗 �엫�쓽�쓽 4�옄由� �닽�옄瑜� �엯�젰�븳�떎.
	String getNum() {
		Scanner sc = new Scanner(System.in);
		String num;
		//4�옄由щ�� 諛쏆쓣 �븣源뚯� 諛섎났
		while(true) {
			System.out.print("4자리 숫자를 입력해주세요: ");
			num = sc.next();
			
			if(num.length() == 4)
				break;
			System.out.println("숫자를 정확하게 입력해주세요.");
		}
		
		return num;
	}
	
	// 3. �떆�뒪�뀥�� �엯�젰�맂 4�옄由� �닔瑜� �옄�떊�씠 媛�吏�怨� �엳�뒗 �닔�� 鍮꾧탳�븯�뿬 �닽�옄媛� 媛숈쑝硫댁꽌 �닽�옄 �옄由ш� 
	// 媛숈쑝硫� �뒪�듃�씪�씠�겕, �닽�옄媛� 媛숈쑝硫댁꽌 �닽�옄 �옄由ш� ��由щ㈃ 蹂쇰줈 �뙋�젙�븳�떎.
	// 1�쓣 �뒪�듃�씪�씠�겕, 2瑜� 蹂쇰줈 吏��젙.
	int[] compareNum(String comNum, String userNum) {
		int[] result = new int[2]; // �뒪�듃�씪�씠�겕, 蹂� �닚�꽌
		for(int i = 0; i < comNum.length(); i++) {
			for(int j = 0; j < userNum.length(); j++) {
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
	// 4. 4�뒪�듃�씪�씠�겕媛� �굹�삱 �븣源뚯� 怨꾩냽�빐�꽌 寃뚯엫�쓣 吏꾪뻾�븳�떎. 寃뚯엫 李멸��옄媛� 湲곌텒 �쓽�궗瑜� �몴�떆�븯嫄곕굹
	// 4�뒪�듃�씪�씠�겕媛� �굹�삤硫� 寃뚯엫�� 醫낅즺�맂�떎.
	
	// 3296 + 2136 => 1�뒪�듃�씪�씠�겕 2蹂�
	void playGame() {
		Scanner sc = new Scanner(System.in);
		int[] result = new int[2];
		String comNum;
		String userNum;
		
		while(true) {
			comNum = makeNum();
			userNum = getNum();
			result = compareNum(comNum, userNum);
			System.out.printf("컴퓨터 숫자: %s \t유저 숫자: %s\n", comNum, userNum);
			System.out.printf("%d 스트라이크 %d 볼", result[0], result[1]);
			System.out.print("그만두려면 1, 계속하려면 아무 숫자나 눌러주세요: ");
			int doOrNot = sc.nextInt();
			if(doOrNot == 1) {
				System.out.println("아쉽습니다!");
				break;
			}
			if(result[0] == 4) {
				System.out.println("축하합니다! 4개의 숫자가 일치합니다!");
				break;
			}
		}
		
		
		sc.close();
	}

}
