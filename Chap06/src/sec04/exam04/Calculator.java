package sec04.exam04;

public class Calculator {

	// �޼ҵ�
//	int plus(int x, int y) {	// 2���� �Ű������� ���ϴ� �޼ҵ�
//		int result = x + y;
//		return result;
//	}
//	
//	double avg(int x, int y) {	// 2���� �Ű������� ����� ���ϴ� �޼ҵ�
//		// plus() ȣ��
//		double sum = plus(x, y);
//		double result = sum / 2; 
//		return result;
//	}
//	
//	void execute() {
//		double result = avg(7, 10);
//		System.out.println("������ : " + result);
//	}

	// execute() -> �ܺ��� ���� �޾Ƽ� ����� ����� (���)

//	int plus(int ... arr) {
	int plus(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

//	double avg(int ... arr) {
	double avg(int[] arr) {
		double sum = plus(arr);
		double result = sum / arr.length;
		return result;
	}

//	void execute(int ... arr) {
	void execute(int[] arr) {
		double result = avg(arr);
		System.out.println("\n���� ��� : " + result);
	}

}
