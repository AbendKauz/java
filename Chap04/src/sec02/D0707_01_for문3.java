package sec02;

import java.util.Scanner;

public class D0707_01_for문3 {

	public static void main(String[] args) {

		// 30이하의 다른 정수 2개를 입력
		// 두 수 사이의 총 합을 출력하는 프로그램 작성(for문 사용)

		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();

//		int temp = 0;
//		if(num1 > num2) {
//			temp = num1;
//			num1 = num2;
//			num2 = temp;
//		}

//		// 1)
//		String result = "";
//		int j = 0;
//		for(int i = num1; i <= num2; i++ ) {
//			if(i == num2) {
//				result = result + i + " = ";
//			}else {
//				result = result + i + " + ";
//			}
//			j = j + i;
//		}
//		System.out.println(result + j);

//		// 2)
//		int j = 0;
//		for(int i = num1; i <= num2; i++ ) {
//			if(i == num2) {
//				System.out.print(i + " = ");
//			}else {
//				System.out.print(i + " + ");
//			}
//			j = j + i;
//		}
//		System.out.println(j);

		// 3)(삼항연산 사용)
		int sum = 0;
		int large = (num1 > num2) ? num1 : num2;
		int small = (num1 < num2) ? num1 : num2;

		for (int i = small; i <= large; i++) {
			sum = sum + i;
			if (i == large) {
				System.out.print(i + " = " + sum);
			} else {
				System.out.print(i + " + ");
			}
		}

	}

}
