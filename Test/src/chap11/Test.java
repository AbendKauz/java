package chap11;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// ���� �ҹ��� 10�� �Է¹ޱ�
		// ex) abcabcdabc
		// c�� ã�Ƽ� c�� ��ġ���� ��� -> �ݺ���
		// ���)
		// c�� ��ġ���� : 2
		// c�� ��ġ���� : 5
		// c�� ��ġ���� : 9
		// ��ȭ) 1��° c�� ��ġ���� : 2

		Scanner s = new Scanner(System.in);
		System.out.print("�ҹ��� 10�� �Է� : ");
		String str = s.next();
		int cnt = 1;
		String b = "c";
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'c') {
				System.out.println("c�� ��ġ���� : " + i);
				System.out.println(cnt++ + "��° c�� ��ġ���� : " + i);
			}
			if (b.equals(str.substring(i, i + 1))) {
				System.out.println("c�� ��ġ���� : " + i);
				System.out.println(cnt++ + "��° c�� ��ġ���� : " + i);
			}
//			if(b.equals(str.charAt(i) + "")) {
//				System.out.println("c�� ��ġ���� : " + i);
//				System.out.println(cnt++ + "��° c�� ��ġ���� : " + i);
//			}
		}

	}

}
