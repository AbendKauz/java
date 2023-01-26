package sec02;

public class Rectangle {

	// 필드 double의 width // 초기값 X
	// height // 초기값 X

	double width;
	double height;

	// 사각형의 넓이를 구해주는 메소드 만들기 -> getArea()
	void getArea() {
		System.out.println(width * height);
	}

	// 리턴타입이 없고 double 타입의 매개변수 2개가 있는 getArea() 메소드 만들기
	void getArea(double w, double h) {
		System.out.println(w * h);
	}

//	** 메소드 오버로딩(overloading)
//	- 같은 이름의 메소드를 여러개 선언
//	- 매개값을 다양하게 받아 처리할 수 있도록 하기 위함
//		-> 매개변수의 타입, 갯수, 순서 중 하나라도 달라야 함

	// RectangleExample에서 14와 3을 매개값으로 보낸 호출을 이곳에서 받음
	// 보내진 매개값은 이름을 마음대로 변경할 수 있음(가독성이 떨어지니 비추천함)
	double getArea2(double w, double h) {
		return w * h;
	}

}
