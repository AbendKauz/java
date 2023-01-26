package sec03.exam07;

public class CarExample {

	public static void main(String[] args) {

		Car car1 = new Car();

		System.out.println("변경 전 : " + car1.getSpeed()); // 값을 가져옴
		car1.setSpeed(-40); // 값을 변경함
		System.out.println("변경 후 : " + car1.getSpeed());

	}

}
