package sec02.exam05;

public class CarExample {

	public static void main(String[] args) {

		// -> Car 객체 생성

		Car car = new Car();

		// -> 5회전을 실행할 코드 작성
		// - run( ) 메소드를 호출해서 리턴값을 problemTire 변수 선언 후 대입;
		// problemTire 의 값에 따라 펑크가 난 타이어를 교체하기
		// : 왼쪽의 타이어가 펑크라면 -> HankookTire 로 교체
		// 오른쪽의 타이어가 펑크라면 -> KumhoTire 로 교체
		// 리턴값이 1 -> HankookTire("앞왼쪽", 15);
		// 리턴값이 2 -> KumhoTire("앞오른쪽", 13);
		// 리턴값이 3 -> HankookTire("뒤왼쪽", 14);
		// 리턴값이 4 -> KumhoTire("뒤오른쪽", 17);
		// - 콘솔 사진 똑같이 출력.

//		for(int i = 1; i <= 5; i++) {
//			System.out.println(i + " 달리기");
//			int problemTire = car.run();
//			if(problemTire == 1) {
//				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
//				System.out.println("앞왼쪽 HankookTire로 교체");
//			}else if(problemTire == 2) {
//				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
//				System.out.println("앞오른쪽 KumhoTire로 교체");
//			}else if(problemTire == 3) {
//				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
//				System.out.println("뒤왼쪽 HankookTire로 교체");
//			}else if(problemTire == 4) {
//				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
//				System.out.println("뒤오른쪽 KumhoTire로 교체");
//			}
//			System.out.println("------------------------------");
//		}

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " 달리기");
			int problemTire = car.run();
			switch (problemTire) {
			case 1:
				car.frontLeftTire = new HankookTire("앞왼쪽", 15); // 자동타입변환
				// Car 객체의 frontLeftTire 필드에 HankookTire(자식클래스) 객체를 대입
				// -> 교체된 이후부터는 Car 객체의 run() 호출 시
				// 자식클래스에서 재정의된 roll() 메소드를 호출
				System.out.println("앞왼쪽 HankookTire로 교체");
				break;
			case 2:
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				System.out.println("앞오른쪽 KumhoTire로 교체");
				break;
			case 3:
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				System.out.println("뒤왼쪽 HankookTire로 교체");
				break;
			case 4:
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				break;
			default:
				break;
			}
			System.out.println("------------------------------");

			// Tire의 수명이 다 되기 전에는 기존에 있던 Tire클래스 안의 roll() 메소드가 동작
			// -> 타이어의 수명이 다 되면
			// Tire타입의 필드에 Tire를 상속받은 KumhoTire, HankookTire 타입의 객체로 교체
			// (부모클래스 Tire에 자식클래스 객체를 대입 -> 자동타입변환)
			// -> 교체가 된 Tire들은 새로 대입한 자식클래스안에 재정의한 roll() 메소드로 동작

			// Car 클래스의 run() 를 호출할 때
			// -> run() 메소드의 코드는 똑같지만,
			// 어떤 객체가 필드에 대입이 되느냐에 따라
			// run() 메소드 안에 있는 roll() 메소드의 실행결과가 달라지게 됨

			// ********** 필드의 다형성 **********
			// -> 필드의 타입을 부모타입으로 선언하면 다양한 자식객체들을 대입을 해서 메소드를 실행
			// 다양한 실행결과를 볼 수 있다.

		}

	}

}
