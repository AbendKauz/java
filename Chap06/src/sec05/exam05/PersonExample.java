package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {

		Person p1 = new Person("123456-4567890");
		System.out.println(p1.ssn);

		// * final �ʵ� -> �����ڿ��� �ܺε����ͷ� �ʱ�ȭ
		// -> �ʱ�ȭ�� ���� �������� �����ͷ� �ν�
		// -> ���� �� error
//		p1.ssn = "147852-1478523";	// final �ʵ�� ���� �Ұ�
//		p1.nation = "aaa";	// error

	}

}
