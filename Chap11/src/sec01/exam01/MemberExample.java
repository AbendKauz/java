package sec01.exam01;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		if (obj1.equals(obj2)) {
			// �Ű����� MemberŸ���̰� id �ʵ尪�� �����Ƿ� true
			System.out.println("obj1�� obj2�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}

		if (obj1.equals(obj3)) {
			// �Ű����� MemberŸ�������� id �ʵ尪�� �ٸ��Ƿ� false
			System.out.println("obj1�� obj3�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}
	}

}
