package sec03;

public class D0627_04_�Ǽ������ڵ�Ÿ�Ժ�ȯ {

	public static void main(String[] args) {

		// int Ÿ�԰� double Ÿ���� ����
		// ---> intŸ���� ������ doubleŸ������ ��ȯ�� �ǰ�,
		// double + double Ÿ���� �������� ������ ����
//		int intValue = 10;
//		double doubleValue = 4.5;
//		double result = intValue + doubleValue;
//		System.out.println(result);		// 14.5

		// ���࿡ �� intŸ������ ������ �ؾ��Ѵٸ�???
		// ---> double Ÿ���� int Ÿ������ ���� ��ȯ �� ����
		int intValue = 10;
		double doubleValue = 4.5;
		int result = intValue + (int) doubleValue;
		System.out.println(result); // 14

	}

}
