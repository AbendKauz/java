package sec02;

public class D0706_01_for��1 {

	public static void main(String[] args) {

		// ���ǹ� : if, switch
		// �ݺ��� : for, while, do-while

		// �ݺ����� � �۾�(�ڵ�)�� �ݺ������� ����Ǿ�� �� �� ���

		// for�� : �츮�� �ݺ��ؾ� �� Ƚ���� �˰� ���� ��
		// while�� : ���ǿ� ���� �ݺ��ؾ� �� �� �ַ� �����

		// 1���� 5������ ���� ���ϰ� �ʹ�.
//		int sum = 0;
//		sum = sum + 1;
//		// System.out.println(sum);
//		sum = sum + 2;
//		// System.out.println(sum);
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum + 5;
//		System.out.println(sum);

		// �ݺ���
		// int sum = 0;
//		for(1. �ʱ�ȭ��; 2. ���ǽ�; 3. ������){
//			�ݺ��ؾ� �� ���๮	
//		}

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}

		System.out.println(sum);

	}

}
