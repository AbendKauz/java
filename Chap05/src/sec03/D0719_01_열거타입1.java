package sec03;

public class D0719_01_열거타입1 {

	public static void main(String[] args) {

		// 한정된 값(열거 상수)만을 저장하는 열거 타입
		// 열거타입이름 변수명;
		// 변수명 = 열거타입이름.열거상수;

		// * 열거 상수가 이름을 여러단어로 구성될 경우 단어사이에 _로 연결
		// LOGIN_SUCCESS // 관례적으로 이름 저장하는 방법

		// 열거타입 선언 (.java) 소스파일 생성
		// -> 선언하고 싶은 위치의 패키지 선택 후 마우스 오른쪽 버튼 클릭
		// new 버튼 클릭 -> Enum 클릭해서
		// 열거타입 이름 적은 후 Finish 클릭

		// 열거 타입도 참조 타입이다.
		// -> null값을 가질 수 있다.

		Week today;
		today = Week.MONDAY;

		System.out.println(today == Week.MONDAY); // true

		Week a = null; // -> null값을 가질 수 있다.

		// Week today = Week.SUNDAY;
		// 열거타입 변수 today는 스택영역에 생성
		// today 변수에 저장된 값은 Week.SUNDAY 열거 상수가 참조하고 있는 객체의 번지
		// 그래서 today == Week.SUNDAY --> True가 나옴
		// (같은 번지를 저장하고 있으므로 // 같은 Week 객체를 참조한다는 뜻)

	}

}
