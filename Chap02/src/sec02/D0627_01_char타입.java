package sec02;

public class D0627_01_charŸ�� {

	public static void main(String[] args) {

		char c1 = 'A';
		System.out.println(c1); // A�� ���

		char c2 = 65;
		System.out.println(c2); // A

		char c3 = '��';
		System.out.println(c3);

		int num1 = 'A';
		System.out.println(num1); // A�� �����ڵ� 65 ���

		// * char Ÿ�� ������ �����ϸ� �ڵ����� ���ڷ� ���εǾ� ���
		// * int Ÿ�� ������ �����ϸ� �����ڵ� ��ü�� ���

		char c4 = 'A' + 1;
		System.out.println(c4); // B

	}

}
