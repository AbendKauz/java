package sec03.exam04;

public class Car {
	// Car Ŭ���� �ۼ�
	// �ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;

	// ������
	Car() { // ������1

	}

	Car(String model) { // ������2
		this(model, null, 0);
//		this.model = model;
//		this.color = null;
//		this.maxSpeed = 0;
	}

	Car(String model, String color) { // ������3
		this(model, color, 0); // this() �ڵ�
		// : �ٸ� �����ڸ� ȣ���ϴ� �ڵ�
		// : �������� ���� ù�ٿ����� ���
		// * ���� -> �ߺ� �ڵ带 �ּ�ȭ
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 0;
	}

	Car(String model, String color, int maxSpeed) { // ������4
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
