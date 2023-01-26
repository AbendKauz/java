package sec05.exam03;

public class Car {

	// 인스턴스 필드
	int speed;

	// 인스턴스 메소드
	void run() {
		System.out.println(speed + " 달립니다.");
	}

	// main() 메소드 --> 정적 메소드
	public static void main(String[] args) {

//		speed = 10;	// 인스턴스 필드 사용불가
//		run();		// 인스턴스 메소드 사용불가

		Car car = new Car();
		car.speed = 10;
		car.run();

	}

}
