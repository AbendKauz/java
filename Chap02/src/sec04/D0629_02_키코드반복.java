package sec04;

public class D0629_02_키코드반복 {

	public static void main(String[] args) throws Exception {

		int keyCode;

		// while 반복문 1
//		while (true) {	// 계속 반복이 이루어져서 실행이 종료되지 않음
		// terminate(빨간버튼) 눌러서 강제로 종료함
//			keyCode = System.in.read();
//			System.out.println("키코드 값 : " + keyCode);
//		}

		// 반복문
//		while (true) {
//			System.out.println("실행");
//		}

		// while 반복문 2
		// 무한 반복을 하는데, 이때 q가 입력되면 반복문 중지 (실행종료)
		while (true) {
			keyCode = System.in.read();
			System.out.println("키코드 값 : " + keyCode);

			// 저장된 keyCode 값이 q의 키코드(113) 같다면
			// 반복문 while을 종료
			if (keyCode == 113) { // 저장된 keyCode 값이 q의 키코드(113) 같다면
				break; // 반복문 종료
			}
		}
		System.out.println("반복문 종료");

	}

}
