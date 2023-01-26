package sec02.exam02;

public class Driver {
	// -> 메소드
	// drive( ) : 접근제한 public / 리턴타입 없음 / 매개변수 - Vehicle 인터페이스 타입으로 하나 선언 /
	// -----> Vehicle 인터페이스의 run 메소드 호출

	public void drive(Vehicle vehicle) {
		vehicle.run();
	}

}
