package sec02;

public class D0704_09_���Կ�����1 {

	public static void main(String[] args) {

		// ���Կ�����
		// => ������ �ǿ������� ���� ���� �ǿ������� ������ ������

		// 1. �ܼ� ���Կ����� ( = )
		// 2. ���� ���Կ�����
		// (+=, -=, *=, /=, %=, &=, |=, ^=)

		// x += 5; --> x = x + 5;
		// x -= 5; --> x = x - 5;

		int result = 0;
		result += 10; // result = result + 10;
		// = 0 + 10
		System.out.println(result); // = 10

		result -= 3; // result = 10 - 3;
		System.out.println(result); // = 7

		result *= 4; // result = 7 * 4;
		System.out.println(result); // = 28

		result /= 7; // result = 28 / 7
		System.out.println(result); // = 4

	}

}
