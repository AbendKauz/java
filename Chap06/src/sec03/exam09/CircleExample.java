package sec03.exam09;

public class CircleExample {

	public static void main(String[] args) {

//		Circle cir = new Circle(5);
//		
//		double cirArea = cir.getArea();
//		System.out.println("cir 객체의 원의 넓이 : " + cirArea);

		// 객체 배열
		// int[] arr = new int[5];

		// 1. 객체 배열 선언
//		Circle[] cirArr;

		// 2. 배열의 크기 지정
//		cirArr = new Circle[3];

		Circle[] cirArr = new Circle[3]; // 객체 배열을 생성
		// cirArr[0] = cir;

		// System.out.println(cir);
		// System.out.println(cirArr[0]);

		for (int i = 0; i < cirArr.length; i++) {
			cirArr[i] = new Circle((i + 1));
			System.out.println(cirArr[i]);
		}

	}

}
