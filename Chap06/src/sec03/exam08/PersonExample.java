package sec03.exam08;

public class PersonExample {

	public static void main(String[] args) {

		// default �����ڸ� �̿��� ��ü person1 ����
		// person1�� �̸��� ���̸� ȫ�浿, 30���� ����
		// person1 ��ü�� �̸�, ���� �� ���

		// 2���� �Ű������� �Ѱܹ޴� �����ڸ� �̿��� ��ü person2 ���� -> �ڱ浿, 21
		// person2 ��ü�� �̸�, ���� �� ���

		// person2�� �̸��� ���̸� ȥ�ڹ�, 15�� ����
		// person2 ��ü�� �̸�, ���� �� ���

		Person person1 = new Person();
		person1.setName("ȫ�浿");
		person1.setAge(30);

		System.out.println(person1.toString());

		Person person2 = new Person("�ڱ浿", 21);
		System.out.println(person2);

		person2.setName("ȥ�ڹ�");
		person2.setAge(15);
		System.out.println("�̸� : " + person2.getName() + ", ���� : " + person2.getAge());

	}

}
