package sec01.exam14;

import java.util.Arrays;
import java.util.Scanner;

public class GetByteExample {

	public static void main(String[] args) {

		// �ܾ �Է��ϼ��� :
		// �ݺ� ���
		// �迭 ���
		// ���ڵ� ��� :

		Scanner s = new Scanner(System.in);
		System.out.print("�ܾ �Է��ϼ��� : ");
		String b = s.next();
		byte[] c = b.getBytes();

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i] + " ");
		}

		System.out.println();

		System.out.println(Arrays.toString(c));

		String d = new String(c);
		System.out.println("���ڵ� ��� : " + d);

	}

}
