package sec01.exam16;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		// ��� ���� ���
		// ex) �����ٶ󸶹ٻ� -> ��
		// �����ٶ󸶹� -> �ٶ�

		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String a = s.next();

		// �Է¹��� ������ ���̸�ŭ �迭 ����
		String[] strArr = new String[a.length()];
		// �迭�ȿ� ���ڵ��� �ϳ��� �Է�
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = Character.toString(a.charAt(i));
		}

		// 2�� �������� : Ȧ��
		// 2�� ���������� ���� : ¦��
		// => �迭�� ���� = length - 1

		if (strArr.length % 2 == 0) {
			System.out.println(strArr[(strArr.length / 2) - 1] + strArr[strArr.length / 2]);
		} else {
			System.out.println(strArr[strArr.length / 2]);
		}

	}

}
