package sec02;

public class D0712_01_�迭�ʿ伺 {

	public static void main(String[] args) {

		// �迭

		// Q) �л� 10���� ������ �����ϰ�, ��հ��� ���ض�

//		�л�1 = 90;
//		�л�2 = 87;
//		�л�3 = 76;
//		�л�4 = 45;
//		�л�5 = 78;
//		�л�6 = 94;
//		�л�7 = 70;
//		�л�8 = 81;
//		�л�9 = 65;
//		�л�10 = 99;

//		int st1 = 90; 
//		int st2 = 87; 
//		int st3 = 76; 
//		int st4 = 45; 
//		int st5 = 78; 
//		int st6 = 94; 
//		int st7 = 70; 
//		int st8 = 81; 
//		int st9 = 65; 
//		int st10 = 99; 

//		int sum = (st1 + st2 + st3 + st4 + st5 + st6 + st7 + st8 + st9 + st10) / 10;
//		System.out.println(sum);

		// �迭�̶�?
		// : ���� Ÿ���� �����͸� ���ӵ� ������ �����ϰ�, �� �����Ϳ� �ε���(index)�� �ο��� �ڷᱸ��
		// : Ư¡ -- 1. ���� Ÿ���� �����͸� ������ �� ����
		// -- 2. �ѹ� ������ �迭�� ���̸� �ø��ų� ���� �� ����
		// * �ε����� 0���� ������
		// �迭 ���� ��� 2����
		// Ÿ��[] ������; Ÿ�� ������[];

		// �迭 ����
		// 1. �� ������� �迭 ����
		// {90, 87, 76, 45, ....}
		int[] score = { 90, 87, 76, 45, 78, 94, 70, 81, 65, 99 };
		// �ε��� 0 1 2 3 4 5 6 7 8 9

//		System.out.println(score[5]);

		// 2. new �����ڸ� Ȱ��
		// Ÿ��[] ������ = new Ÿ��[����];
		// ex) int[] arr = new int[20];

		// Q) 87 + 78 + 94 + 99 + 65
//		int sum = score[1] + score[4] + score[5] + score[9] + score[8];
//		System.out.println(sum);

		// Q) 10���� ������ ������
//		int sum = 0;
//		for(int i = 0; i < 10; i++) {
////			System.out.println(score[i]);
////			sum = sum + score[i];
//			sum += score[i];
//		}

		// �迭����.length score.length -> �迭�� ���̸� ����
//		System.out.println(score.length);	-> 10
//		for(int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//
//		System.out.println((double)sum/10);

		// String �迭 �����
		// Ÿ��[] ������ = {"��", "��", ...}

		String[] name = { "����", "����", "�α�", "�¿�", "����", "ä��", "����" };
		System.out.println(name[1]);
		name[1] = "���"; // �迭 name�� index1 ���� ���� (����->���)
		System.out.println(name[1]);

	}

}
