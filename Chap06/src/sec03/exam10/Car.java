package sec03.exam10;

public class Car {

	// �ʵ� private intŸ���� speed

	private int speed;

	// ������(�Ű����� speed)

	public Car(int speed) {
		this.speed = speed;
	}

	// Getter, Setter �޼ҵ�

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// toString()
	// �ӵ� : 20

	@Override
	public String toString() {
		return "�ӵ� : " + speed;
	}

}
