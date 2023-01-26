package sec01;

public class D0621_01_변수선언 {

	public static void main(String[] args) {

		// * 변수 선언
		// 데이터 타입 변수명 ; -> int age; double value;

		// Q1)1. 데이터 타입이 int인 변수 num을 선언하기
		int num;

		// Q1)2. num에 데이터 값을 10을 넣기 ( = 이라는 기호 사용)
		// 값을 넣고자 하는 변수명을 쓰고 ' = ' 넣어야 할 데이터(값)을 적는다.
		num = 10;

		// Q1)3. num의 값을 console창에 출력하기
		// System.out.println("java"); -> 문자열은 출력 시 "문자열" 필요
		System.out.println(num); // 콘솔에 값을 출력하기

		// Q2)
		// 1. String 타입의 name 변수 선언
		String name;

		// 2. name 변수에 본인의 이름 저장하기 -> "이름"
		name = "김준영";

		// 3. name의 값을 console창에 출력
		System.out.println(name);
	}

}
