package sec05.exam03;

public class Car {

	// �ν��Ͻ� �ʵ�
	int speed;

	// �ν��Ͻ� �޼ҵ�
	void run() {
		System.out.println(speed + " �޸��ϴ�.");
	}

	// main() �޼ҵ� --> ���� �޼ҵ�
	public static void main(String[] args) {

//		speed = 10;	// �ν��Ͻ� �ʵ� ���Ұ�
//		run();		// �ν��Ͻ� �޼ҵ� ���Ұ�

		Car car = new Car();
		car.speed = 10;
		car.run();

	}

}
