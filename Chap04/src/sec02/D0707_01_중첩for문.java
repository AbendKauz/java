package sec02;

public class D0707_01_중첩for문 {

	public static void main(String[] args) {

		// 중첩 for문
		// -> for문 안에 또 다른 for문이 들어있는 구조
		// for(초기값; 조건식; 증감값){
		// 반복할 실행문
		// for(초기값; 조건식; 증감값){
		// 반복할 실행문
		// }
		// }

//		for(int i = 0; i <= 3; i++) {
//			System.out.println("=====" + i + "=====");
//			for(int num = 0; num <= 5; num++) {
//				System.out.println(i + " - " + num);
//			}
//		}

		// 2~4단까지 구구단을 출력하는 프로그램 작성
//		for(int i = 2; i <= 4; i++) {
//			System.out.println("**** " + i + "단 ****");
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i + " x " + j + " = " + (i * j));
//			}
//		}

		// 2~9단까지 구구단을 출력
		// x 1 -> 한줄
//		// 1)
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 2; j <= 9; j++) {
//				if(j == 9) {
//					System.out.println(j + " x " + i + " = " + (j * i));
//				}else {
//					System.out.print(j + " x " + i + " = " + (j * i) + "\t");
//				}
//			}
//		}

//		// 2)
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " x " + i + " = " + (j * i) + "\t");
			}
			System.out.println();
		}

	}

}
