package sec01.exam03;

public class Computer extends Calculator {

	// �޼ҵ� ������(�������̵�)
	double areaCircle(double r) {
		System.out.println("Computer(�ڽ�Ŭ����)�� �޼ҵ� ����");
		System.out.println(Math.PI);
		return Math.PI * r * r;
	}

}
