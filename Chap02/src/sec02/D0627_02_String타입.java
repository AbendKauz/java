package sec02;

public class D0627_02_String타입 {

	public static void main(String[] args) {

//		char a = 'a';
//		char a1 = "a";		// char타입은 '' 로 묶어야 함
//		char a3 = 'abcd';	// 			 하나의 문자만 저장해야 함
		String a3 = "abcd";
		System.out.println(a3);

		// char : 단 하나의 문자를 저장 (' ') -> 기본타입_정수형
		// String : 여러개의 문자가 모인 문자열을 저장 (" ") -> 클래스타입(6장)

		String var1 = "A";
		System.out.println(var1);

		String name = "김준영";
		System.out.println(name);

		// 콘솔창에 "김준영" 기호까지 출력
		String name1 = "\"김준영\"";
		System.out.println(name1);

		// 콘솔창에 나는 "자바"를 좋아한다 출력
		System.out.println("나는 \"자바\"를\t좋아\n한다.");

	}

}
