package chap04;

public class Ex03 {

	public static void main(String[] args) {

		// 2개의 주사위를 던졌을 때 나오는 눈 출력
		// (눈1, 눈2)
		// 눈의 합이 5가 아니면 계속 던지고
		// 눈의 합이 5면 실행을 멈추는 코드 작성
		// (while문과 Math.random() 메소드 사용)

		while (true) {
			int num1 = (int) (Math.random() * 6 + 1);
			int num2 = (int) (Math.random() * 6 + 1);
			System.out.println("(" + num1 + ", " + num2 + ")");
			if (num1 + num2 == 5) {
				break;
			}
		}

	}

}
