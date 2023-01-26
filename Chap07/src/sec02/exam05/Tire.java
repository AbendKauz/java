package sec02.exam05;

public class Tire { // �Ϲ� Ÿ�̾��� ���, Ư���� ����

	// -> �ʵ�
	// maxRotation : public / int Ÿ�� / �ʱⰪ X -----> �ִ� ȸ����(�ִ� ����)�� �����͸� ������ �ʵ�
	// * �ִ� ȸ������ŭ ȸ���ϰ� �Ǹ� Ÿ�̾ ��ũ���ٰ� ����( Ÿ�̾��� ����)
	// accumulatedRotation : public / int Ÿ�� / �ʱⰪ X -----> ���� ȸ������ �����͸� ������ �ʵ�
	// * Ÿ�̾ 1ȸ���� ������ 1�� �����Ǵ� �ʵ�
	// * ���� ȸ������ �ִ� ȸ������ŭ �����ϸ� Ÿ�̾�� ��ũ�� ��
	// location : public / String Ÿ�� / �ʱⰪ X -----> Ÿ�̾��� ��ġ�� �����͸� ������ �ʵ�
	// * �տ�����, �տ���, �ڿ�����, �ڿ����� �����ϴ� ������

	public int maxRotation; // �ִ�ȸ����(�ִ����)
	public int accumulatedRotation; // ����ȸ����
	public String location; // Ÿ�̾��� ��ġ

	// -> ������
	// -> �������� public / �Ű����� - Ÿ�̾��� ��ġ�� �ִ� ȸ����
	// -> �Ű������� �ʵ� �ʱ�ȭ

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// -> �޼ҵ�
	// roll( ) : ����Ÿ�� boolean / �Ű����� X /
	// -----> Ÿ�̾ 1ȸ�� ��Ű�� �޼ҵ�� 1�� ������ ������ ���� ȸ������ 1�� ����
	//
	// (ȸ���� �����ϸ� �Ʒ��� ���� ���� ȸ������ ��� �� true ����
	// <console>
	// ex1) �տ��� Tire ����: 3ȸ // ex2) �ڿ����� Tire ����: 2ȸ
	//
	// ��ũ�� ���� ȸ�� �Ұ���� �Ʒ��� ���� ��ũ�� ��� �� false ����
	// <console>
	// ex1) *** �ڿ��� Tire ��ũ *** // ex2) *** �տ����� Tire ��ũ ***

	public boolean roll() {
		++accumulatedRotation;
		// ���� ȸ������ �ִ�ȸ�������� ���� �� -> ���� tire���� ���
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;

			// ����ȸ������ �ִ�ȸ�������� ���� ���� �� -> tire�� �ִ����ŭ ȸ���� �ؼ� ��ũ
		} else {
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false;
		}
	}

}
