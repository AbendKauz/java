package sec02;

import java.util.Scanner;

public class D0708_03_charAt {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("���� �Է� : ");
//		String str = sc.nextLine();

		// char -> ���� �ϳ��� ''
		// String -> ���ڿ� ""

		// StringŸ�� ����.charAt(����); -> ���ڴ� ���ڿ��� �ε���
//		char c = str.charAt(3);
//		System.out.println(c);
//		
//		// �ȳ��ϼ��� �Է½�
//		System.out.println(str.charAt(0));	// ��
//		System.out.println(str.charAt(1));	// ��
//		System.out.println(str.charAt(4));	// ��
//		
//		// �ڹٴ� ��վ� �Է½�
//		System.out.println(str.charAt(3));	//  (����)

		// String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

//		// APPLE
		char a = str.charAt(0);
		char p = str.charAt(15);
		char l = str.charAt(11);
		char e = str.charAt(4);

		// a + p + p + l + e -> �׳� ��½� ����Ÿ������ ��ȯ�� => ���ڿ��� �ٿ� ���ڷ� �ٲ���
		String apple = "" + a + p + p + l + e;
		System.out.println(apple);
//		System.out.print(str.charAt(0));
//		System.out.print(str.charAt(15));
//		System.out.print(str.charAt(15));
//		System.out.print(str.charAt(11));
//		System.out.println(str.charAt(4));

//		// BUS
		char b = str.charAt(1);
		char u = str.charAt(20);
		char s = str.charAt(18);
		// String�� �⺻Ÿ������ ��ȯ�ϴ� �޼ҵ�
		// -> .valueOf()
		String bus = String.valueOf(b) + String.valueOf(u) + String.valueOf(s);
		System.out.println(bus);
//		System.out.print(str.charAt(1));
//		System.out.print(str.charAt(20));
//		System.out.println(str.charAt(18));

//		// JAVA
		char j = str.charAt(9);
		char v = str.charAt(21);
		String java = String.valueOf(j) + a + v + a;
		System.out.println(java);
//		System.out.print(str.charAt(9));
//		System.out.print(str.charAt(0));
//		System.out.print(str.charAt(21));
//		System.out.println(str.charAt(0));

	}

}
