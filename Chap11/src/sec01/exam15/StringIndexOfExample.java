package sec01.exam15;

public class StringIndexOfExample {

	public static void main(String[] args) {

		String subject = "�ڹ� ���α׷���";

		int location = subject.indexOf("���α׷���");
		// index 3������ "���α׷���" �ܾ �ֱ� ������ 3 ��ȯ
		System.out.println(location);

		// Ư�� ���ڿ��� �������� ������ -1 ����
		if (subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ���õ� å��");
		} else {
			System.out.println("�ڹٿ� ���þ��� å��");
		}

	}

}
