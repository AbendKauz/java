package sec02.cal;

import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {

		// 2. CalculatorExample 클래스 생성
		// 위의 클래스의 필드값을 10, 5로 변경해서
		// 사칙연산 출력

		Calculator cal = new Calculator();

//		cal.num1 = 10;
//		cal.num2 = 5;
//		
//		System.out.println(cal.num1 + " + " + cal.num2 + " = " + (cal.num1 + cal.num2));
//		System.out.println(cal.num1 + " - " + cal.num2 + " = " + (cal.num1 - cal.num2));
//		System.out.println(cal.num1 + " * " + cal.num2 + " = " + (cal.num1 * cal.num2));
//		System.out.println(cal.num1 + " / " + cal.num2 + " = " + ((double)cal.num1 / cal.num2));

		// 1~100까지 랜덤으로 뽑은 수로 변경
		// 사칙연산 출력

		cal.num1 = (int) (Math.random() * 100) + 1;
		cal.num2 = (int) (Math.random() * 100) + 1;

//		System.out.println(cal.num1 + " + " + cal.num2 + " = " + (cal.num1 + cal.num2));
//		System.out.println(cal.num1 + " - " + cal.num2 + " = " + (cal.num1 - cal.num2));
//		System.out.println(cal.num1 + " * " + cal.num2 + " = " + (cal.num1 * cal.num2));
//		System.out.println(cal.num1 + " / " + cal.num2 + " = " + ((double)cal.num1 / cal.num2));

		// Calculator 클래스의 메소드를 사용하여 출력

		// 1.
//		int a = cal.pls(cal.num1, cal.num2);
//		int b = cal.min(cal.num1, cal.num2);
//		int c = cal.mul(cal.num1, cal.num2);
//		double d = cal.div(cal.num1, cal.num2);
//		
//		System.out.println(cal.num1 + " + " + cal.num2 + " = " + a);
//		System.out.println(cal.num1 + " - " + cal.num2 + " = " + b);
//		System.out.println(cal.num1 + " * " + cal.num2 + " = " + c);
//		System.out.println(cal.num1 + " / " + cal.num2 + " = " + d);

		// 2.
//		System.out.println("num1 : " + cal.num1 + ", num2 : " + cal.num2);	// 필드값 출력
//		System.out.println("더하기 : " + cal.pls(cal.num1, cal.num2));	// pls() - 더하기
//		System.out.println("빼기 : " + cal.min(cal.num1, cal.num2));		// min() - 빼기
//		System.out.println("곱하기 : " + cal.mul(cal.num1, cal.num2));	// mul() - 곱하기
//		System.out.println("나누기 : " + cal.div(cal.num1, cal.num2));	// div() - 나누기

		// 연산기호를 입력받아 해당하는 연산 수행
		// + -> 더하기
		// - -> 빼기
		// * -> 곱하기
		// / -> 나누기

		Scanner sc = new Scanner(System.in);
		System.out.println("num1 : " + cal.num1 + ", num2 : " + cal.num2);
		System.out.print("연산기호 입력 : ");

		// 1.
//		String a = sc.next();
//		switch (a){	// 입력받은 기호가 더하기, 빼기, 곱하기이면
//			case "+", "-", "*": {
//				System.out.print(cal.calcu(cal.num1, cal.num2, a));
//				break;
//			}
//			case "/": {	// 입력받은 기호가 나누기(/)이면
//				System.out.print(cal.calcu((double)cal.num1, (double)cal.num2, a));
//				break;
//			}
//			default : {	// 입력받은 값이 기호가 아니면
//				System.out.println("잘못 입력하셨습니다.");
//			}
//		}

		// 2.
		String op = sc.next();
		if (op.equals("/")) { // 입력받은 기호가 나누기(/)이면
			System.out.println(cal.calcu((double) cal.num1, (double) cal.num2, op)); // 매개변수를 double타입으로 변환 후 메소드 호출
		} else {// 입력받은 기호가 나누기(/)가 아니면
			System.out.println(cal.calcu(cal.num1, cal.num2, op)); // 그대로 메소드 호출
		}

	}

}
