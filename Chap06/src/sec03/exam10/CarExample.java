package sec03.exam10;

public class CarExample {

	public static void main(String[] args) {

		// ��ü �迭 -> ũ�Ⱑ 5
		Car[] carArr = new Car[5];

		// ��ü �迭�� �ε��� ��ġ�� ������ Car ��ü 5���� �ִµ�
		// �� ��ü�� ���ǵ��� ���� 10, 20, 30, 40, 50

		// <console>
		// ó�� �ӵ�
		// arr[0] => �ӵ� : 10
		// arr[1] => �ӵ� : 20
		// arr[2] => �ӵ� : 30
		// arr[3] => �ӵ� : 40
		// arr[4] => �ӵ� : 50
		// ===================
		// 2�� �ӵ�
		// arr[0] => �ӵ� : 20
		// arr[1] => �ӵ� : 40
		// arr[2] => �ӵ� : 60
		// arr[3] => �ӵ� : 80
		// arr[4] => �ӵ� : 100

		System.out.println("ó�� �ӵ�");
		for (int i = 0; i < carArr.length; i++) {
			carArr[i] = new Car((i + 1) * 10);
			System.out.println("arr[" + i + "] => " + carArr[i]);
		}

		System.out.println("=====================");
		System.out.println("2�� �ӵ�");

		for (int i = 0; i < carArr.length; i++) {
			// �� �ʵ��� ���� 2�辿 Ŀ��
//			carArr[i] = new Car((i + 1) * 10 * 2);
			int num = carArr[i].getSpeed() * 2; // �ʵ��� ���� �о�ͼ� * 2 => num ������ �ֱ�
			carArr[i].setSpeed(num); // num�� �ʵ��� ������ ����
			System.out.println("arr[" + i + "] => " + carArr[i]);
		}

	}

}
