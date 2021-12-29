package mc.ys.lecture;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수(int)형 변수 x, y, z 선언하세요
		int x = 1;
		int y = 2;
		int z = 3;
		
		int temp = x;
		x = y;
		y = z;
		z = temp;
		
	
		//x = 2
		//y = 3
		//z = 1
		
		System.out.printf("x = %d \n",x);
		System.out.printf("y = %d \n",y);
		System.out.printf("z = %d \n",z);
		
	}

}
