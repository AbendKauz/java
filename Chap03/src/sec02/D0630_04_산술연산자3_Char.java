package sec02;

public class D0630_04_산술연산자3_Char {

	public static void main(String[] args) {

		// char 타입의 산술연산

//		char c1 = 'A' + 1;
//		System.out.println(c1);
		char c2 = 'A';
//		char c3 = c2 + 1;	//	char 변수가 산술연산 -> int 타입으로 변환
		// --> 컴파일 에러
		char c3 = (char) (c2 + 1); // c3 -> B가 저장 (강제타입변환)
//		int c3 = c2 + 1;		// 66
		System.out.println(c3); // B

	}

}
