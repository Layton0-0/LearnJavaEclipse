package javaProject2;

public class BookTest {

	public static void main(String[] args) {
		Book javaPro = new Book("B001", "�ڹ� ���α׷���", "ȫ�浿", 25000, 2021, "��Ƽ���ǻ�");
		Book javaScript = new Book("B002", "�ڹٽ�ũ��Ʈ", "�̸���", 30000, 2020, "�������ǻ�");
		Book hc = new Book("B003", "HTML/CSS", "������", 18000, 2021, "�������ǻ�");
		
		Magazine javaWorld = new Magazine("M001", "�ڹ� ����", "ȫ�浿", 25000, 2021, "��Ƽ���ǻ�", 5);
		Magazine webWorld = new Magazine("M002", "�� ����", "�̸���", 30000, 2020, "�������ǻ�", 7);
		Magazine gameWorld = new Magazine("M003", "���� ����", "������", 18000, 2021, "�������ǻ�", 9);
		
		System.out.println("������ȣ\t ������\t\t ����\t ����\t ������\t ���ǻ�");
		System.out.println("-----------------------------------------------------------");
		System.out.println(javaPro);
		System.out.println(javaScript);
		System.out.println(hc);
				
		System.out.println("\n������ȣ\t ������\t ������\t ����\t ���࿬��\t ���ǻ�\t �����");
		System.out.println("-----------------------------------------------------------");
		System.out.println(javaWorld);
		System.out.println(webWorld);
		System.out.println(gameWorld);
	}

}
