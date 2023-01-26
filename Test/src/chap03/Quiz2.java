package chap03;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		// 1. 클래스명 Quiz2 로 생성
		// 2. 정수를 키보드로 입력받아 int 타입의 변수 num 에 넣으시오.
		// 3. int 타입 a를 선언하여 num 값 중에서 백의 자리 이하를 버린 값으로 초기화를 하시오.
		// (산술연산자를 활용)
		// 4. a 의 값을 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
//		// 1)
//		int a = (num / 100) * 100;

//		// 2)
		int a = num - (num % 100);
		System.out.println(num + "에서 백의 자리 이하를 버리면? : " + a);

	}

}
