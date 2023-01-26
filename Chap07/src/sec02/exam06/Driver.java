package sec02.exam06;

public class Driver {

	// -> 메소드
	// drive( ) : 접근제한 public / 리턴타입 없음 / 매개변수 Vehicle 타입으로 하나 선언 /
	// -----> Vehicle 클래스 안의 run 메소드 호출

	public void drive(Vehicle vehicle) {
		vehicle.run();
	}

}
