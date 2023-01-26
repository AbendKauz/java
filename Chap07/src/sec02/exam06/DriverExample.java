package sec02.exam06;

public class DriverExample {

	public static void main(String[] args) {

		// -> 만들어둔 클래스들을 활용해서 아래와 같이 출력되는 코드를 작성하시오.
		// -> Driver 객체를 만들어서 -> drive(매개값);
		// <console>
		// 차량이 달립니다.
		// 버스가 달립니다.
		// 택시가 달립니다.

		Driver driver = new Driver(); // drive 메소드 호출을 위해 Driver 객체 생성

//		Vehicle vehicle = new Vehicle();	// Vehicle 부모 객체 생성
//		driver.drive(vehicle);	// drive 메소드 호출 시 매개값으로 부모 객체 보내줌

		// 매개변수의 타입이 클래스일 경우,
		// -> 해당 클래스의 객체 뿐만 아니라
		// 자식객체까지도 매개값으로 전달이 가능(사용가능)
		// -> 즉, 매개값으로 어떤 자식 객체를 제공하느냐에 따라
		// 메소드의 실행 결과는 다양해질 수 있음
		// * 자식 객체가 부모의 메소드를 재정의했다면
		// 메소드 내부에서 재정의 된 메소드를 호출함으로써 메소드의 실행결과가 다양해짐

//		Bus bus = new Bus();	// 자식객체 생성
//		driver.drive(bus);	// bus는 Vehicle의 자식객체이므로 부모타입으로 대입이 가능
//							// (자동타입변환이 발생)
//		
//		Taxi taxi = new Taxi();
//		driver.drive(taxi);

		// 매개값의 자동타입변환과 메소드 재정의를 이용해서 -> 매개변수의 다형성을 구현

////		Vehicle bus = new Bus();
////		driver.drive(bus);
////		Vehicle taxi = new Taxi();
////		driver.drive(taxi);

//		driver.drive(new Vehicle());
//		driver.drive(new Bus());
//		driver.drive(new Taxi());

	}

}
