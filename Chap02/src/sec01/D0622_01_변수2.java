package sec01;

public class D0622_01_변수2 {
	public static void main(String[] args) {

		// 교재 p.51

		int value; // int 타입의 value 변수 선언

		int result; // int 타입의 result 변수 선언

		// result라는 변수에 value + 10 저장하고 싶다면???
		// -> value의 값을 먼저 초기화해줘야 함
		// 그렇지 않으면 컴파일 에러 발생
		value = 4; // value 초기화
		result = value + 10;

		// 아래 두 코드는 같은 값(14)을 출력
		System.out.println(result);
		System.out.println(value + 10);

		// 변수에는 여러개의 값이 들어갈 수 있나요???
		int num = 14; // int 타입의 num 변수 선언 후 14라는 값으로 초기화

		num = 74;
		num = 45;
		num = 65;
		System.out.println(num);

	}
}
