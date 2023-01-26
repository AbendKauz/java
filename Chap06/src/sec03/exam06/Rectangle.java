package sec03.exam06;

public class Rectangle {

	// Rectangle Ŭ���� �ۼ�
	// -> private int Ÿ���� x, y, width, height �ʵ� (�簢���� �����ϴ� ���� ũ�� ����)
	// -> �ʵ带 �ʱ�ȭ�ϴ� ������
	// -> area( ) �޼ҵ� : �簢���� ���̸� ���� (���ϰ� int)
	// -> show( ) �޼ҵ� : �簢���� ��ǥ�� ũ�⸦ �ֿܼ� ��� (���ϰ� ����)
	// -> ��� �ʵ��� ���� �����ִ� toString ����� (�ܼ�â�� �����ϰ� ���)
	// -> including(Rectangle r) �޼ҵ�
	// : �Ű������� ���� r�� �� �簢�� �ȿ� ������ true�� ����

	private int x;
	private int y;
	private int width;
	private int height;

	// ������ : alt + shift + s -> o

	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// area( ) �޼ҵ� : �簢���� ���̸� ���� (���ϰ� int)

	int area() {
		return width * height;
	}

	// show( ) �޼ҵ� : �簢���� ��ǥ�� ũ�⸦ �ֿܼ� ��� (���ϰ� ����)

	void show() {
		System.out.println("(" + x + ", " + y + ")���� ũ�Ⱑ " + width + " * " + height + "�� �簢��");
	}

	// ��� �ʵ��� ���� �����ִ� toString (�ܼ�â�� �����ϰ� ���)
	// toString override : alt + shift + s -> s

//	@Override
//	public String toString() {
//		String str = "�ʵ尪 : x = " + x + ", y = " + y + ", width = " + width + ", height = " + height;
//		return str;
//	}

	@Override
	public String toString() {
		return "�ʵ尪 : x = " + x + ", y = " + y + ", width = " + width + ", height = " + height;
	}

	// including(Rectangle r) �޼ҵ�
	// : �Ű������� ���� r�� �� �簢�� �ȿ� ������ true�� ����

	boolean including(Rectangle r) {
		if (r.x >= x && r.y >= y && (r.width + r.x) <= (width + x) && (r.height + r.y) <= (height + y)) {
			return true;
		}
		return false;
	}

	// (r.x + r.width)-x (r.y + r.height) - y
//	boolean including(Rectangle r) {
//		if (width >= ((r.x + r.width) - x) && ((r.x + r.width) - x) > r.width
//				&& height >= ((r.y + r.height) - y) && ((r.y + r.height) - y) > r.height) {
//			return true;
//		}
//
//		return false;
//	}

}
