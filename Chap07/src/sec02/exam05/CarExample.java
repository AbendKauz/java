package sec02.exam05;

public class CarExample {

	public static void main(String[] args) {

		// -> Car ��ü ����

		Car car = new Car();

		// -> 5ȸ���� ������ �ڵ� �ۼ�
		// - run( ) �޼ҵ带 ȣ���ؼ� ���ϰ��� problemTire ���� ���� �� ����;
		// problemTire �� ���� ���� ��ũ�� �� Ÿ�̾ ��ü�ϱ�
		// : ������ Ÿ�̾ ��ũ��� -> HankookTire �� ��ü
		// �������� Ÿ�̾ ��ũ��� -> KumhoTire �� ��ü
		// ���ϰ��� 1 -> HankookTire("�տ���", 15);
		// ���ϰ��� 2 -> KumhoTire("�տ�����", 13);
		// ���ϰ��� 3 -> HankookTire("�ڿ���", 14);
		// ���ϰ��� 4 -> KumhoTire("�ڿ�����", 17);
		// - �ܼ� ���� �Ȱ��� ���.

//		for(int i = 1; i <= 5; i++) {
//			System.out.println(i + " �޸���");
//			int problemTire = car.run();
//			if(problemTire == 1) {
//				car.frontLeftTire = new HankookTire("�տ���", 15);
//				System.out.println("�տ��� HankookTire�� ��ü");
//			}else if(problemTire == 2) {
//				car.frontRightTire = new KumhoTire("�տ�����", 13);
//				System.out.println("�տ����� KumhoTire�� ��ü");
//			}else if(problemTire == 3) {
//				car.backLeftTire = new HankookTire("�ڿ���", 14);
//				System.out.println("�ڿ��� HankookTire�� ��ü");
//			}else if(problemTire == 4) {
//				car.backRightTire = new KumhoTire("�ڿ�����", 17);
//				System.out.println("�ڿ����� KumhoTire�� ��ü");
//			}
//			System.out.println("------------------------------");
//		}

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " �޸���");
			int problemTire = car.run();
			switch (problemTire) {
			case 1:
				car.frontLeftTire = new HankookTire("�տ���", 15); // �ڵ�Ÿ�Ժ�ȯ
				// Car ��ü�� frontLeftTire �ʵ忡 HankookTire(�ڽ�Ŭ����) ��ü�� ����
				// -> ��ü�� ���ĺ��ʹ� Car ��ü�� run() ȣ�� ��
				// �ڽ�Ŭ�������� �����ǵ� roll() �޼ҵ带 ȣ��
				System.out.println("�տ��� HankookTire�� ��ü");
				break;
			case 2:
				car.frontRightTire = new KumhoTire("�տ�����", 13);
				System.out.println("�տ����� KumhoTire�� ��ü");
				break;
			case 3:
				car.backLeftTire = new HankookTire("�ڿ���", 14);
				System.out.println("�ڿ��� HankookTire�� ��ü");
				break;
			case 4:
				car.backRightTire = new KumhoTire("�ڿ�����", 17);
				System.out.println("�ڿ����� KumhoTire�� ��ü");
				break;
			default:
				break;
			}
			System.out.println("------------------------------");

			// Tire�� ������ �� �Ǳ� ������ ������ �ִ� TireŬ���� ���� roll() �޼ҵ尡 ����
			// -> Ÿ�̾��� ������ �� �Ǹ�
			// TireŸ���� �ʵ忡 Tire�� ��ӹ��� KumhoTire, HankookTire Ÿ���� ��ü�� ��ü
			// (�θ�Ŭ���� Tire�� �ڽ�Ŭ���� ��ü�� ���� -> �ڵ�Ÿ�Ժ�ȯ)
			// -> ��ü�� �� Tire���� ���� ������ �ڽ�Ŭ�����ȿ� �������� roll() �޼ҵ�� ����

			// Car Ŭ������ run() �� ȣ���� ��
			// -> run() �޼ҵ��� �ڵ�� �Ȱ�����,
			// � ��ü�� �ʵ忡 ������ �Ǵ��Ŀ� ����
			// run() �޼ҵ� �ȿ� �ִ� roll() �޼ҵ��� �������� �޶����� ��

			// ********** �ʵ��� ������ **********
			// -> �ʵ��� Ÿ���� �θ�Ÿ������ �����ϸ� �پ��� �ڽİ�ü���� ������ �ؼ� �޼ҵ带 ����
			// �پ��� �������� �� �� �ִ�.

		}

	}

}
