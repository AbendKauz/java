package sec01.exam06;

public class Car {

	public int speed;

	public void speedUp() {
		speed++;
	}

	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}

}
