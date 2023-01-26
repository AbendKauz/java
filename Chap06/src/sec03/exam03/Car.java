package sec03.exam03;

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
		this.model = model;
	}

	Car(String model, String color) { // 생성자3
		this.model = model;
		this.color = color;
	}

	Car(String model, String color, int maxSpeed) { // 생성자4
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	// 어노테이션
	// : 사전적 의미로는 주석 / 프로그램에게 추가 정보를 제공하는 메타데이터를 위해 사용
	// 메타데이터 -> 데이터를 위한 데이터 (데이터에 대해 설명을 해둔 데이터)
	// @Override가 있다는 것은 선언한 메소드가 오버라이드 되었다는 것을 의미
	// 어노테이션 예시 -> @Override

	@Override
	public String toString() {
		String str = "회사명 : " + company + "\n모델명 : " + model + "\n색깔 : " + color + "\n최대속도 : " + maxSpeed;
		return str;
	}

	// toString() 오버라이딩 방법
	// 1. 마우스 오른쪽 클릭 -> Source -> Generate toString()
	// 2. alt + shift + s -> s

}
