package sec01.exam16;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("����� �̸��� �Է��ϼ��� : ");
		String a = s.next();
		if (a.length() == 3) {
			System.out.println("����� �̸��� " + a + "�Դϴ�.");
		} else {
			System.out.println("�̸��� �ٽ� �Է��� �ּ���.");
		}

	}

}
