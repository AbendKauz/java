package sec03.exam06;

public class RectangleExample {

	public static void main(String[] args) {

		// RectangleExample Ŭ���� �ۼ�
		// -> 4���� �Ű����� ���� ��ü 3�� �����ϱ� (rec1, rec2, rec3)
		// (���� ������ �����ڷ� ��ü�� �����ϱ�)
		// rec1 -> x=2, y=2, width=8, height=7
		// rec2 -> x=5, y=5, width=8, height=7
		// rec3 -> x=1, y=1, width=10, height=10
		// -> rec1 ��ü -> show �޼ҵ�
		// -> rec1 ��ü -> area �޼ҵ�
		// -> ���� toString()�� ���� ��� �ʵ��� �� ����ϱ�
		// -> rec3 ��ü -> including(���޼ҵ�
		// (rec1, rec2 �� �� ���ϱ�)
		//
		// < console >
		// (2, 2) ���� ũ�Ⱑ 8*7�� �簢��
		// rec1 �� ���̴� 56�Դϴ�.
		// �ʵ尪 : x=2, y=2, width=8, height=7
		// rec3�� rec1�� �����մϴ�.
		// rec3�� rec2�� �������� �ʽ��ϴ�.

		Rectangle rec1 = new Rectangle(2, 2, 8, 7);
		Rectangle rec2 = new Rectangle(5, 5, 8, 7);
		Rectangle rec3 = new Rectangle(1, 1, 10, 10);

		// rec1 ��ü -> show �޼ҵ�

		rec1.show();

		// rec1 ��ü -> area �޼ҵ�

		System.out.println("rec1�� ���̴� " + rec1.area() + "�Դϴ�.");

		// ���� toString()�� ���� ��� �ʵ��� �� ����ϱ�

//		System.out.println(rec1);
		System.out.println(rec1.toString());

		// rec3 ��ü -> including(���޼ҵ�
		// (rec1, rec2 �� �� ���ϱ�)

//		System.out.println((rec3.including(rec1) ? "rec3�� rec1�� �����մϴ�." : "rec3�� rec1�� �������� �ʽ��ϴ�."));
//		System.out.println((rec3.including(rec2) ? "rec3�� rec2�� �����մϴ�." : "rec3�� rec2�� �������� �ʽ��ϴ�."));

		if (rec3.including(rec1)) {
			System.out.println("rec3�� rec1�� �����մϴ�.");
		} else {
			System.out.println("rec3�� rec1�� �������� �ʽ��ϴ�.");
		}

		if (rec3.including(rec2)) {
			System.out.println("rec3�� rec2�� �����մϴ�.");
		} else {
			System.out.println("rec3�� rec2�� �������� �ʽ��ϴ�.");
		}

	}

}
