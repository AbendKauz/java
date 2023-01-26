package sec03.exam10;

public class Car {

	// 필드 private int타입의 speed

	private int speed;

	// 생성자(매개변수 speed)

	public Car(int speed) {
		this.speed = speed;
	}

	// Getter, Setter 메소드

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// toString()
	// 속도 : 20

	@Override
	public String toString() {
		return "속도 : " + speed;
	}

}
