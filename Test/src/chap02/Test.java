package chap02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// Q1)
//		String name = "���ڹ�";
//		int age = 25;
//		String tel1 = "010", tel2 = "123", tel3 = "4567";
//		
//		System.out.println("�̸� : " + name);
//		System.out.print("���� : " + age + "\n");
//		System.out.printf("��ȭ : %1$s-%2$s-%3$s", tel1, tel2, tel3);

		// Q2)
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("ù��° �� : ");
//		String strNum1 = scanner.nextLine();
//		System.out.print("�ι�° �� : ");
//		String strNum2 = scanner.nextLine();
//		
//		int num1 = Integer.parseInt(strNum1);
//		int num2 = Integer.parseInt(strNum2);
//		int result = num1 + num2;
//		System.out.println("���� ��� : " + result);

		// ������ ���
//		System.out.print("ù��° �� : ");
//		int strNum1 = scanner.nextInt();	// nextInt() : intŸ���� �ڷ��� �� �Է�
//		System.out.print("�ι�° �� : ");
//		int strNum2 = scanner.nextInt();
//		int result = strNum1 + strNum2;
//		System.out.println(result);

//		System.out.print("�����Է� : ");
////		String a = scanner.next();		// ���ڿ� -> ���� �Ұ�
////		System.out.println(a);
//		String a = scanner.nextLine();	// ���ڿ� -> ���� ����	// enter ġ�� ������ ���� �� ����
//		System.out.println(a);

		// �������� Ÿ������ �Է� ����
		// �Է��ϰ��� �ϴ� Ÿ�� -> next.Ÿ��();

		// Q3)
		Scanner sc = new Scanner(System.in);
		System.out.println("[�ʼ� ���� �Է�]");
		System.out.print("1. �̸� : ");
		String name = sc.nextLine();
		System.out.print("2. �ֹι�ȣ �� 6�ڸ� : ");
		String ssn = sc.nextLine();
		System.out.print("3. ��ȭ��ȣ : ");
		String tel = sc.nextLine();
		System.out.println("\n[�Է��� ����]\n" + name + "\n" + ssn + "\n" + tel);

	}

}
