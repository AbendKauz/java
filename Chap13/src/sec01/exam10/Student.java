package sec01.exam10;

public class Student {
	// -> �ʵ�
	// sno : �������� public / int Ÿ�� / -> �й�
	// name : �������� public / StringŸ�� / -> �̸�

	public int sno;
	public String name;

	// -> ������ (�й�, �̸� �Ű����� 2��)

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	// -> toString �޼ҵ�
	// <console>
	// �й� ( 20120410 ), �̸� ( ���ڹ� )

	@Override
	public String toString() {
		return "�й� ( " + sno + " ), �̸� ( " + name + " )";
	}

	// �ߺ����Žÿ� hashCode(), equals() ������ ����� ��

}
