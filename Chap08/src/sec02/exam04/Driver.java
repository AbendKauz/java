package sec02.exam04;

public class Driver {
	// -> 메소드
	// drive( ) : 접근제한 public / 리턴타입 없음 / 매개변수 - Vehicle 인터페이스 타입으로 하나 선언 /
	// -----> Vehicle 인터페이스의 run 메소드 호출
	// -----> 만약에 들어온 매개값이 Bus 객체라면 checkFare( ) 메소드를 호출
	// -----> run( ) 메소드 호출

	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}

}
