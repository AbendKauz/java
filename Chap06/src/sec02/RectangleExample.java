package sec02;

public class RectangleExample {

	public static void main(String[] args) {

		// -> Rectangle Ŭ���� ������ �ʵ� width, height �б�(���)
//		
//		Rectangle rec = new Rectangle();
//		System.out.println("���� �� : " + rec.width);
//		System.out.println("���� �� : " + rec.height);
//		
//		// -> width = 10, height = 5�� ���� �� ���
//		rec.width = 10;
//		rec.height = 5;
//		System.out.println("���� �� : " + rec.width);
//		System.out.println("���� �� : " + rec.height);
//		
//		// ���ΰ� 10, ���ΰ� 5�� �簢���� ���� : 50
//		// (�簢���� ���� ���ϴ� ���� : ���� * ����)
//		double a = rec.width * rec.height;
//		System.out.println("���ΰ� " + (int)rec.width + ", ���ΰ� " + (int)rec.height + "�� �簢���� ���� : " + (int)a);

		// getArea() �� ���⼭ ���
		// 1. Rectangle Ŭ������ ��ü�� �����ϴ� �ڵ�
		Rectangle rec = new Rectangle();
		rec.width = 10;
		rec.height = 5;

		rec.getArea();

//		rec.getArea(14, 3);	// ���� 14, ���� 3�� �簢���� ���� ���

		double a = rec.getArea2(14, 3); // getArea2() ȣ�� + 14�� 3�� �Ű������� ����
		System.out.println(a);

	}

}
