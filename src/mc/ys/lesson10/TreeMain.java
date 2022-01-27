package mc.ys.lesson10;

import java.util.Scanner;

public class TreeMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMain tm = new TreeMain();
		tm.startOfDataManagement();
	}
	
	public void startOfDataManagement() {
		BinTree<Integer, Data> tree = new BinTree<Integer, Data>();
		Data data;								// 추가용 데이터 참조
		Data ptr;								// 검색용 데이터 참조
		
		String menu = "(0) 삽입 (1) 삭제 (2) 검색 (3) 출력 (4) 종료 ";
		Scanner scan = new Scanner(System.in);
		Data temp = new Data(scan);	
		boolean flag = false;
		while(!flag) {
			System.out.println(menu);
			System.out.print("메뉴를 선택하세요 >>> ");
			int choice = scan.nextInt();
			
			switch(choice) {
				case 0:
					data = new Data(scan);
			 		data.scanData("삽입", Data.NO | Data.NAME);
			 		tree.add(data.keyCode(), data);
					//System.out.println("삽입정보를 입력하세요");
					break;
				case 1:
					temp.scanData("삭제", Data.NO);
			 		tree.remove(temp.keyCode());
					//System.out.println("삭제정보를 입력하세요");
					break;
				case 2:
					temp.scanData("검색", Data.NO);
			 		ptr = tree.search(temp.keyCode());
			 		if (ptr != null)
						System.out.println("그 번호의 이름은 " + ptr + "입니다.");
					else
			 			System.out.println("해당 데이터가 없습니다.");
					//System.out.println("검색정보를 입력하세요");
					break;
				case 3:
					tree.print();
					//System.out.println("출력정보를 입력하세요");
					break;
				case 4:
					System.out.println("종료합니다.");
					flag = true;		
			}
		}
		scan.close();
	}

}
