package sec01.exam18;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// ��� ���� �����ϴ� ����� substring�� Ȱ���Ͽ� Ǯ��
		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String a = s.next();

		if (a.length() % 2 == 0) {
			System.out.println(a.substring((a.length() / 2) - 1, (a.length() / 2) + 1));
		} else {
			System.out.println(a.substring(a.length() / 2, (a.length() / 2) + 1));
		}

	}

}
