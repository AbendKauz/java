package sec01;

import java.util.Scanner;

public class D0705_01_if��7 {

	public static void main(String[] args) {

		// ����1, �����ȣ, ����2�� Ű����� �Է¹޾� num1, z, num2 ������ ����
		// num1, z, num2�� Ȱ���Ͽ� +, -, *, / �� �ϴ� �ڵ� �ۼ�
		// (if - else if - else�� ���)

		// [console]
		// ����1 �Է� : 10 15
		// �����ȣ �Է� : + /
		// ����2 �Է� : 2 4
		// _________ 10+2=12 15/4=3.75

		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�����ȣ �Է� : ");
		// nextLine() ���� Enter���� �����־� �޼ҵ� ���������(����)
		// next() : ���� ������ �Է¹��� ���ڿ��� return
		// nextLine() : Enter�� ġ�� ������ �� ���ڿ��� ��� return
		String z = sc.next();
		// nextLine()����Ϸ��� �Ʒ����� enter���� ���־� ��
		// - enter������ ����Ǽ� ���ϴ� ���� �ȳ���(����)
//		String z = sc.nextLine();
//		sc.nextLine();
		System.out.print("���� 2 �Է� : ");
		int num2 = sc.nextInt();

		if (z.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		} else if (z.equals("-")) {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		} else if (z.equals("*")) {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		} else if (z.equals("/")) {
			System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));
		} else {
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
		}

	}

}
