package sec04.exam04;

import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {

//		Calculator cal = new Calculator();

//		int num1 = cal.plus(3, 5);
//		// System.out.println("���ϱ� : " + num1);
//		
//		double num2 = cal.avg(3, 5);
//		// System.out.println("��� : " + num2);
//		
//		cal.execute();

		// �ܺ��� ���� �־��ֱ�
		// -> Scanner�� ��� ���� ���������� �Է��ϰ�
		// -> �� ũ���� �迭�� ����
		// -> �迭�� �� �ε��� ���� ������ �������� �̾Ƽ� (1~15������ ����)
		// --> �Ű������� ���� execute(�迭) ������ �� ����

		// <console>
		// �����Է� : 7
		// 2 5 5 2 7 8 12
		// ������ : (�������� ���� 7���� ������ ���)

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 15) + 1;
//			System.out.println("arr[" + i + "] : " + arr[i]);
			System.out.print(arr[i] + " ");
		}

		Calculator cal = new Calculator();
		cal.execute(arr);

	}

}
