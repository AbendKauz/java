package sec02.cal;

public class Calculator {

	// 1. Calculator Ŭ���� -> ���� Ŭ����
	// �ʵ�(2��) -> int Ÿ������(num1, num2)

	int num1;
	int num2;

	// ����Ÿ���� �ִ� �޼ҵ� 4���� ����
	// -> pls, min, mul, div

//	int pls(int a, int b) {	// ���ϱ�
//		return a + b;
//	}
//	
//	int min(int a, int b) {	// ����
//		return a - b;
//	}
//	
//	int mul(int a, int b) {	// ���ϱ�
//		return a * b;
//	}
//	
//	double div(int a, int b) {	// ������
//		return (double)a / b;
//	}

	int pls(int a, int b) { // ���ϱ�
		return a + b;
	}

	int min(int a, int b) { // ����
		return a - b;
	}

	int mul(int a, int b) { // ���ϱ�
		return a * b;
	}

	double div(int a, int b) { // ������
		return (double) a / b;
	}

	// �޼ҵ�(�Ű����� 3�� (num1, num2, �����ȣ_�����ȣ�� ���� ���)
	// ����Ÿ�� �ִ� �޼ҵ�)

	int calcu(int num1, int num2, String op) {
		if (op.equals("+")) { // ��ȣ�� ���ϱ� �̸�
			System.out.print("���ϱ� : "); // "���ϱ� : " ��� ��
			return num1 + num2; // num1 + num2 ���� ���� �� ������� ����
		} else if (op.equals("-")) {
			System.out.print("���� : ");
			return num1 - num2;
		} else if (op.equals("*")) {
			System.out.print("���ϱ� : ");
			return num1 * num2;
		}
		return 0; // if���� ������ �ƹ��͵� ���� ������ 0���� ����
	}

	// ������ �� �Ҽ����� ǥ���ϱ� ���� �����ε� ���
	double calcu(double num1, double num2, String op) {
		System.out.print("������ : ");
		return num1 / num2;
	}

}
