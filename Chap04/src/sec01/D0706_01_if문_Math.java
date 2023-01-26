package sec01;

public class D0706_01_if문_Math {

	public static void main(String[] args) {

		// Math.random() -> 0.0과 1.0 사이에 속하는 double타입의 난수 하나를 리턴하는 메소드
		// 0.0 <= Math.random() < 1.0
//		System.out.println(Math.random());

		// 0 ~ 10 사이의 값
		// 0.0 * 10 <= Math.random() * 10 < 1.0 * 10
//		System.out.println(Math.random() * 10);

		// 0.0 * 10 <= (int)Math.random() * 10 < 1.0 * 10
//		System.out.println((int)(Math.random() * 10));

		// 1 ~ 11 사이의 값
		// (int)0.0 * 10 + 1 <= Math.random() * 10 + 1 < 1.0 * 10 + 1
//		System.out.println((int)(Math.random() * 10) + 1);
//												----  ----
//												 갯수  시작값
		// start 부터 시작하는 n개의 정수 중에서 임의의 정수 하나 뽑기
		// int num = (int)(Math.random() * n) + start;

		// Q1)
		// num에다가 1 ~ 6까지의 수를 하나 뽑고 저장 후 (1, 2, 3, 4, 5, 6)
		// if문 사용 -> ? 번이 나왔습니다.
		// int num = (int)(Math.random() * 6) + 1;

		int num = (int) (Math.random() * 6) + 1;

//		System.out.println(num + "번이 나왔습니다.");

		if (num == 1) {
			System.out.println(num + "번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println(num + "번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println(num + "번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println(num + "번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println(num + "번이 나왔습니다.");
		} else {
			System.out.println(num + "번이 나왔습니다.");
		}

	}

}
