package sec03.exam09;

public class CircleExample {

	public static void main(String[] args) {

//		Circle cir = new Circle(5);
//		
//		double cirArea = cir.getArea();
//		System.out.println("cir ��ü�� ���� ���� : " + cirArea);

		// ��ü �迭
		// int[] arr = new int[5];

		// 1. ��ü �迭 ����
//		Circle[] cirArr;

		// 2. �迭�� ũ�� ����
//		cirArr = new Circle[3];

		Circle[] cirArr = new Circle[3]; // ��ü �迭�� ����
		// cirArr[0] = cir;

		// System.out.println(cir);
		// System.out.println(cirArr[0]);

		for (int i = 0; i < cirArr.length; i++) {
			cirArr[i] = new Circle((i + 1));
			System.out.println(cirArr[i]);
		}

	}

}
