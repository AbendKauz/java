package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {

		// -> 만들어둔 인터페이스, 클래스들을 활용해서 아래와 같이 출력되는 코드를 작성하시오.
		// -> Driver 클래스의 drive 메소드를 호출
		// -> <console>
		// 승차요금을 체크합니다.
		// 버스가 달립니다.
		// 택시가 달립니다.

		Driver driver = new Driver();

		driver.drive(new Bus());
		System.out.println("=================");
		driver.drive(new Taxi());

	}

}
