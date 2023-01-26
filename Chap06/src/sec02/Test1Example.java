package sec02;

public class Test1Example {

	public static void main(String[] args) {

		// 클래스 외부에서 필드를 사용하는 경우
		// 1. 클래스로부터 객체를 생성
		Test1 a = new Test1(); // 객체 생성

		// 2. 값을 읽거나 변경할 때 -> 도트연산자(.)를 활용
		// 변수명.필드
		System.out.println(a.num); // 필드 읽어오기
		System.out.print("필드 값을 변경 : ");
		a.num = 10; // 필드값 변경
		System.out.println(a.num);

		System.out.println(a.method());

	}

}
