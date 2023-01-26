package sec02;

public class D0627_04_float_double {

	public static void main(String[] args) {

		// 교재 p.66

		// 실수값 -> 1. 소수점 2. 알파벳 e, E

		// 실수값 저장
		// float (4byte) / double (8byte)

//		float var1 = 31.4;	// java의 실수 기본타입 : double 이라 error
//		float var1 = 31.4f;	// f 또는 F 로 float 인식
//		double var2 = 31.4;	// 변수의 타입을 double 로 변경

		// 정밀도
		float var3 = 0.1234567890123456789f;
		double var4 = 0.1234567890123456789;

		System.out.println("var3의 값은 : " + var3); // 0.12345679
		System.out.println("var4의 값은 : " + var4); // 0.12345678901234568

		// e 또는 E 사용하기
		double var5 = 3e4; // 3 x 10⁴ = 30000.0
		System.out.println("var5의 값은 : " + var5);

	}

}
