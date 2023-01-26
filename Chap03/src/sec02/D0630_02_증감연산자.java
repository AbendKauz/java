package sec02;

public class D0630_02_증감연산자 {

	public static void main(String[] args) {

		// 증감 연산자 : 값을 1 증가(++) 시키거나
		// 값을 1 감소(--) 시키는 연산자

		// ++피연산자 / --피연산자 -> 전위증감연산자
		// : 피연산자의 값을 1 증감시킨 후 다른 연산을 수행

		// 피연산자++ / 피연산자-- -> 후위증감연산자
		// : 다른 연산을 수행한 후에 피연산자의 값을 1 증감시킴

//		int num = 5;
//		System.out.println(++num);	// 6
//		System.out.println(num);	// 6
//		System.out.println(num++);	// 6
//		System.out.println(num);	// 7

//		int x = 5;
//		int y = 5;
//		System.out.println("x의 값 : " + x + ", y의 값 : " + y);
//		System.out.println(++x + 10);
//		System.out.println("x의 값 : " + x + ", y의 값 : " + y);
//		
//		System.out.println(y++ + 10);
//		System.out.println("x의 값 : " + x + ", y의 값 : " + y);

		// Q1)
//		int x = 10;
//		int y = x-- + 5 + --x;	// x = 10
//		// 10 + 5 + --x				10
//		// -------					9
//		//   15 + --x				8			
//		//    15 + 8
//		//		23
//		System.out.println(y);	// 23
//		System.out.println(x);	// 8

		// Q2)
		int x = 2;
		int y = 2;
		System.out.println(x * y++);
		System.out.println("x의 값 : " + x + ", y의 값 : " + y);
		System.out.println(x * ++y);
		System.out.println("x의 값 : " + x + ", y의 값 : " + y);
		System.out.println(--x * y);
		System.out.println("x의 값 : " + x + ", y의 값 : " + y);
		System.out.println(x-- * y);
		System.out.println("x의 값 : " + x + ", y의 값 : " + y);

	}

}
