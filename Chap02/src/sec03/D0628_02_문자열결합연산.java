package sec03;

public class D0628_02_���ڿ����տ��� {

	public static void main(String[] args) {

		// + ���� ��ȣ�� 2���� ���
		// 1. ���� + ���� (����)
		int a = 5 + 4 + 7;
		System.out.println(a);

		// 2. ���ڿ� + ���� = "���ڿ�����" (���տ�����)
		String s = "4" + 5 + 3; // "45" + 3
		System.out.println(s); // "453"

		String s0 = 5 + "4" + 3; // "54" + 3
		System.out.println(s0); // "543"

		String s1 = 5 + 3 + "4"; // 8 + "4"
		System.out.println(s1); // "84"

		String s2 = "4" + (5 + 3); // "4" + 8
		System.out.println(s2); // "48"

		System.out.println('A' + 'B'); // char + char
		// 65 + 66 = 131 (�����ڵ�)
		// : (�����ڰ� �־� int Ÿ������ �ڵ� ��ȯ)

		System.out.println('A' + 2); // char + int
		// 67

		System.out.println('J' + "ava"); // char + ���ڿ�
		// Java

	}

}
