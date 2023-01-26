package sec01.exam11;

import java.util.Objects;

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

	// -> equals( ) ������
	// - �޾ƿ� �Ű����� Student Ŭ���� Ÿ���̶�� Student Ÿ������ Ÿ�� ��ȯ ��
	// �й��� �̸��� ���� ��쿡 true , �ƴҰ�쿡 false �� ������.
	//
	// Student Ŭ���� Ÿ���� �ƴ϶�� false �� ������.

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
			return (stu.sno == sno) && (stu.name.equals(name));
		}
		return false;
	}

	// -> hashCode( ) ������
	// - return Objects.hash(sno, name);

	@Override
	public int hashCode() {
		return Objects.hash(sno, name);
	}

}
