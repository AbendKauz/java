package dayTest;

import java.util.Scanner;

public class Test0708_Comment {

	public static void main(String[] args) {

		// 1. ���� 2���� �Է¹޾� ��Ģ���� ��� ���

//		Scanner s = new Scanner(System.in);
//		// -> java.util package�� Scanner class�� memory�� �ø��� s��� ���������� ���
//		// class�� memory�� �ø���? : instance
//		// ��������(= ������(�ּ�)�� �����ϰ� �ִ� ����)
//		
//		// new -> memory�� �ش� class�� �ø��� keyword
//		String str = "aaa";
//		String str2 = new String("aaa");
//				
//		Scanner s = new Scanner(System.in);
//		System.out.print("ù ��° ���� �Է� : ");
//		int num1 = s.nextInt();
//				
//		System.out.print("�� ��° ���� �Է� : ");
//		int num2 = s.nextInt();
//				
//		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//		// ū �� - ���� �� ���� ����ϰ� ���� �� : 
//		// int result = (num1>num2) ? num1 - num2 : num2 - num1 ;
////		System.out.println(num1 + " - " + num2 + " = " + result);
//		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
//		System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));

		// 2. 1���� 45 ������ ���� ���� 6�� ���

		// import java.util.Scanner; // java.util package�� Scanner class ���
		// import java.util.ArrayList; // java.util package�� ArrayList class ���
		// import java.util.HashMap; // java.util package�� HashMap class ���

		// improt java.util.*; // java.util package�� ��� class ���
		// Math.random(); // Math class : java.lang package
		// -> java ���� �� �⺻������ import �Ǿ�����(= static)
		// => �׳� ��� ����(new ���� �� ������ �ߺ����� error)

		// Math class : ���α׷� ���� �� �̹� �޸𸮿� �ö�����
		// => static : ����
		// Math m = new Math(); // �̹� �޸𸮿� �ö��־� error
//		Math.random();	// Math��� Ŭ������ random() �޼ҵ� ���
//		// 0.0 <= Math.random() <= 1.0
//		System.out.println(Math.random());
//
//		// 0 ~ 1
//		// (int)(0.0) <= (int)(Math.random()) < (int)(1.0)								
//		// 0 ~ 9
//		// (int)(0.0 * 10) <= (int)(Math.random() * 10) < (int)(1.0 * 10)				
//		// 1 ~ 10
//		// (int)(0.0 * 10) + 1 <= (int)(Math.random() * 10) + 1 < (int)(1.0 * 10) + 1	
//		
//		for(int i = 0; i < 6; i++) {
//			System.out.println((int)(Math.random() * 45) + 1);
//		}
//		
//		
//		// 3. ���� �ϳ��� �Է¹޾� �ڼ� ���� ���
//		
//		Scanner s = new Scanner(System.in);
//		System.out.print("�ڼ��Ǻ��� ���� �Է� : ");
//		int num = s.nextInt();
//		
//		for (int i = 2; i < num; i++) {
//			if(num % i == 0) {
//				System.out.println("�ڼ� �ƴ�");
//				System.exit(0);		// ���α׷� ���� ����
//			// 0 : ��������	
//			// 1 : ����������
//			}else {
//				continue;
//			}
//		}
//		System.out.println("�ڼ�");
//		
//		// 3.1. 1~100���� �� �߿��� �ڼ��� ���� ���
//		
//		int cnt = 2;	// �ڼ������� ���������� ����(1�� �ڼ��̹Ƿ� �̸� ī����)
//		boolean chk;	// �ڼ��Ǻ��� üũ�� ���� ����
//		
//		for(int i = 3; i <= 100; i++) {		// i = �ڼ��Ǻ��� ��
//			chk = false;			// ���� chk�� false�� �ʱ�ȭ
//			for(int j = 2; j < i; j++) {	// j = �������� ���ϱ� ���� ������ (2 ~ �ڽ� - 1)
//				if(i % j == 0) {	// �ڼ��� �ƴ�
//					chk = true;
//				}
//			}
//			if(!chk) {
//				cnt++;				// �ڼ� ���� ����
//			}
//		}
//		System.out.println("1���� 100������ �ڼ� ���� : " + cnt);

		// 4. �� ���� �Է¹޾� �� �� ������ ������ 10�� ���

		// 1 ~ 10
		// (int)(0.0 * 10) + 1 <= (int)(Math.random() * 10) + 1 < (int)(1.0 * 10) + 1
		// 2 ~ 10
		// (int)(0.0 * 9) + 2 <= (int)(Math.random() * 9) + 2 < (int)(1.0 * 9) + 2
		// 5 ~ 20
		// (int)(0.0 * (20-5+1)) + 5 <= (int)(Math.random() * (20-5+1)) + 5 < (int)(1.0
		// * (20-5+1)) + 5
		// 13 ~ 34
		// (int)(0.0 * (34-13+1)) + 13 <= (int)(Math.random() * (34-13+1)) + 13 <
		// (int)(1.0 * (34-13+1)) + 13

//		Scanner s = new Scanner(System.in);
//		System.out.print("ù°�� : ");
//		int n1 = s.nextInt();
//		System.out.print("��°�� : ");
//		int n2 = s.nextInt();
//		
//		int max, min;	// ũ�⿡ ���� ���� ������ ����
//		if(n1 > n2) {	// n1�� n2���� ũ��
//			max = n1;	// max�� n1
//			min = n2;	// min�� n2
//		}else {			// n1�� n2���� ������
//			max = n2;	// max�� n2
//			min = n1;	// min�� n1
//		}
//		
//		System.out.println(min + "���� " + max + "���� ������ ���");
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println((int)(Math.random() * (max - min + 1) + min));
//		}

	}

}
