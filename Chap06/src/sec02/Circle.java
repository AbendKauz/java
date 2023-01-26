package sec02;

public class Circle {

	// 필드 double의 radius // 초기값 X

	// class 구성멤버

	double radius; // 1. 필드 - 반지름

	// 2. method
	void getArea() {
		System.out.println(radius * radius * 3.14);
	}

	// method overloading
	// --> 같은 이름의 method를 여러개 선언
	// 이유 : 매개값을 다양하게 받아서 처리하기 위함
	// 방법 : 매개변수의 타입, 개수, 순서 중 하나라도 달라야함

	// CircleExample에서 3의 매개값을 보낸 호출이 이곳에서 받아짐
	// -> 위의 getArea()에선 받을 수 있는 매개값이 지정이 안되어있어서
	void getArea(double rad) { // 위의 getArea()와 이름이 같지만 매개값을 받기 때문에 오류가 생기지 않음 -> 오버로딩
		System.out.println(rad * rad * 3.14);
	}

}
