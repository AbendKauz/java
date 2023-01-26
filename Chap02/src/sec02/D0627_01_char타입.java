package sec02;

public class D0627_01_char타입 {

	public static void main(String[] args) {

		char c1 = 'A';
		System.out.println(c1); // A를 출력

		char c2 = 65;
		System.out.println(c2); // A

		char c3 = '가';
		System.out.println(c3);

		int num1 = 'A';
		System.out.println(num1); // A의 유니코드 65 출력

		// * char 타입 변수에 저장하면 자동으로 문자로 매핑되어 출력
		// * int 타입 변수에 저장하면 유니코드 자체가 출력

		char c4 = 'A' + 1;
		System.out.println(c4); // B

	}

}
