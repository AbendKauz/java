package sec02.cal;

public class Calculator {

	// 1. Calculator 클래스 -> 계산기 클래스
	// 필드(2개) -> int 타입으로(num1, num2)

	int num1;
	int num2;

	// 리턴타입이 있는 메소드 4개를 생성
	// -> pls, min, mul, div

//	int pls(int a, int b) {	// 더하기
//		return a + b;
//	}
//	
//	int min(int a, int b) {	// 빼기
//		return a - b;
//	}
//	
//	int mul(int a, int b) {	// 곱하기
//		return a * b;
//	}
//	
//	double div(int a, int b) {	// 나누기
//		return (double)a / b;
//	}

	int pls(int a, int b) { // 더하기
		return a + b;
	}

	int min(int a, int b) { // 빼기
		return a - b;
	}

	int mul(int a, int b) { // 곱하기
		return a * b;
	}

	double div(int a, int b) { // 나누기
		return (double) a / b;
	}

	// 메소드(매개변수 3개 (num1, num2, 연산기호_연산기호에 따라 계산)
	// 리턴타입 있는 메소드)

	int calcu(int num1, int num2, String op) {
		if (op.equals("+")) { // 기호가 더하기 이면
			System.out.print("더하기 : "); // "더하기 : " 출력 후
			return num1 + num2; // num1 + num2 연산 수행 후 결과값을 리턴
		} else if (op.equals("-")) {
			System.out.print("빼기 : ");
			return num1 - num2;
		} else if (op.equals("*")) {
			System.out.print("곱하기 : ");
			return num1 * num2;
		}
		return 0; // if문의 조건이 아무것도 맞지 않으면 0으로 리턴
	}

	// 나누기 시 소숫점을 표현하기 위해 오버로딩 사용
	double calcu(double num1, double num2, String op) {
		System.out.print("나누기 : ");
		return num1 / num2;
	}

}
