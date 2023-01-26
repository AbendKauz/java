package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {

		// 객체 생성해서
		// Car클래스의 필드 gas의 값을 10으로 변경

		Car car = new Car();

		car.setGas(10);

		// isLeftGas() 메소드 호출

//		car.isLeftGas();

		// 2. isLeftGas() 메소드의 리턴값 활용
		// 가스가 있다면 "출발합니다" 출력 후 run()메소드 실행.
		if (car.isLeftGas()) {
			System.out.println("출발합니다.");
			car.run();
		}

		// 3. 가스가 있다면 "가스를 주입할 필요가 없습니다." 출력
		// 없다면 "가스를 주입하세요"를 출력
		if (car.isLeftGas()) {
			System.out.println("가스를 주입할 필요가 없습니다.");
		} else {
			System.out.println("가스를 주입하세요.");
		}

	}

}
