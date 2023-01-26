package chap04;

public class Ex05 {

	public static void main(String[] args) {

		// *
		// **
		// ***
		// ****
		// 출력
		// (for문 이용)

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}

	}

}
