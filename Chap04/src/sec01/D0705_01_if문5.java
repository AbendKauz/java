package sec01;

import java.util.Scanner;

public class D0705_01_if문5 {

	public static void main(String[] args) {

		// 시급이랑 일한 시간을 키보드로 입력받아 hourPay, hour 변수에 값을 저장
		// 일한 시간이 8시간을 초과하게 되면 8시간만큼은 원래 임금만큼 주어지고
		// 초과된 시간은 시급이 1.5배로 계산이 된다.
		// 일급을 계산하는 코드를 작성

		// [console]
		// 시급 : ______ 10000 10000
		// 일한 시간 : _____ 7 9
		// 일급 : 70000 95000

		Scanner sc = new Scanner(System.in);
		System.out.print("시급 : ");
		int hourPay = sc.nextInt();
		System.out.print("일한 시간 : ");
		int hour = sc.nextInt();

		// 1)
//		if(hour > 8) {
//			System.out.println("일급 : " + ((hourPay * 8) + (int)(hourPay * 1.5 * (hour - 8))) + "원");
//		}else {
//			System.out.println("일급 : " + (hourPay * hour) + "원");
//		}

		// 2)
		if (hour > 8) {
			System.out.println("일급 : " + ((hourPay * hour) + (int) (hourPay * 0.5 * (hour - 8))) + "원");
		} else {
			System.out.println("일급 : " + (hourPay * hour) + "원");
		}

	}

}
