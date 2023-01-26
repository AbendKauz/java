package sec01;

import java.util.Scanner;

public class D0705_01_if문3 {

	public static void main(String[] args) {

		// 7000원짜리 음료선물세트를 구입했을 때 지불해야 하는 금액을
		// 계산하는 프로그램을 만들어보세요.
		// 단, 8개 이상 구매시에는 10% 할인이 됩니다.(if-else문 사용)
		// 상품수량 : x
		// 가격은 xxxxx원 입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("상품수량 : ");
		int num = sc.nextInt();

		// 1)
//		if(num >= 8) {
//			System.out.println("가격은 " + (num * (7000 - (7000 / 100 * 10))) + "원 입니다.");
//		}else {
//			System.out.println("가격은 " + (num * 7000) + "원 입니다.");
//		}

		// 2)
		int price = 7000;

		if (num >= 8) {
			System.out.println("가격은 " + ((num * price) - (int) (price / 0.1)) + "원 입니다.");
		} else {
			System.out.println("가격은 " + (num * price) + "원 입니다.");
		}

	}

}
