package sec04;

public class D0628_01_printf1 {

	public static void main(String[] args) {

		// println, print, printf
//		System.out.println("������");
//		System.out.print("������");
//		System.out.print("����");

		// printf("���Ĺ��ڿ�", ��1, ��2, ��3,....);
//		System.out.printf("�̸� : %s", "������");
//		System.out.println();
//		System.out.printf("���� : %d", 124);

//		System.out.printf("�̸� : %s, �ּ� : %s, ��ȣ : %d", "������", "���� �ϱ�", 14);
		// �̸� : ������, �ּ� : ���� �ϱ�, ��ȣ : 14
		System.out.printf("�ּ� : %2$s, �̸� : %1$s, ��ȣ : %3$d", "������", "���� �ϱ�", 14);
		// 1$ : ���� 1��°�� �ִ´�, 2$ : ���� 2��°�� �ִ´�

	}

}
