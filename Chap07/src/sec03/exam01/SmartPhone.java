package sec03.exam01;

public class SmartPhone extends Phone {

	// -> ������
	// -> �������� public
	// -> ���� �����ڸ� �Ű������� �޾Ƽ� �θ��� Phone Ŭ������ �����ڸ� ȣ���� �� �Ѱ��ֱ�
	// -> �޼ҵ�
	// internetSearch( ) : �������� public / ����Ÿ�� ���� / �Ű����� X /
	// -----> "���ͳ� �˻��� �մϴ�." �� ���
	public SmartPhone(String owner) {
		super(owner);
	}

	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}

}
