package sec02;

public class CarExample {

	public static void main(String[] args) {

		// Car 클래스에 있는 필드 5개 -> 필드값을 읽어보기
		// -> 객체를 생성
		Car car1 = new Car(); // car1 객체 생성

		// 자동차1
		// 제작회사 : 현대자동차
		// 모델명 : 그랜저
		// 색상 : 검정
		// 최대속도 : 350
		// 현재속도 : 0

		System.out.println("제작회사 : " + car1.company);
		System.out.println("모델명 : " + car1.model);
		System.out.println("색상 : " + car1.color);
		System.out.println("최대속도 : " + car1.maxSpeed);
		System.out.println("현재속도 : " + car1.speed);

		System.out.println("-----------------------------");

		// 자동차2
		// 제작회사 : 기아자동차
		// 모델명 : 카니발
		// 색상 : 빨강
		// 최대속도 : 380
		// 현재속도 : 100

		Car car2 = new Car();
		System.out.println("자동차2");

		System.out.println("필드값 변경 전 : " + car2.company);
		car2.company = "기아자동차";
		System.out.println("제작회사 : " + car2.company);

		car2.model = "카니발";
		System.out.println("모델명 : " + car2.model);

		car2.color = "빨강";
		System.out.println("색상 : " + car2.color);

		car2.maxSpeed = 380;
		System.out.println("최고속도 : " + car2.maxSpeed);

		car2.speed = 100;
		System.out.println("현재속도 : " + car2.speed);

	}

}
