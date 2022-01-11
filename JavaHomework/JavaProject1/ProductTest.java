package JavaProject1;

public class ProductTest {

	public static void main(String[] args) {
		Product laptop = new Product("001", "노트북", 1200000, 2021, "삼성");
		Product monitor = new Product("002", "모니터", 300000, 2021, "LG");
		Product mouse = new Product("003", "마우스", 30000, 2020, "로지텍");
		
		
		System.out.println("상품번호\t상품명 \t가격 \t연도 \t제조사");
		System.out.println("-------------------------------------");
		System.out.println(laptop);
		System.out.println(monitor);
		System.out.println(mouse);
		

	}

}
