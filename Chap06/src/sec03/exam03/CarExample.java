package sec03.exam03;

public class CarExample {

	public static void main(String[] args) {

		// 생성자 4개를 가지고 객체 4개를 만들어보기

		// 객체 1 : 그냥 출력
		Car car1 = new Car();
		System.out.println("객체1");
		System.out.println("회사명 : " + car1.company);
		System.out.println("모델명 : " + car1.model);
		System.out.println("색깔 : " + car1.color);
		System.out.println("최대속도 : " + car1.maxSpeed);
		System.out.println();

		// 객체 2
		// 모델명 : 버스
		Car car2 = new Car("버스");
		System.out.println("객체2");
		System.out.println("모델명 : " + car2.model);
		System.out.println();

		// 객체 3
		// 모델명 : 택시
		// 색깔 : 노랑
		Car car3 = new Car("택시", "노랑");
		System.out.println("객체3");
		System.out.println("모델명 : " + car3.model);
		System.out.println("색깔 : " + car3.color);
		System.out.println();

		// 객체 4
		// 모델명 : 자가용
		// 색깔 : 빨강
		// 최대속도 : 300
		Car car4 = new Car("자가용", "빨강", 300);
//		System.out.println("객체4");
//		System.out.println("모델명 : " + car4.model);
//		System.out.println("색깔 : " + car4.color);
//		System.out.println("최대속도 : " + car4.maxSpeed);

		// 아래 두 코드는 같은 코드
		// -> car4를 출력하면 자동으로 .toString()으로 변환됨
		System.out.println(car4);
		System.out.println(car4.toString());

		// 자바에서 Object 클래스는 자바 클래스의 최상위 클래스로
		// -> 자바의 모든 클래스들은 Object 클래스를 상속받음

		// toString() : Object 클래스에 속해 있는 메소드
		// -> 기능 : 객체의 문자정보를 class명@16진수의 해시코드로 출력
		// ===> 필요에 따라 오버라이딩 하여 필요한 정보를 보기 쉽게 출력할 수 있음
		// (재정의)

		// 오버로딩 VS 오버라이딩 차이점
		// 1. 오버로딩(메소드 오버로딩 / 생성자 오버로딩) - 중복정의
		// - 같은 이름의 메소드를 여러개 선언
		// - 매개변수의 타입, 갯수, 순서가 달라야 함
		// - 리턴타입은 상관없음

		// 2. 오버라이딩(재정의)
		// - 상위클래스의 메소드를 하위클래스에서 재정의(다시 정의)하는 것
		// - 메소드의 이름, 매개변수 타입, 개수 모두 동일해야 함.
		// - 메소드 안에 있는 내용(코드)만 변경하는 것

		// 구분 | 오버로딩 | 오버라이딩
		// ___________|__________|_____________
		// 메소드 이름 | 동일 | 동일
		// 매개변수, 타입| 다름 | 동일
		// 리턴타입 | 상관없음 | 동일

	}

}
