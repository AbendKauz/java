package sec01.exam14;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// ����� �̸��� �Է��ϼ��� :
		// �̸��� 3���� ���������� �Է�������
		// -> ����� �̸��� OOO�Դϴ�.
		// �ƴҰ��
		// �̸��� �ٽ� �Է����ּ���. ���
		// getBytes()
		// length ���̰� 6

		Scanner s = new Scanner(System.in);
		System.out.print("����� �̸��� �Է��ϼ��� : ");
		String a = s.next();
		byte[] bytes = a.getBytes(); // �̸��� byte�迭�� ��ȯ
		if (bytes.length == 6) { // byte�迭���� �̸� ���̰� 6byte
			String str1 = new String(bytes); // byte�迭�� �ٽ� ���ڿ��� ���ڵ�
			System.out.println("����� �̸��� " + str1 + "�Դϴ�.");
		} else { // ���̰� 6�� �ƴ� �� == �̸��� 3���ڰ� �ƴ� ��
			System.out.println("�̸��� �ٽ� �Է��� �ּ���.");
		}

	}

}
