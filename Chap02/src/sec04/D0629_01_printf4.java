package sec04;

public class D0629_01_printf4 {

	public static void main(String[] args) {

		// 사탕, 500, 3 순서로 값을 제공
		// 상품명 : 사탕 | 가격 : 500원 | 수량 : 03개
		// 4자리 2자리
		System.out.printf("상품명 : %s\t| 가격 : %4d원\t| 수량 : %02d개\n", "사탕", 500, 3);
		// 1000, 생수, 10 순서로 값을 제공
		// 상품명 : 생수 | 가격 : 1000원 | 수량 : 10개
		System.out.printf("상품명 : %2$s\t| 가격 : %1$4d원\t| 수량 : %3$02d개\n", 1000, "생수", 10);

		// 실수 x를 선언하고 1.23456으로 초기화
		double x = 1.23456;
		// printf를 사용해서 아래 그림처럼 출력되도록 작성하시오.
		// 실수 x의 값 : 1.235 // 8자리
		System.out.printf("실수 x의 값 : %8.3f\n", x);
		// 실수 x의 값 : 1.235
		System.out.printf("실수 x의 값 : %-8.3f\n", x);
		// 실수 x의 값 : 0001.235
		System.out.printf("실수 x의 값 : %08.3f\n", x);

	}

}
