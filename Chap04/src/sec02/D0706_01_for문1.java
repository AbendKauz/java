package sec02;

public class D0706_01_for문1 {

	public static void main(String[] args) {

		// 조건문 : if, switch
		// 반복문 : for, while, do-while

		// 반복문은 어떤 작업(코드)이 반복적으로 실행되어야 할 때 사용

		// for문 : 우리가 반복해야 할 횟수를 알고 있을 때
		// while문 : 조건에 따라 반복해야 할 때 주로 사용함

		// 1부터 5까지의 합을 구하고 싶다.
//		int sum = 0;
//		sum = sum + 1;
//		// System.out.println(sum);
//		sum = sum + 2;
//		// System.out.println(sum);
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum + 5;
//		System.out.println(sum);

		// 반복문
		// int sum = 0;
//		for(1. 초기화식; 2. 조건식; 3. 증감식){
//			반복해야 할 실행문	
//		}

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}

		System.out.println(sum);

	}

}
