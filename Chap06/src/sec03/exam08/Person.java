package sec03.exam08;

public class Person {

	// �ʵ�� private���� String Ÿ���� name, intŸ���� age
	// default ������
	// 2���� �Ű������� ������ ������(��ü ���� �� �ʵ� ���� �ʱ�ȭ��)
	// getter�޼ҵ�, setter�޼ҵ� ����(�ʵ� 2�� �� �����)
	// toString() �޼ҵ� ����

	private String name;
	private int age;

	Person() {

	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "�̸� : " + name + ", ���� : " + age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
