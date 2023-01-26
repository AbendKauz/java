package sec01.exam06;

public class ExitExample {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				// i가 5가 되면
				System.exit(0);
				// 일반적으로 정상종료일 경우 매개값을 0으로 줌
				// break;
			}
		}
		System.out.println("마무리 코드");
		// 강제종료되므로 출력문이 출력되지 않음
		// 꼭 출력하고 싶다면 exit(0)대신 break 사용해야함
	}

}
