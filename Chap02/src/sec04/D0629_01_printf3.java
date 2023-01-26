package sec04;

public class D0629_01_printf3 {

	public static void main(String[] args) {

		// int 타입 변수 생성 후 123 초기화
		int value = 123;
		// double 타입 변수 생성 후 314.159 초기화
		double value2 = 314.159;
		// 상품의 가격:123원
		System.out.printf("상품의 가격:%d원\n", value);
		// 상품의 가격: 123원 // 전체자리수 6
		System.out.printf("상품의 가격:%6d원\n", value);
		// 상품의 가격:123 원 // 전체자리수 6
		System.out.printf("상품의 가격:%-6d원\n", value);
		// 상품의 가격:000123원 // 전체자리수 6
		System.out.printf("상품의 가격:%06d원\n", value);
		// 반지름이 10인 원의 넓이:314.16 // 전체자리수 10 소수자리수 2
		System.out.printf("반지름이 %2$d인 원의 넓이:%1$10.2f\n", value2, 10);

		String name = "지성은";
		String str = "국제";
		System.out.printf("이름 : %s\t, 학원 : %s\n", name, str);

	}

}
