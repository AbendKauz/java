package sec03.exam01;

public class Car {

	// -> 우리가 생성자를 선언하지 않았어도 컴파일 과정에서 컴파일러가
	// 자동으로 기본생성자를 추가함 (기본 생성자 : default constructor)

	// public class로 선언되면 기본 생성자에도 public이 붙음
	// public 없이 class로만 선언되면 기본생성자에도 public이 붙지않음

	// 기본 생성자 형태
	// [public] 클래스명() {}

	// * 우리가 필요에 따라 생성자를 직접 선언해서 사용해야 하는 경우가 있음
	// -> 다양한 값을 가진 객체를 생성하기 위해서 생성자를 만듬
	// --> 컴파일러가 기본생성자를 자동으로 추가하지 않음

	Car(String color, int cc) { // 생성자(매개변수 2개)

	}

	Car() { // 기본 생성자

	}

}
