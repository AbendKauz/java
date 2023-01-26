package sec04;

public class D0628_01_printf1 {

	public static void main(String[] args) {

		// println, print, printf
//		System.out.println("지성은");
//		System.out.print("지성은");
//		System.out.print("ㅇㄴ");

		// printf("형식문자열", 값1, 값2, 값3,....);
//		System.out.printf("이름 : %s", "지성은");
//		System.out.println();
//		System.out.printf("나이 : %d", 124);

//		System.out.printf("이름 : %s, 주소 : %s, 번호 : %d", "지성은", "광주 북구", 14);
		// 이름 : 지성은, 주소 : 광주 북구, 번호 : 14
		System.out.printf("주소 : %2$s, 이름 : %1$s, 번호 : %3$d", "지성은", "광주 북구", 14);
		// 1$ : 값의 1번째를 넣는다, 2$ : 값의 2번째를 넣는다

	}

}
