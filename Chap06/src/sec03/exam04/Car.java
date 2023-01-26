package sec03.exam04;

public class Car {
	// Car 클래스 작성
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자
	Car() { // 생성자1

	}

	Car(String model) { // 생성자2
		this(model, null, 0);
//		this.model = model;
//		this.color = null;
//		this.maxSpeed = 0;
	}

	Car(String model, String color) { // 생성자3
		this(model, color, 0); // this() 코드
		// : 다른 생성자를 호출하는 코드
		// : 생성자의 가장 첫줄에서만 허용
		// * 장점 -> 중복 코드를 최소화
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 0;
	}

	Car(String model, String color, int maxSpeed) { // 생성자4
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
