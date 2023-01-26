package sec01;

public class D0706_02_switch문1 {

	public static void main(String[] args) {

		// switch 문
		// -> if문과 마찬가지로 조건 제어문
		// -> if(조건식) // switch(변수) -> 변수가 어떤 값을 갖는지에 따라 실행문이 선택됨

		// 1 ~ 6까지의 수를 하나 뽑아서 num에 저장 후
		// switch문 사용 -> ? 번이 나왔습니다.

		int num = (int) (Math.random() * 6) + 1;

		// switch문의 case의 끝에는 break가 있어야 함
		// 없을 시 계속 내려감
		// ex) 3이 나올 경우 -> 3, 4, 5, default 다 실행됨
		switch (num) {
		case 1:
			System.out.println(num + "번이 나왔습니다.");
			break;
		case 2:
			System.out.println(num + "번이 나왔습니다.");
			break;
		case 3:
			System.out.println(num + "번이 나왔습니다.");
			break;
		case 4:
			System.out.println(num + "번이 나왔습니다.");
			break;
		case 5:
			System.out.println(num + "번이 나왔습니다.");
			break;
		default:
			System.out.println(num + "번이 나왔습니다.");
		}

	}

}
