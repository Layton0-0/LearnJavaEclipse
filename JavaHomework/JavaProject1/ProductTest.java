package javaProject1;

public class ProductTest {

	public static void main(String[] args) {
		Product laptop = new Product("001", "��Ʈ��", 1200000, 2021, "�Ｚ");
		Product monitor = new Product("002", "�����", 300000, 2021, "LG");
		Product mouse = new Product("003", "���콺", 30000, 2020, "������");
		
		
		System.out.println("��ǰ��ȣ\t��ǰ�� \t���� \t���� \t������");
		System.out.println("-------------------------------------");
		System.out.println(laptop);
		System.out.println(monitor);
		System.out.println(mouse);
		

	}

}
