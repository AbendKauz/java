package sec03.exam03;

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
		this.model = model;
	}

	Car(String model, String color) { // ������3
		this.model = model;
		this.color = color;
	}

	Car(String model, String color, int maxSpeed) { // ������4
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	// ������̼�
	// : ������ �ǹ̷δ� �ּ� / ���α׷����� �߰� ������ �����ϴ� ��Ÿ�����͸� ���� ���
	// ��Ÿ������ -> �����͸� ���� ������ (�����Ϳ� ���� ������ �ص� ������)
	// @Override�� �ִٴ� ���� ������ �޼ҵ尡 �������̵� �Ǿ��ٴ� ���� �ǹ�
	// ������̼� ���� -> @Override

	@Override
	public String toString() {
		String str = "ȸ��� : " + company + "\n�𵨸� : " + model + "\n���� : " + color + "\n�ִ�ӵ� : " + maxSpeed;
		return str;
	}

	// toString() �������̵� ���
	// 1. ���콺 ������ Ŭ�� -> Source -> Generate toString()
	// 2. alt + shift + s -> s

}
