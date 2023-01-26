package sec02.exam02;

public class DriverExample {

	public static void main(String[] args) {

		// -> 만들어둔 인터페이스, 클래스들을 활용해서 아래와 같이 출력되는 코드를 작성하시오.
		//
		// -> <console>
		// 버스가 달립니다.
		// 택시가 달립니다.

		Driver driver = new Driver();
//		Bus bus = new Bus();
//		Taxi taxi = new Taxi();
//		driver.drive(bus);
//		driver.drive(taxi);
		driver.drive(new Bus());
		driver.drive(new Taxi());

	}

}
