package sec02;

public class D0630_02_���������� {

	public static void main(String[] args) {

		// ���� ������ : ���� 1 ����(++) ��Ű�ų�
		// ���� 1 ����(--) ��Ű�� ������

		// ++�ǿ����� / --�ǿ����� -> ��������������
		// : �ǿ������� ���� 1 ������Ų �� �ٸ� ������ ����

		// �ǿ�����++ / �ǿ�����-- -> ��������������
		// : �ٸ� ������ ������ �Ŀ� �ǿ������� ���� 1 ������Ŵ

//		int num = 5;
//		System.out.println(++num);	// 6
//		System.out.println(num);	// 6
//		System.out.println(num++);	// 6
//		System.out.println(num);	// 7

//		int x = 5;
//		int y = 5;
//		System.out.println("x�� �� : " + x + ", y�� �� : " + y);
//		System.out.println(++x + 10);
//		System.out.println("x�� �� : " + x + ", y�� �� : " + y);
//		
//		System.out.println(y++ + 10);
//		System.out.println("x�� �� : " + x + ", y�� �� : " + y);

		// Q1)
//		int x = 10;
//		int y = x-- + 5 + --x;	// x = 10
//		// 10 + 5 + --x				10
//		// -------					9
//		//   15 + --x				8			
//		//    15 + 8
//		//		23
//		System.out.println(y);	// 23
//		System.out.println(x);	// 8

		// Q2)
		int x = 2;
		int y = 2;
		System.out.println(x * y++);
		System.out.println("x�� �� : " + x + ", y�� �� : " + y);
		System.out.println(x * ++y);
		System.out.println("x�� �� : " + x + ", y�� �� : " + y);
		System.out.println(--x * y);
		System.out.println("x�� �� : " + x + ", y�� �� : " + y);
		System.out.println(x-- * y);
		System.out.println("x�� �� : " + x + ", y�� �� : " + y);

	}

}
