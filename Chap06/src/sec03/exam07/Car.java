package sec03.exam07;

public class Car {

	private int speed = 10; // �ʵ�

	// Getter �޼ҵ� (�����͸� �������ִ� �޼ҵ�)
	// ���� :
	// public ����Ÿ�� getSpeed(){
	// return �ʵ��;
	// }

	// Setter �޼ҵ� (�����͸� �����ϴ� �뵵�� ���� ��� -> ���ϰ��� X)
	// ���� :
	// public void setSpeed(�Ű�����Ÿ�� ������){
	// this.�ʵ�� = �ʵ��;
	// }

	// alt + shift + s -> r : getter & setter �޼ҵ� ����

	// Getter -> �ʵ� �� �б�
	public int getSpeed() { // getter
		return speed;
	}

	// Setter -> �ʵ� �� ����(����)
	public void setSpeed(int speed) { // setter
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}

}
