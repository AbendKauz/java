package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {

		// -> Vehicle 인터페이스 타입의 변수에 Bus 객체를 대입한 후
		// run( ) , checkFare( ) 메소드 호출하기

		Vehicle vehicle = new Bus(); // 자동 타입 변환
		vehicle.run();
//		vehicle.checkFare();	// Vehicle 인터페이스에는 checkFare()가 없음 

		// 자동타입변환 되었던 vehicle 변수를 강제타입변환(Bus 구현 클래스 타입으로)
		// * 강제 타입 변환
		// 구현클래스 변수 = (구현클래스) 인터페이스 변수;
		Bus bus = (Bus) vehicle; // 강제 타입 변환
		bus.checkFare(); // 강제 타입 변환한 변수명을 가지고 checkFare() 호출

	}

}
