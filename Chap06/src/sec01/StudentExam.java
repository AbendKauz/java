package sec01;

public class StudentExam {

	public static void main(String[] args) {

		// class�κ��� ��ü�� ����
		// -> class�� ������ = new class��();

		Student stu1 = new Student(); // �л���ü1 ����
		System.out.println(stu1); // �ּҰ�1

		Student stu2 = new Student(); // �л���ü2 ����
		System.out.println(stu2); // �ּҰ�2

		if (stu1 == stu2) { // �ּҰ�1�� �ּҰ�2�� ������ ��
			System.out.println("stu2 ������ ���� Student ��ü�� �����մϴ�.");
		} else {
			System.out.println("stu2 ������ �ٸ� Student ��ü�� �����մϴ�.");
		} // false -> �ٸ� ��ü�� �����ϹǷ� ������ �ٸ�

	}

}
