package sec02.cal;

import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {

		// 2. CalculatorExample Ŭ���� ����
		// ���� Ŭ������ �ʵ尪�� 10, 5�� �����ؼ�
		// ��Ģ���� ���

		Calculator cal = new Calculator();

//		cal.num1 = 10;
//		cal.num2 = 5;
//		
//		System.out.println(cal.num1 + " + " + cal.num2 + " = " + (cal.num1 + cal.num2));
//		System.out.println(cal.num1 + " - " + cal.num2 + " = " + (cal.num1 - cal.num2));
//		System.out.println(cal.num1 + " * " + cal.num2 + " = " + (cal.num1 * cal.num2));
//		System.out.println(cal.num1 + " / " + cal.num2 + " = " + ((double)cal.num1 / cal.num2));

		// 1~100���� �������� ���� ���� ����
		// ��Ģ���� ���

		cal.num1 = (int) (Math.random() * 100) + 1;
		cal.num2 = (int) (Math.random() * 100) + 1;

//		System.out.println(cal.num1 + " + " + cal.num2 + " = " + (cal.num1 + cal.num2));
//		System.out.println(cal.num1 + " - " + cal.num2 + " = " + (cal.num1 - cal.num2));
//		System.out.println(cal.num1 + " * " + cal.num2 + " = " + (cal.num1 * cal.num2));
//		System.out.println(cal.num1 + " / " + cal.num2 + " = " + ((double)cal.num1 / cal.num2));

		// Calculator Ŭ������ �޼ҵ带 ����Ͽ� ���

		// 1.
//		int a = cal.pls(cal.num1, cal.num2);
//		int b = cal.min(cal.num1, cal.num2);
//		int c = cal.mul(cal.num1, cal.num2);
//		double d = cal.div(cal.num1, cal.num2);
//		
//		System.out.println(cal.num1 + " + " + cal.num2 + " = " + a);
//		System.out.println(cal.num1 + " - " + cal.num2 + " = " + b);
//		System.out.println(cal.num1 + " * " + cal.num2 + " = " + c);
//		System.out.println(cal.num1 + " / " + cal.num2 + " = " + d);

		// 2.
//		System.out.println("num1 : " + cal.num1 + ", num2 : " + cal.num2);	// �ʵ尪 ���
//		System.out.println("���ϱ� : " + cal.pls(cal.num1, cal.num2));	// pls() - ���ϱ�
//		System.out.println("���� : " + cal.min(cal.num1, cal.num2));		// min() - ����
//		System.out.println("���ϱ� : " + cal.mul(cal.num1, cal.num2));	// mul() - ���ϱ�
//		System.out.println("������ : " + cal.div(cal.num1, cal.num2));	// div() - ������

		// �����ȣ�� �Է¹޾� �ش��ϴ� ���� ����
		// + -> ���ϱ�
		// - -> ����
		// * -> ���ϱ�
		// / -> ������

		Scanner sc = new Scanner(System.in);
		System.out.println("num1 : " + cal.num1 + ", num2 : " + cal.num2);
		System.out.print("�����ȣ �Է� : ");

		// 1.
//		String a = sc.next();
//		switch (a){	// �Է¹��� ��ȣ�� ���ϱ�, ����, ���ϱ��̸�
//			case "+", "-", "*": {
//				System.out.print(cal.calcu(cal.num1, cal.num2, a));
//				break;
//			}
//			case "/": {	// �Է¹��� ��ȣ�� ������(/)�̸�
//				System.out.print(cal.calcu((double)cal.num1, (double)cal.num2, a));
//				break;
//			}
//			default : {	// �Է¹��� ���� ��ȣ�� �ƴϸ�
//				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//			}
//		}

		// 2.
		String op = sc.next();
		if (op.equals("/")) { // �Է¹��� ��ȣ�� ������(/)�̸�
			System.out.println(cal.calcu((double) cal.num1, (double) cal.num2, op)); // �Ű������� doubleŸ������ ��ȯ �� �޼ҵ� ȣ��
		} else {// �Է¹��� ��ȣ�� ������(/)�� �ƴϸ�
			System.out.println(cal.calcu(cal.num1, cal.num2, op)); // �״�� �޼ҵ� ȣ��
		}

	}

}
