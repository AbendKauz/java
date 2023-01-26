package sec01;

public class D0706_02_switch문2 {

	public static void main(String[] args) {

		// int 타입의 변수 time의 초기값으로 8~11중에서 하나의 수를
		// 무작위로 뽑고, 선언과 동시에 초기화하세요.
		// 각 시각에 정해둔 문구를 출력하여 어래와 같은 실행 결과가 나오도록
		// 프로그램을 만들어보세요(switch문 사용)

		// <문구내용>
		// 8 : "출근합니다."
		// 9 : "회의를 합니다."
		// 10 : "업무를 봅니다."
		// 그 외 : "외근을 나갑니다."

		int time = (int) (Math.random() * 4) + 8;

		System.out.println("[현재시각 : " + time + "시]");

		switch (time) {
		case 8:
			System.out.println("출근합니다.");
			break;
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
			break;
		default:
			System.out.println("외근을 나갑니다.");
			break;
		}

	}

}
