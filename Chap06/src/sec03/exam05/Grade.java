package sec03.exam05;

public class Grade {

	// ����, ����, ���� ������ ������ �ʵ� �����
	// ������ �����
	// ��� �ʵ��� ���� �����ִ� toString �����(�ܼ�â�� �����ϰ� ���)
	// average() -> ����� ���� �� ��հ��� �����ϴ� �޼ҵ� �����

	int math;
	int science;
	int english;

	// ��ü ����

	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	// toString() -> override
	// ����(math), ����(science), ����(english)

	@Override
	public String toString() {
//		return "����(" + math + "), ����(" + science + "), ����(" + english + ")";
		String str = "����(" + math + "), ����(" + science + "), ����(" + english + ")";
		return str;
	}

	// ����� ���� �� ��հ��� �����ϴ� �޼ҵ� �����

//	double average(int a, int b, int c) {
//		return (a + b + c) / 3;
//	}

	double average() {
		return (math + science + english) / 3;
	}

}
