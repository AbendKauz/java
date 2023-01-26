package sec01;

public class D0622_01_변수값교환 {

	public static void main(String[] args) {

		int x = 3;
		int y = 5;

		// 출력 => x : 3, y : 5
		// System.out.println("x : " + x + ", y : " + y);

//		y = x;
//		System.out.println("x : " + x + ", y : " + y);

		// Q1) x와 y의 값을 교환해봅시다.
		// x : 3, y : 5 ===> x : 5, y : 3

		// 1. x의 값을 저장해 둘 변수(temp) 추가 후 x값 복사
		int temp = x;
		System.out.println("x : " + x + ", y : " + y + ", " + "temp : " + temp);

		// 2. x에 y의 값 복사
		x = y;
		System.out.println("x : " + x + ", y : " + y + ", " + "temp : " + temp);

		// 3. y에 x 값을 복사해 둔 변수(temp)를 사용하여 x값 저장
		y = temp;
		System.out.println("x : " + x + ", y : " + y + ", " + "temp : " + temp);

	}

}
