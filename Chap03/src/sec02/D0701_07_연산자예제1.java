package sec02;

import java.util.Scanner;

public class D0701_07_연산자예제1 {

	public static void main(String[] args) {

		// 정수를 하나 키보드로 입력받아
		// int 타입의 num 이라는 변수에 값을 저장
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		// b라는 변수에 num이 짝수인지(true), 홀수인지(false)
		// 값을 저장해서 b의 값을 출력하시오
		// ex)
		// 20 21
		// [console]
		// true false
		// 산술연산자

//		boolean b = (num % 2) == 0;
//		System.out.println(b);

		// num의 값이 짝수라면 -> num은 짝수입니다.
		// num의 값이 홀수라면 -> num은 홀수입니다.

//		if(b) {
//			System.out.println(num + "은(는) 짝수입니다.");
//		}
//		if(!b){
//			System.out.println(num + "은(는) 홀수입니다.");
//		}

//		if(b) {
//			System.out.println(num + "은(는) 짝수입니다.");
//		}else {
//			System.out.println(num + "은(는) 홀수입니다.");
//		}

	}

}
